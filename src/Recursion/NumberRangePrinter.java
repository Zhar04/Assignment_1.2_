package Recursion;

public class NumberRangePrinter {
    public static void printNumbers(int a, int b) {
        if (a < b) {
            printAscending(a, b);
        } else {
            printDescending(a, b);
        }
    }

    private static void printAscending(int current, int end) {
        if (current <= end) {
            System.out.print(current + " ");
            printAscending(current + 1, end);
        }
    }

    private static void printDescending(int current, int end) {
        if (current >= end) {
            System.out.print(current + " ");
            printDescending(current - 1, end);
        }
    }
}