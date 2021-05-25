package Vehicle;

public class Vehicle {
    private String carOwnerName;
    private String rangeOfVehicle;
    private int capacity;
    private double value;

    public Vehicle() {
    }

    public Vehicle(String carOwnerName, String rangeOfVehicle, int capacity, double value) {
        this.carOwnerName = carOwnerName;
        this.rangeOfVehicle = rangeOfVehicle;
        this.capacity = capacity;
        this.value = value;
    }

    public String getCarOwnerName() {
        return carOwnerName;
    }

    public void setCarOwnerName(String carOwnerName) {
        this.carOwnerName = carOwnerName;
    }

    public String getRangeOfVehicle() {
        return rangeOfVehicle;
    }

    public void setRangeOfVehicle(String rangeOfVehicle) {
        this.rangeOfVehicle = rangeOfVehicle;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public double compulsoryTax(){
        double compulsoryTax = 0;
        if(capacity < 100){
            compulsoryTax = value * 0.01;
        }else if(capacity >= 100 && capacity <= 200){
            compulsoryTax = value * 0.03;
        }else{
            compulsoryTax = value * 0.05;
        }
        return compulsoryTax;
    }

}
