package Animals;
import Animals.*;


public class Main {
    public static void main(String[] args) {
        Animal[] animals={
                new Dog("Animals.Dog food","Animals.Dog House","Labrador"),
                new Cat("cat food","cat house","Siameze"),
                new Horse("horse food","horse house","Animals.Horse breed")
        };
        Dog dog1 = new Dog();
        dog1.food="dog's food";
        dog1.location="dog's house";
        dog1.breed="Sobaka";
        dog1.wagTail();

        Veterinary vet = new Veterinary();
        for(Animal animal : animals){
            vet.treananimal(animal);
            System.out.println("---");
        }
        Cat.sleep();
        animals[0].makenoise();
        animals[1].eat();
    }
}