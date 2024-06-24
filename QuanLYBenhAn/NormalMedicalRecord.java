import java.time.LocalDate;

public class NormalMedicalRecord extends MedicalRecord {
    private double hospitalFee;

    // Constructor
    public NormalMedicalRecord(int recordNumber, String medicalRecordCode, String patientCode, String patientName,
                               LocalDate admissionDate, LocalDate dischargeDate, String admissionReason,
                               double hospitalFee) {
        super(recordNumber, medicalRecordCode, patientCode, patientName, admissionDate, dischargeDate, admissionReason);
        this.hospitalFee = hospitalFee;
    }

    @Override
    public String toCSV() {
        return String.format("%d,%s,%s,%s,%s,%s,%s,%.2f", recordNumber, medicalRecordCode, patientCode, patientName,
                hospitalizedDay.toString(), dischargeDay.toString(), ReasonForHospitalization, hospitalFee);
    }

    // Getters and setters
    public double getHospitalFee() {
        return hospitalFee;
    }

    public void setHospitalFee(double hospitalFee) {
        this.hospitalFee = hospitalFee;
    }
}
