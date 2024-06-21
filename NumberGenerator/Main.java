// Main.java
public class Main {
    public static void main(String[] args) {
        // Tạo hai đối tượng NumberGenerator
        NumberGenerator generator1 = new NumberGenerator();
        NumberGenerator generator2 = new NumberGenerator();

        // Tạo hai đối tượng Thread với NumberGenerator
        Thread thread1 = new Thread(generator1);
        Thread thread2 = new Thread(generator2);

        // Đặt ưu tiên cho các luồng
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        // Bắt đầu các luồng
        thread1.start();
        thread2.start();
    }
}

