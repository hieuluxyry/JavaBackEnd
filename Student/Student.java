class Student {
    private int id;
    private String name;
    private String email;
    private double GPA;

    public Student(int id, String name, String email, double GPA) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.GPA = GPA;
    }

    // Getter và Setter cho các thuộc tính
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    // Phương thức để lấy thông tin của sinh viên
    public String getInfo() {
        return "ID: " + id + ", Name: " + name + ", Email: " + email + ", GPA: " + GPA;
    }
}






