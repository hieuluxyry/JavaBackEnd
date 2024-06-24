import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class MedicalRecordManagementSystem {
    private static final String FILE_PATH = "data/medical_records.csv";
    private static int lastRecordNumber = 0;
    private static List<MedicalRecord> medicalRecords = new ArrayList<>();

    public void run() {
        loadMedicalRecords(); // Load existing records from file
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addNewMedicalRecord(scanner);
                    break;
                case 2:
                    deleteMedicalRecord(scanner);
                    break;
                case 3:
                    displayMedicalRecords();
                    break;
                case 4:
                    saveMedicalRecords(); //
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        }
    }

    private void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Add new medical record");
        System.out.println("2. Delete a medical record");
        System.out.println("3. Display all medical records");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private void addNewMedicalRecord(Scanner scanner) {
        try {
            MedicalRecord medicalRecord = inputMedicalRecord(scanner);
            medicalRecords.add(medicalRecord);
            System.out.println("Medical record added successfully.");
        } catch (InputMismatchException | IllegalArgumentException | DuplicateMedicalRecordException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private MedicalRecord inputMedicalRecord(Scanner scanner) throws DuplicateMedicalRecordException {
        System.out.println("Enter medical record details:");
        System.out.print("Medical record code (BA-XXX): ");
        String medicalRecordCode = scanner.nextLine().trim();
        if (!medicalRecordCode.matches("BA-\\d{3}")) {
            throw new IllegalArgumentException("Medical record code format is incorrect (BA-XXX).");
        }
        if (isDuplicateMedicalRecordCode(medicalRecordCode)) {
            throw new DuplicateMedicalRecordException("Medical record already exists.");
        }

        System.out.print("Patient code (BN-XXX): ");
        String patientCode = scanner.nextLine().trim();
        if (!patientCode.matches("BN-\\d{3}")) {
            throw new IllegalArgumentException("Patient code format is incorrect (BN-XXX).");
        }

        System.out.print("Patient name: ");
        String patientName = scanner.nextLine().trim();

        System.out.print("hospitalizedDay(dd/MM/yyyy): ");
        LocalDate admissionDate = DateUtils.parseDate(scanner.nextLine().trim());

        System.out.print("dischargeDay(dd/MM/yyyy): ");
        LocalDate dischargeDate = DateUtils.parseDate(scanner.nextLine().trim());
        if (!DateUtils.isDateBeforeOrEqual(admissionDate, dischargeDate)) {
            throw new IllegalArgumentException("Admission date must be before or equal to discharge date.");
        }

        System.out.print("ReasonForHospitalization: ");
        String admissionReason = scanner.nextLine().trim();

        System.out.print("Is this a VIP patient (Y/N): ");
        String vipChoice = scanner.nextLine().trim().toUpperCase();
        if (vipChoice.equals("Y")) {
            System.out.print("VIP Type (VIP I, VIP II, VIP III): ");
            String vipType = scanner.nextLine().trim();
            if (!vipType.equals("VIP I") && !vipType.equals("VIP II") && !vipType.equals("VIP III")) {
                throw new IllegalArgumentException("Invalid VIP type.");
            }
            System.out.print("VIP End Date (dd/MM/yyyy): ");
            LocalDate vipEndDate = DateUtils.parseDate(scanner.nextLine().trim());

            lastRecordNumber++;
            return new VIPMedicalRecord(lastRecordNumber, medicalRecordCode, patientCode, patientName,
                    admissionDate, dischargeDate, admissionReason, vipType, vipEndDate);
        } else {
            System.out.print("Hospital Fee: ");
            double hospitalFee = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character

            lastRecordNumber++;
            return new NormalMedicalRecord(lastRecordNumber, medicalRecordCode, patientCode, patientName,
                    admissionDate, dischargeDate, admissionReason, hospitalFee);
        }
    }

    private boolean isDuplicateMedicalRecordCode(String medicalRecordCode) {
        for (MedicalRecord record : medicalRecords) {
            if (record.getMedicalRecordCode().equals(medicalRecordCode)) {
                return true;
            }
        }
        return false;
    }

    private void deleteMedicalRecord(Scanner scanner) {
        System.out.print("Enter medical record code to delete: ");
        String medicalRecordCodeToDelete = scanner.nextLine().trim();

        Iterator<MedicalRecord> iterator = medicalRecords.iterator();
        while (iterator.hasNext()) {
            MedicalRecord record = iterator.next();
            if (record.getMedicalRecordCode().equals(medicalRecordCodeToDelete)) {
                System.out.print("Are you sure you want to delete this medical record? (Yes/No): ");
                String confirm = scanner.nextLine().trim().toLowerCase();
                if (confirm.equals("yes")) {
                    iterator.remove();
                    System.out.println("Medical record deleted successfully.");
                } else {
                    System.out.println("Deletion canceled.");
                }
                return;
            }
        }
        System.out.println("Medical record not found.");
    }

    private void displayMedicalRecords() {
        System.out.println("Medical Records:");
        for (MedicalRecord record : medicalRecords) {
            System.out.println(record.toCSV());
        }
    }

    private void loadMedicalRecords() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                MedicalRecord record = parseMedicalRecord(line);
                medicalRecords.add(record);
                lastRecordNumber = record.getRecordNumber(); // Update last record number
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    private MedicalRecord parseMedicalRecord(String line) {
        String[] fields = line.split(",");
        int recordNumber = Integer.parseInt(fields[0]);
        String medicalRecordCode = fields[1];
        String patientCode = fields[2];
        String patientName = fields[3];
        LocalDate admissionDate = LocalDate.parse(fields[4]);
        LocalDate dischargeDate = LocalDate.parse(fields[5]);
        String admissionReason = fields[6];

        if (fields.length == 8) { // VIP Medical Record
            String vipType = fields[7];
            LocalDate vipEndDate = LocalDate.parse(fields[8]);
            return new VIPMedicalRecord(recordNumber, medicalRecordCode, patientCode, patientName,
                    admissionDate, dischargeDate, admissionReason, vipType, vipEndDate);
        } else { // Normal Medical Record
            double hospitalFee = Double.parseDouble(fields[7]);
            return new NormalMedicalRecord(recordNumber, medicalRecordCode, patientCode, patientName,
                    admissionDate, dischargeDate, admissionReason, hospitalFee);
        }
    }

    private void saveMedicalRecords() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_PATH))) {
            for (MedicalRecord record : medicalRecords) {
                writer.println(record.toCSV());
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}

