package Company;

import Company.com.complany.details.Engine;
import Company.com.complany.professions.Driver;
import Company.com.complany.vehicles.Car;
import Company.com.complany.vehicles.Lorry;
import Company.com.complany.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
    Engine eng1 = new Engine();
    Driver driver = new Driver();
    //driver.setter();
    Car car = new Car("BMW M5","Business",45,eng1, driver);
    car.start();
    car.stop();
    car.turnRight();
    car.turnLeft();
    System.out.println(car.toString());
    Lorry lorry = new Lorry("BMW M5","Business",45,eng1, driver, 454);
    System.out.println(lorry.toString());
    SportCar sport_car = new SportCar("BMW M5","Business",45,eng1, driver, 4540);
    System.out.println(sport_car.toString());
    }
}