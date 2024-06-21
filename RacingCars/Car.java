import java.util.Random;

public class Car implements Runnable {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int runDistance = 0;
        long startTime = System.currentTimeMillis();

        while (runDistance < Main.DISTANCE) {
            try {
                // Generate speed between 0 and 19
                int speed = (new Random()).nextInt(20);
                runDistance += speed;

                // Calculate the percent traveled
                int percentTravel = (runDistance * 100) / Main.DISTANCE;

                // Construct the log for the current progress
                StringBuilder log = new StringBuilder("|");
                for (int i = 0; i < 100; i += Main.STEP) {
                    if (percentTravel >= i + Main.STEP) {
                        log.append("=");
                    } else if (percentTravel >= i && percentTravel < i + Main.STEP) {
                        log.append("o");
                    } else {
                        log.append("-");
                    }
                }
                log.append("|");

                // Print the current progress
                System.out.println("Car " + this.name + ": " + log + " " + Math.min(Main.DISTANCE, runDistance) + "KM");

                // Sleep for 1 second
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car " + this.name + " broken...");
                break;
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Car " + this.name + " finished in " + (endTime - startTime) / 1000 + "s");
    }
}
