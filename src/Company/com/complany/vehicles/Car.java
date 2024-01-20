package Company.com.complany.vehicles;

import Company.com.complany.details.Engine;
import Company.com.complany.professions.Driver;

public class Car {
    String brand;
    String car_class;
    float weight;
    Driver driver = new Driver(21,"Zharken Utegenov", 10);
    Engine motor = new Engine(50, "BMW");



    public Car(String brand, String car_class, float weight, Engine motor, Driver driver){
        this.brand = brand;
        this.car_class = car_class;
        this.weight= weight;
    };
    public void start(){
        System.out.println("Let's go");
    };
    public void stop(){
        System.out.println("Let's stop");
    };
    public void turnRight(){
        System.out.println("Turn right");
    };
    public void turnLeft(){
        System.out.println("Turn left");
    };
    public String toString(){
        return "\nBrand: " + brand +
                "\nCar class: " + car_class +
                "\nWeight: " + weight +
                "\nPower: " + motor.get_power() +
                "\nManufacturer: " + motor.get_man() +
                "\nFull name: " + driver.get_name() +
                "\nDriving Experience: " + driver.get_exp() + "\n\n";
    }
}
