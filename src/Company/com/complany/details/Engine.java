package Company.com.complany.details;

public class Engine {
    private int power;
    private String manufacturer;
    public Engine(int power, String manufacturer){
        this.power = power;
        this.manufacturer = manufacturer;
    };
    public Engine(){};
    public int get_power(){
        return power;
    }
    public String get_man(){
        return manufacturer;
    }
}
