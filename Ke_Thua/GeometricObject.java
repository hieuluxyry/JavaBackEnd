public class GeometricObject {
private String color ="white";
private  String filled = null;
public GeometricObject(){}
    public GeometricObject(String color , String filled){
    this.color = color ;
    this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFilled() {
        return filled;
    }

    public void setFilled(String filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", filled='" + filled + '\'' +
                '}';
    }
}
