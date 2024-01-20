package Company.com.complany.vehicles;

import Company.com.complany.details.Engine;
import Company.com.complany.professions.Driver;
import Company.com.complany.vehicles.Car;

public class Lorry extends Car {
    private double carryingCapacity;

    public Lorry(String brand, String car_class, float weight, Engine motor, Driver driver, double carryingCapacity){
        super(brand, car_class, weight, motor, driver);
        this.carryingCapacity = carryingCapacity;
    }
    public String toString(){
        return  "Lorry{\n" +
                "Brand: " + brand +
                "\nCar class: " + car_class +
                "\nWeight: " + weight +
                "\nPower: " + motor.get_power() +
                "\nManufacturer: " + motor.get_man() +
                "\nFull name: " + driver.get_name() +
                "\nDriving Experience: " + driver.get_exp() +
                "\nCarrying capacity: " + carryingCapacity +
                "}\n\n";
    }
}
