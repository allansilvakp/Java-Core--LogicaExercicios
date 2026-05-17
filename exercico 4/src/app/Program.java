package app;

import java.util.Scanner;

public class Program {
    void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        IO.println("Number: " + number);
        IO.println("Predecessor: " + (number - 1));
        IO.println("Successor: " + (number + 1));
    }
}
