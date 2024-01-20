package Company.com.complany.professions;

public class Driver extends Person {
    private int driving_exp;
    public String get_name(){
        return full_name;
    }
    public Driver (){};
    public Driver (int age, String full_name, int driving_exp){
        super(age, full_name);
        this.driving_exp = driving_exp;
    }

    public int get_exp(){
        return driving_exp;
    }
}
