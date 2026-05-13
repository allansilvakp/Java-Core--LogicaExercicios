package app;

import java.util.Scanner;

public class Program {
    void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number A: ");
        int numberA = sc.nextInt();
        System.out.print("Enter a number B: ");
        int numberB = sc.nextInt();
        System.out.print("Enter a number C: ");
        int numberC = sc.nextInt();

        System.out.println("Sum A+B: " + (numberA + numberB));
        System.out.println("Is the sum less than C?");
        if (numberA + numberB < numberC) {
            System.out.println("Yes, the sum is less than C.");
        } else {
            System.out.println("No, the sum is not less than C.");
        }
    }
}
