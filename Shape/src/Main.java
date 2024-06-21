import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Triangle triangle = new Triangle(4,6,7);

        System.out.println("Triangle color: " + triangle.getColor());
        System.out.println("Triangle filled: " + triangle.isFilled());
        System.out.println("Triangle edge : " +triangle.toString());
        System.out.println("Triangle area: " + triangle.getArea());
        System.out.println("Triangle perimeter: " + triangle.getPerimeter());

    }
}