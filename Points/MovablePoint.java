public class MovablePoint  extends  Point{
    private  float xSpeed = 6.0f;
    private  float ySpeed = 9.0f;
    public MovablePoint(){
     super();
     this.xSpeed = 0.0f;
     this.ySpeed = 0.0f;
    }
    public MovablePoint(float x , float y , float xSpeed , float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public  MovablePoint( float xSpeed , float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public  MovablePoint move(){
        xSpeed += xSpeed;
        ySpeed += ySpeed;
        return this ;
    }

    @Override
    public String toString() {
        return super.toString() + " speed = (" + xSpeed + "," +ySpeed + ")";
    }
}
