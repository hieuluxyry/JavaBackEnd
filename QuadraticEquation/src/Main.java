//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       QuadraticEquation equation = new QuadraticEquation(2, 4,1);
        equation.displayEquation();
        System.out.println("Delta : " +equation.calculateDelta());
        double [] roots = equation.calculateRoots();
        if (roots != null){
            System.out.println("Root : ");
            for(double root : roots){
                System.out.println(root);
            }
        } else {
            System.out.println(" No real roots.");
        }

    }
}