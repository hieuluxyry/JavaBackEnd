public class StaffOffice extends Staff {
    public StaffOffice(int id, String name, String phone, String role) {
        super(id, name, phone,role);
    }
    @Override
    public String toCSV() {
        return super.toCSV() + "staffOffice";
    }
}
