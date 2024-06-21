//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.5 ,"pink");
        System.out.println("radius of the circle : " +c1.getRadius());
        System.out.println("area of circle :" + c1.getArea());
        System.out.println("radius of the circle : " + c2.getRadius());
        System.out.println("area of circle :"+ c2.getArea());
        }
    }
