public class Main {
    public static final int DISTANCE = 100; // The total distance for the race
    public static final int STEP = 10;     // The step size for each log progress

    public static void main(String[] args) {
        Thread car1 = new Thread(new Car("A"));
        Thread car2 = new Thread(new Car("B"));
        Thread car3 = new Thread(new Car("C"));

        car1.start();
        car2.start();
        car3.start();
    }
}