// NumberGenerator.java
public class NumberGenerator implements Runnable {
    @Override
    public void run() {
        // Lặp qua 10 số tự nhiên đầu tiên
        for (int i = 0; i < 10; i++) {
            System.out.println("Number: " + i + ", hashCode: " + this.hashCode());
            try {
                // Dừng 500 milliseconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

