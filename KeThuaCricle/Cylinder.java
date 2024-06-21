public class Cylinder  extends  Cricle{
    private  double height ;
    public Cylinder (){

    }
    public Cylinder(double height){
        this.height = height;
    }
    public Cylinder(double radius ,String color, double height  ){
        super(radius,color);
        this.height = height ;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume() {
        return getArea() * height;
    }
}
