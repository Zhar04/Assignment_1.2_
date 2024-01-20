package Company.com.complany.vehicles;

import Company.com.complany.details.Engine;
import Company.com.complany.professions.Driver;
import Company.com.complany.vehicles.Car;

public class SportCar extends Car {
    private double top_speed;

    public SportCar(String brand, String car_class, float weight, Engine engine, Driver driver, double top_speed){
        super(brand, car_class, weight, engine, driver);
        this.top_speed = top_speed;
    }
    public String toString(){
        return  "Sport Car{\n" +
                "Brand: " + brand +
                "\nCar class: " + car_class +
                "\nWeight: " + weight +
                "\nPower: " + motor.get_power() +
                "\nManufacturer: " + motor.get_man() +
                "\nFull name: " + driver.get_name() +
                "\nDriving Experience: " + driver.get_exp() +
                "\nTop speed: " + top_speed +
                "}\n\n";
    }
}
