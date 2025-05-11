import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        List<Vehicle> vehicles;
        System.out.println("---------- Welcome to Car Dealership app! ----------");
        while(run){
            System.out.println("\nChoose an option:\n1-Find vehicles within a price range\n2-Find vehicles by make/model\n3-Find vehicles by year range\n4-Find vehicles by color\n5-Find vehicles by mileage range\n6-Find vehicles by type (car,truck,SUV,van)\n7-List ALL vehicles\n8-Add a vehicle\n9-Remove a vehicle\n99-Quit");
            int choice1 = sc.nextInt();
            sc.nextLine();
            switch (choice1){
                case 1:
                   /* System.out.print("Enter min range:");
                    int min = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter max range: ");
                    int max = sc.nextInt();
                    sc.nextLine();
                    vehicles =  Dealership.getVehiclesByPrice(min, max);
                    for (Vehicle v : vehicles){
                        System.out.println("VIN: " + v.getVin() + "| Year: " + v.getYear() + "| Make: " + v.getMake() + "| Model: " + v.getModel() + "| Type: " + v.getVehicleType() + "| Color: " + v.getColor()  + "| Odometer: " + v.getOdometer() + "| Price: $" + v.getPrice());
                    */}
                    break;
                case 2:
                    /*System.out.print("Enter make:");
                    String make = sc.nextLine();
                    System.out.print("Enter model: ");
                    String model = sc.nextLine();
                    vehicles = Dealership.getVehiclesByMakeModel(make, model);
                    for (Vehicle v : vehicles){
                        System.out.println("VIN: " + v.getVin() + "| Year: " + v.getYear() + "| Make: " + v.getMake() + "| Model: " + v.getModel() + "| Type: " + v.getVehicleType() + "| Color: " + v.getColor()  + "| Odometer: " + v.getOdometer() + "| Price: $" + v.getPrice());
                    */}
                    break;
                case 3:
                    /*System.out.print("Enter min range:");
                    int minYear = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter max range: ");
                    int maxYear = sc.nextInt();
                    sc.nextLine();
                    vehicles =  Dealership.getVehiclesByYear(minYear, maxYear);
                    for (Vehicle v : vehicles){
                        System.out.println("VIN: " + v.getVin() + "| Year: " + v.getYear() + "| Make: " + v.getMake() + "| Model: " + v.getModel() + "| Type: " + v.getVehicleType() + "| Color: " + v.getColor()  + "| Odometer: " + v.getOdometer() + "| Price: $" + v.getPrice());
                    }*/
                    break;
                case 4:
                    /*System.out.print("Enter color:");
                    String color = sc.nextLine();
                    vehicles = Dealership.getVehiclesByColor(color);
                    for (Vehicle v : vehicles){
                        System.out.println("VIN: " + v.getVin() + "| Year: " + v.getYear() + "| Make: " + v.getMake() + "| Model: " + v.getModel() + "| Type: " + v.getVehicleType() + "| Color: " + v.getColor()  + "| Odometer: " + v.getOdometer() + "| Price: $" + v.getPrice());
                    }*/
                    break;
                case 5:
                    /*System.out.print("Enter min mileage range: ");
                    int minMileage = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter max mileage range: ");
                    int maxMileage = sc.nextInt();
                    sc.nextLine();
                    vehicles =  Dealership.getVehiclesByMileage(minMileage,maxMileage);
                    for (Vehicle v : vehicles){
                        System.out.println("VIN: " + v.getVin() + "| Year: " + v.getYear() + "| Make: " + v.getMake() + "| Model: " + v.getModel() + "| Type: " + v.getVehicleType() + "| Color: " + v.getColor()  + "| Odometer: " + v.getOdometer() + "| Price: $" + v.getPrice());
                    }*/
                    break;
                case 6:
                   /* System.out.print("Enter type of car:");
                    String type = sc.nextLine();
                    vehicles = Dealership.getVehiclesByType(type);
                    for (Vehicle v : vehicles){
                        System.out.println("VIN: " + v.getVin() + "| Year: " + v.getYear() + "| Make: " + v.getMake() + "| Model: " + v.getModel() + "| Type: " + v.getVehicleType() + "| Color: " + v.getColor()  + "| Odometer: " + v.getOdometer() + "| Price: $" + v.getPrice());
                    }*/
                    break;
                case 7:
                    /*List<Vehicle> veh = Dealership.getAllVehicles();
                    for (Vehicle v : veh) {
                        System.out.println("VIN: " + v.getVin() + "| Year: " + v.getYear() + "| Make: " + v.getMake() + "| Model: " + v.getModel() + "| Type: " + v.getVehicleType() + "| Color: " + v.getColor()  + "| Odometer: " + v.getOdometer() + "| Price: $" + v.getPrice());
                    }*/
                    break;
                case 8:
                    /*System.out.print("Please enter vehicle data:\nVin: ");
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
                    Dealership dealership = new Dealership("Dealer BoB", "123 Main street", "555-555-55-55");
                    dealership.addVehicle(vehicle);*/
                    break;
                case 9:
                    System.out.print("Enter VIN of vehicle to remove: ");
                    int vinToRemove = sc.nextInt();


                    // Вызываем метод для удаления автомобиля по VIN
                    Dealership.removeVehicle();

                    break;
                case 99:
                    run = false;
                    break;
            }
        }
    }
}
