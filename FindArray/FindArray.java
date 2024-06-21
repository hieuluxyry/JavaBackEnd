import java.util.Scanner;

public class FindArray {
    public static void main(String[] args) {
         String[] student = {"Kevin", "Peter","linda","Tom","Jerry","John", "Mit","Luka"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name :");
        String input_name = scanner.nextLine();
        boolean ChẹckName = false ;
        for (int i =0;i<student.length;i++) {
            if (student[i].equals(input_name)) {
                System.out.println("name location :" + input_name +" "+  i);
                ChẹckName = true;
                break;
            }
        }
        if (!ChẹckName) {
            System.out.println("Not found" + input_name + " in the list.");
        }
    }
}
