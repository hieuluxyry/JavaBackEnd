public class StaffShipper extends Staff {
    protected String car;

    public StaffShipper(int id, String name, String phone, String role, String car) {
        super(id, name, phone, role);
        this.car = car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getCar() {
        return car;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("ID: " + Id);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Role: " + role);
        System.out.println("Car: " + car);
    }

    @Override
    public String toCSV() {
        return Id + "," + name + "," + phone + "," + role + "," + car + "StaffShipper";
    }
}

