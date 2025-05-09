import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static List<Vehicle> getVehiclesByPrice(double min, double max){
        try{
            List<Vehicle> veh = Dealership.getAllVehicles();
            ArrayList<Vehicle> vehicles = new ArrayList<>();
            for (Vehicle vehicle : veh){
                if (vehicle.getPrice() >= min && vehicle.getPrice() <= max) {
                    vehicles.add(vehicle);
                }
            }
            return vehicles;
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }

    }
    public static List<Vehicle> getVehiclesByMakeModel(String make, String model){
        try{
            List<Vehicle> veh = Dealership.getAllVehicles();
            ArrayList<Vehicle> vehicles = new ArrayList<>();
            for (Vehicle vehicle : veh){
                if (vehicle.getMake().trim().equalsIgnoreCase(make) && vehicle.getModel().trim().equalsIgnoreCase(model)) {
                    vehicles.add(vehicle);
                }
            }
            return vehicles;
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    public static List<Vehicle> getVehiclesByYear(int min, int max){
        try{
            List<Vehicle> veh = Dealership.getAllVehicles();
            ArrayList<Vehicle> vehicles = new ArrayList<>();
            for (Vehicle vehicle : veh){
                if (vehicle.getYear() >= min && vehicle.getYear() <= max) {
                    vehicles.add(vehicle);
                }
            }
            return vehicles;
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    public static List<Vehicle> getVehiclesByColor(String color){
        try{
            List<Vehicle> veh = Dealership.getAllVehicles();
            ArrayList<Vehicle> vehicles = new ArrayList<>();
            for (Vehicle vehicle : veh){
                if (vehicle.getColor().trim().equalsIgnoreCase(color)) {
                    vehicles.add(vehicle);
                }
            }
            return vehicles;
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    public static List<Vehicle> getVehiclesByMileage(int min, int max){
        try{
            List<Vehicle> veh = Dealership.getAllVehicles();
            ArrayList<Vehicle> vehicles = new ArrayList<>();
            for (Vehicle vehicle : veh){
                if (vehicle.getOdometer() >= min && vehicle.getOdometer() <= max) {
                    vehicles.add(vehicle);
                }
            }
            return vehicles;
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    public static List<Vehicle> getVehiclesByType(String type){
        try{
            List<Vehicle> veh = Dealership.getAllVehicles();
            ArrayList<Vehicle> vehicles = new ArrayList<>();
            for (Vehicle vehicle : veh){
                if (vehicle.getVehicleType().trim().equalsIgnoreCase(type)) {
                    vehicles.add(vehicle);
                }
            }
            return vehicles;
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    public static List<Vehicle> getAllVehicles(){
        List<Vehicle> veh = new ArrayList<>();
        try{
            BufferedReader bufReader = new BufferedReader(new FileReader("src/main/resources/inventory.csv"));
            bufReader.readLine();
            String line;
            while ((line = bufReader.readLine()) != null){
                String[] parts = line.split("\\|");
             int vin = Integer.parseInt(parts[0]);
             int year =Integer.parseInt(parts[1]);
             String make = parts[2];
             String model = parts[3];
             String vehicleType = parts[4];
             String color = parts[5];
             int odometer = Integer.parseInt(parts[6]);
             double price = Double.parseDouble(parts[7]);
             Vehicle vehicle = new Vehicle(vin,year,make,model,vehicleType,color,odometer,price);
             veh.add(vehicle);
            }
            bufReader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return veh;
    }
    public void addVehicle(Vehicle vehicle){
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        try (BufferedWriter bufWriter = new BufferedWriter(new FileWriter("src/main/resources/inventory.csv", true))) {
            //Vehicle vehicle = new Vehicle(vin, year, make,model,vehicleType,color,odometer,price);
            vehicles.add(vehicle);
            bufWriter.write(vehicle.getVin() + "|" + vehicle.getYear() + "|" + vehicle.getMake() + "|" + vehicle.getModel() + "|" + vehicle.getVehicleType() + "|" + vehicle.getColor() + "|" + vehicle.getOdometer() + "|" + vehicle.getPrice());
            bufWriter.newLine();
            System.out.println("Vehicle added successfully!");
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }

    public void removeVehicle(Vehicle vehicle){

    }
}
