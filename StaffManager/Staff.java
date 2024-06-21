public class Staff {
    protected int Id;
    protected String name;
    protected String phone;
    protected String role;

    public Staff(int Id, String name, String phone, String role) {
        this.Id = Id;
        this.name = name;
        this.phone = phone;
        this.role = role;
    }

    public int getId() {
        return Id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return phone;
    }

    public void setRole(String role) {
        this.role = role;
    }
    public String getRole() {
        return role;
    }
    public void hienThiThongTin() {
        System.out.println("ID: " + Id + ", Name: " + name + ", Phone: " + phone + ", Role: " + role);
    }
    public String toCSV() {
        return Id + "," + name + "," + phone + "," + role;
    }
}
