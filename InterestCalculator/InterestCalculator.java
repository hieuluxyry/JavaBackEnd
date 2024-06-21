import java.awt.*;
import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double money = 1.0;
        double month = 1;
        double interestRate = 1.0;
        System.out.println("enter number money : ");
        money = input.nextDouble();
        System.out.println("enter the number of month :");
        month = input.nextDouble();
        System.out.println("enter number interest rate : ");
        interestRate = input.nextDouble();
        double totalInterest = 0;
        for( int i =0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 *month ;
        }
        System.out.println("Total of interest: " +totalInterest);
}
}
