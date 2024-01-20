package Postgraduate;

public class Aspirant {
    String firstname;
    String lastname;
    double averageMark;
    public Aspirant(){

    }
    public Aspirant(double averageMark,String firstname, String lastname){
        this.averageMark = averageMark;
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public void stependiya2(){
        if(averageMark == 5){
            System.out.println("200$");
        }
        else{
            System.out.println("180$");
        }
    }
}