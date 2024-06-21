public class QuadraticEquation {
    private double a ,b ,c;
    public QuadraticEquation (double a , double b , double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double calculateDelta(){
        return b * b  - 4 * a * c ;
    }
    public  double [] calculateRoots() {
        double delta = calculateDelta();
        if(delta > 0){
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return  new double[] {root1 , root2};
        } else if(delta ==0){
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            return null ;
        }
    }
    public void displayEquation() {
        System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");
    }
}
