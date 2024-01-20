package Recursion;

public class Main {
    public static void main(String[] args) {
        int A = 5;
        int B = 10;
        NumberRangePrinter example = new NumberRangePrinter();
        System.out.println("Ascending Order:");
        example.printNumbers(A, B);

        System.out.println("\nDescending Order:");
        example.printNumbers(B, A);
    }
}