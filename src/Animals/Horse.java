package Animals;

public class Horse extends Animal{
    String breed;

    public Horse(String food,String location, String breed){
        super(food,location);
        this.breed=breed;
    }
    @Override
    public void makenoise(){
        System.out.println("Neigh! Neigh!");
    }
    @Override
    public void eat(){
        System.out.println("The horse is eating"+food);

    }
    public void gallop(){
        System.out.println("Galopping...");
    }
}
