public class Main {
    public static void main(String[] args) {
        Cricle cricle = new Cricle(5);
        System.out.println("A cricle :" + cricle.toString());
        System.out.println("The radius is : " + cricle.getRadius());
        System.out.println("The color is :" + cricle.getColor());
        System.out.println("the area is :" + cricle.getArea());
        System.out.println("The perimeter is :" + cricle.getPerimeter());
        System.out.println();

        Rectangle rectangle = new Rectangle(4,5);
        System.out.println(" A rectangle : " + rectangle.toString());
        System.out.println("with of rectangle : " + rectangle.getWidth());
        System.out.println("height of rectangle :" + rectangle.getHeight());
        System.out.println("the area is " + rectangle.getArea());
        System.out.println("the perimeter is " + rectangle.getPerimeter());
        System.out.println();
    }
}
