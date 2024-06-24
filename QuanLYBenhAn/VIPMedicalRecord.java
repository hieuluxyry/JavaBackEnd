import java.time.LocalDate;

public class VIPMedicalRecord extends MedicalRecord {
    private String vipType;
    private LocalDate vipEndDate;

    // Constructor
    public VIPMedicalRecord(int recordNumber, String medicalRecordCode, String patientCode, String patientName,
                            LocalDate admissionDate, LocalDate dischargeDate, String admissionReason,
                            String vipType, LocalDate vipEndDate) {
        super(recordNumber, medicalRecordCode, patientCode, patientName, admissionDate, dischargeDate, admissionReason);
        this.vipType = vipType;
        this.vipEndDate = vipEndDate;
    }

    @Override
    public String toCSV() {
        return String.format("%d,%s,%s,%s,%s,%s,%s,%s,%s", recordNumber, medicalRecordCode, patientCode, patientName,
                hospitalizedDay.toString(), dischargeDay.toString(), ReasonForHospitalization, vipType, vipEndDate.toString());
    }

    // Getters and setters
    public String getVipType() {
        return vipType;
    }

    public LocalDate getVipEndDate() {
        return vipEndDate;
    }
}

