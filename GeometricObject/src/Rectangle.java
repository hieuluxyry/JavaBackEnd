public class Rectangle extends  Shape{
    private  double width = 4.0;
    private  double height = 8.0;

    public  Rectangle() {}

    public  Rectangle (double width , double height){
        this.width = width ;
        this.height = height;
    }

    public  Rectangle(double width , double height ,  String color,boolean filled ){
        super(color,filled);
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        return  width * height;
    }
    public double getPerimeter(){
        return 2 *(width*height);
    }

    @Override
    public String toString() {
        return " A Rectangle with width = " +
                 + getWidth() +
                ", and height = " + getHeight() + ", which is a subclass of " +super.toString();

    }
}
