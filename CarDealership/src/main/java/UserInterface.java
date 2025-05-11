import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private Scanner sc = new Scanner(System.in);
    private Dealership dealership;
    private List<Vehicle> vehicles;
    private DealershipFileManager fileManager = new DealershipFileManager();

    public UserInterface() {
    }

    private void init(){
        DealershipFileManager manager = new DealershipFileManager();
        this.dealership = manager.getDealership(); // загружаем дилершип с файла
    }
    public void display(){
        init();
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean run = true;
    }

    public void processGetByPriceRequest(){
        System.out.print("Enter min range:");
        int min = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter max range: ");
        int max = sc.nextInt();
        sc.nextLine();
        vehicles =  Dealership.getVehiclesByPrice(min, max);
        displayFormat(vehicles);
    }
    public void processGetByModelrequest(){
        System.out.print("Enter make:");
        String make = sc.nextLine();
        System.out.print("Enter model: ");
        String model = sc.nextLine();
        vehicles = Dealership.getVehiclesByMakeModel(make, model);
        displayFormat(vehicles);
    }
    public void processGetByYearRequest(){
        System.out.print("Enter min range:");
        int minYear = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter max range: ");
        int maxYear = sc.nextInt();
        sc.nextLine();
        vehicles =  Dealership.getVehiclesByYear(minYear, maxYear);
        displayFormat(vehicles);
    }
    public void processGetByColorRequest(){
        System.out.print("Enter color:");
        String color = sc.nextLine();
        vehicles = Dealership.getVehiclesByColor(color);
        displayFormat(vehicles);
    }
    public void processGetByMileageRequest(){
        System.out.print("Enter min mileage range: ");
        int minMileage = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter max mileage range: ");
        int maxMileage = sc.nextInt();
        sc.nextLine();
        vehicles =  Dealership.getVehiclesByMileage(minMileage,maxMileage);
        displayFormat(vehicles);
    }
    public void processGetByVehicleTypeRequest(){
        System.out.print("Enter type of car:");
        String type = sc.nextLine();
        vehicles = Dealership.getVehiclesByType(type);
        displayFormat(vehicles);
    }
    public void processGetAllVehiclesRequest(){
        vehicles = Dealership.getAllVehicles();
        displayFormat(vehicles);
    }
    public void processAddVehicleRequest(){
        System.out.print("Please enter vehicle data:\nVin: ");
        int vin = sc.nextInt();
        sc.nextLine();
        System.out.print("Year: ");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.print("Make: ");
        String make1 = sc.nextLine();
        System.out.print("Model: ");
        String model1 = sc.nextLine();
        System.out.print("Vehicle Type (car,truck,SUV,van)");
        String vehicleType = sc.nextLine();
        System.out.print("Color: ");
        String color1 = sc.nextLine();
        System.out.print("Odometer: ");
        int odo = sc.nextInt();
        sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        Vehicle vehicle = new Vehicle(vin,year,make1,model1,vehicleType,color1,odo,price);
        dealership.addVehicle(vehicle);
        fileManager.saveDealership(dealership);
        System.out.println("Vehicle added succesfully!");
    }

    public void processRemoveVehicleRequest(){
        System.out.print("Enter VIN of the vehicle to remove: ");
        int vin = sc.nextInt();
        sc.nextLine();

        List<Vehicle> allVehicles = Dealership.getAllVehicles();
        Vehicle vehicleToRemove = null;

        for (Vehicle v : allVehicles) {
            if (v.getVin() == vin) {
                vehicleToRemove = v;
                break;
            }
        }
        if (vehicleToRemove != null) {
            dealership.removeVehicle(vehicleToRemove);
            fileManager.saveDealership(dealership);
            System.out.println("Vehicle removed from inventory");
        } else {
            System.out.println("Vehicle not found");
        }
    }

    public void displayFormat(List<Vehicle> vehicle) {
        if (vehicle.isEmpty()) {
            System.out.println("No vehicles in inventory.");
        } else {
        for (Vehicle v : vehicle) {
            System.out.println("VIN: " + v.getVin() + "| Year: " + v.getYear() + "| Make: " + v.getMake() + "| Model: " + v.getModel() + "| Type: " + v.getVehicleType() + "| Color: " + v.getColor() + "| Odometer: " + v.getOdometer() + "| Price: $" + v.getPrice());
        }
    }
    }
}
