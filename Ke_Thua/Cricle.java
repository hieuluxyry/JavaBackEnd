public class Cricle extends GeometricObject{
    private double radius ;
    public Cricle (){}
    public Cricle (double radius){
        this.radius = radius;
    }
    public Cricle(double radius ,String color,String filled){
        this.radius =radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public  double getArea(){
        return  radius * radius * Math.PI;
    }
    public  double getPerimeter(){
        return 2*radius*Math.PI;
    }
    public void printCircle(){
        System.out.println("the"+getColor()+ "\" circle is created with the radius is" +  radius);
    }
}
