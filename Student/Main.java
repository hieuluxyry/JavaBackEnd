public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0]=new Student(1,"nam","nam@gmail.com",9);
        students[1]=new Student(2,"bao","bao@gmail.com",8);
        students[2]=new Student(3,"Kevin","tien@gmail.com",1);
        students[3]=new Student(4,"Peter","quoc@gmail.com",3);
        students[4]=new Student(5,"Jons","trang@gmail.com",10);
        int count=0;
        for (Student student : students) {
            if(student!=null) {
                System.out.println(student.getInfo());
            }
            if (student.getGPA() > 8.0) {
                count++;
            }
        }
        System.out.println("so luong hoc vien co GPA lon hon 8.0 la: "+count);
    }
}

