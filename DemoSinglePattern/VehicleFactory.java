public class VehicleFactory {
 public VehicleFactory() {
 }
 public Vehicle createVehicle(String type) {
  switch (type) {
   case "Car":
    return new Car(1, "car");
   case "Bike":
    return new Bike(1, "bike");
   case "MotoBike":
    return new MotoBike(1, "motorbike");
   default:
    System.out.println("Invalid type: " + type);
    return null;
  }
 }
}
