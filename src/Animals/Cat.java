package Animals;

public class Cat extends Animal{
    String color;
    public Cat(String food,String location,String color){
        super(food,location);
        this.color=color;
    }
    @Override
    public void makenoise(){
        System.out.println("Meow Meow!");
    }

    public void eat(){
        System.out.println("The cat is eating"+ food);
    }

    public void purr(){
        System.out.println("Purring...");
    }
}
