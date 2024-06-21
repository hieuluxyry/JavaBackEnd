public class StaffWorkshop extends Staff {
    protected String workshopID;
    public StaffWorkshop(int id, String name, String phone, String role, String workshopID) {
        super(id, name, phone, role);
        this.workshopID = workshopID;
    }

    public String getWorkshopID() {
        return workshopID;
    }

    public void setWorkshopID(String workshopID) {
        this.workshopID = workshopID;
    }
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("ID: " + Id);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Role: " + role);
        System.out.println("Workshop ID: " + workshopID);
    }
    @Override
    public String toCSV() {
        return Id +"," + name + "," + phone + "," + role + "," + workshopID + "StaffWorkshop";
    }
}
