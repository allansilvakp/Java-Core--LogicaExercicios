package app;

import java.util.Scanner;

public class Program {
    void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first boolean value (true/false): ");
        boolean firstValue = sc.nextBoolean();

        System.out.print("Enter second boolean value (true/false): ");
        boolean secondValue = sc.nextBoolean();

        if (firstValue == secondValue) {
            if (firstValue) {
                System.out.println("Both values are TRUE");
            } else {
                System.out.println("Both values are FALSE");
            }
        } else {
            System.out.println("The values are different - one is TRUE and one is FALSE");
        }
        sc.close();
    }
}
