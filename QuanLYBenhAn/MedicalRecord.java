import java.time.LocalDate;

public abstract class MedicalRecord {
    protected int recordNumber;
    protected String medicalRecordCode;
    protected String patientCode;
    protected String patientName;
    protected LocalDate hospitalizedDay;
    protected LocalDate dischargeDay;
    protected String ReasonForHospitalization;

    // Constructor
    public MedicalRecord(int recordNumber, String medicalRecordCode, String patientCode, String patientName,
                         LocalDate hospitalizedDay, LocalDate dischargeDay, String admissionReason) {
        this.recordNumber = recordNumber;
        this.medicalRecordCode = medicalRecordCode;
        this.patientCode = patientCode;
        this.patientName = patientName;
        this.hospitalizedDay = hospitalizedDay;
        this.dischargeDay = dischargeDay;
        this.ReasonForHospitalization = ReasonForHospitalization;
    }

    // Abstract method to convert to CSV format
    public abstract String toCSV();

    // Getters and setters
    public int getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(int recordNumber) {
        this.recordNumber = recordNumber;
    }

    public String getMedicalRecordCode() {
        return medicalRecordCode;
    }

    public void setMedicalRecordCode(String medicalRecordCode) {
        this.medicalRecordCode = medicalRecordCode;
    }

    public String getPatientCode() {
        return patientCode;
    }

    public void setPatientCode(String patientCode) {
        this.patientCode = patientCode;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public LocalDate getHospitalizedDay() {
        return hospitalizedDay;
    }

    public void setHospitalizedDay(LocalDate hospitalizedDay) {
        this.hospitalizedDay = hospitalizedDay;
    }

    public LocalDate getDischargeDay() {
        return dischargeDay;
    }

    public void setDischargeDay(LocalDate dischargeDay) {
        this.dischargeDay = dischargeDay;
    }

    public String getReasonForHospitalization() {
        return ReasonForHospitalization;
    }

    public void setReasonForHospitalization(String reasonForHospitalization) {
        ReasonForHospitalization = reasonForHospitalization;
    }
}

