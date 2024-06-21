import java.util.Scanner;

public class SolveFirstDegreeEquations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter a : " );
        a = scanner.nextDouble();
        System.out.println("Enter b : " );
        b = scanner.nextDouble();
        System.out.println("Enter c : " );
        c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
