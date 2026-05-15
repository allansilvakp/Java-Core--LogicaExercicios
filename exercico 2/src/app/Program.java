package app;

import java.util.Scanner;

public class Program {
    void main() {
        Scanner sc = new Scanner(System.in);
        IO.print("Enter a number:");
        int num = sc.nextInt();
        String numSignal;
        String evenOrOdd;

        if (num % 2 == 0) {
           numSignal = evenOrOdd = "Even";
        } else {
            numSignal = evenOrOdd = "Odd";
        }
        if (num > 0) {
            numSignal = "Positive";
        } else if (num < 0) {
            numSignal = "Negative";
        }

        IO.println("Number: " + num + ", " + numSignal + ", " + evenOrOdd);
    }
}