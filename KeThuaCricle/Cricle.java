public class Cricle {
    private  double radius  = 5.0;
    private  String color = "pink" ;
    public Cricle(){};
    public  Cricle(double radius , String color){
        this.radius = radius ;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return 2 * radius * Math.PI;
    }
}
