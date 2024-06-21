import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("./src/Sum.txt");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFileText();
    }
}
