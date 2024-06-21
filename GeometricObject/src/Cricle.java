public class Cricle  extends  Shape{
    private  double radius = 1.0;
    public  Cricle(){}
    public  Cricle(double radius){
        this.radius =radius;
    }
    public  Cricle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public  double getPerimeter(){
        return  2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return " A Cricle with radius =  " +
                  getRadius() +",which is subclass of " + super.toString();

    }
}
