import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Enter type vehicle(Car,Bike , MotorBike )");
      Scanner scanner = new Scanner(System.in);
      String type = scanner.nextLine();
      VehicleFactory vehicleFactory = new VehicleFactory();
      Vehicle vehicle = vehicleFactory.createVehicle(type);
      vehicle.run();
    }
}
