package Vehicle;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager_Vehicle {
    public static Scanner sc = new Scanner(System.in);

    private List<Vehicle> vehicleList;

    public Manager_Vehicle(){
        vehicleList = new ArrayList<Vehicle>();
    }

    public void addVehicle(){
        String carOwnerName = Input_carOwnerName();
        String rangeOfVehicle = Input_rangeOfVehicle();
        int capacity = Input_capacity();
        Double value = Input_value();
        Vehicle vehicle = new Vehicle(carOwnerName, rangeOfVehicle, capacity, value);
        vehicleList.add(vehicle);
    }

    public void showVehicle(){
        System.out.format("%-30s ", "carOwnerCar");
        System.out.format("%-20s ", "rangeOfVehicle");
        System.out.format("%-20s ", "Capacuty");
        System.out.format("%-20s ", "Value");
        System.out.format("%-20s\n", "compulsoryTax");
        for(Vehicle vehicle: vehicleList){
            System.out.format("%-30s ", vehicle.getCarOwnerName());
            System.out.format("%-20s ", vehicle.getRangeOfVehicle());
            System.out.format("%-20d ", vehicle.getCapacity());
            System.out.format("%-20.2f ", vehicle.getValue());
            System.out.format("%-20.2f\n", vehicle.compulsoryTax());
        }
    }

    private String Input_carOwnerName(){
        System.out.print("Input Car Owner Name: ");
        return sc.nextLine();
    }

    private String Input_rangeOfVehicle(){
        System.out.print("Input range of vahicle: ");
        return sc.nextLine();
    }

    private int Input_capacity(){
        System.out.print("input capacity: ");
        while (true){
            try {
                int capacity = Integer.parseInt(sc.nextLine());
                if (capacity < 0){
                    throw new NumberFormatException();
                }
                return capacity;
            }catch (NumberFormatException ex){
                System.out.println("Invalid!! Please input Capacity");
            }
        }
    }

    private Double Input_value(){
        System.out.print("input value: ");
        while (true){
            try {
                Double value = Double.parseDouble(sc.nextLine());
                if(value < 0){
                    throw  new NumberFormatException();
                }
                return value;
            }catch (NumberFormatException ex){
                System.out.println("inValid!! Please input value");
            }
        }
    }

}
