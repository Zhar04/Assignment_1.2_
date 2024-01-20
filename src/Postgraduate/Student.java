package Postgraduate;

public class Student {
    String firstname;
    String lastname;
    double averageMark;
    public Student(){

    }
    public Student(double averageMark,String firstname, String lastname){
        this.averageMark = averageMark;
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public void stependiya(){
        if(averageMark == 5){
            System.out.println("100$");
        }
        else{
            System.out.println("80$");
        }
    }
}