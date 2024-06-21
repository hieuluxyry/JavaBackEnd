//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
             Student.change();
             Student s1 = new Student(15 , "Peter");
             Student s2 = new Student(19 , "Linda");
             Student s3 = new Student(99 , "Kevin");
             s1.display();
             s2.display();
             s3.display();
    }
}