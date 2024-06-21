//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1.toString());
        Student student2 = new Student("Kevin", "C14");
        System.out.println(student2.toString());
    }
}
