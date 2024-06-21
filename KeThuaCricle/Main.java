public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(7,"pink",5);
        System.out.println("Radius: " + cylinder.getRadius());
        System.out.println("Color: " + cylinder.getColor());
        System.out.println("Height: " + cylinder.getHeight());
        System.out.println("Volume: " + cylinder.getVolume());
    }
}
