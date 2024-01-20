package Animals;

public class Animal {
    String food;
    String location;
    public Animal(){
    }
    public Animal(String food,String location){
        this.food=food;
        this.location=location;
    }
    public void makenoise(){
        System.out.println("Such an animal is making noise");
    }
    public void eat(){
        System.out.println("The animal is eating " + food);
    }
    public static void sleep(){
        System.out.println("The animal is sleeping");
    }
    public String get_food(){
        return food;
    }
}
