package Animals;

public class Dog extends Animal{
    String breed;
    public Dog(){

    }
    public Dog(String food,String location, String breed){
        super(food,location);
        this.breed=breed;
    }
    @Override
    public void makenoise(){
        System.out.println("woof! woof!");

    }
    @Override
    public void eat(){
        System.out.println("The dog is eatng"+food);
    }
    public void wagTail(){
        System.out.println("Tail wagging...");
    }
}
