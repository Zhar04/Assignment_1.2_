package Postgraduate;

// Press Shift twice to open the Search Everywhere dialog and type show whitespaces,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.averageMark = 5;
        student.lastname = "Saparbayev";
        student.firstname = "Alisher";
        student.stependiya();
        Aspirant aspirant = new Aspirant(4,"Utegenov","Zharken");
        aspirant.stependiya2();
        Student[] students = new Student[3];
        students[0] = new Student(4.5,"Dariya","Zhumadilova");
        students[1] = new Student(3,"Alex","Rush");
        students[2] = new Student(4,"Daniel","Ivanov");
        for(int i = 0; i < 3; i++){
            students[i].stependiya();
        }
    }
}