package app;

import java.util.Scanner;

public class Program {
    void main() {
        Scanner sc = new Scanner(System.in);
        IO.print("Enter the value: ");
        double value = sc.nextDouble();
        IO.println("The value is: " + String.format("%.2f", value));

        IO.println("The value + 5%: " + String.format("%.2f", value * 1.05));
        IO.println("The value - 5%: " + String.format("%.2f", value * 0.95));

    }
}
