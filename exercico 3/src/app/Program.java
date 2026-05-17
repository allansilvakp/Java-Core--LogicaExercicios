package app;

import java.util.Scanner;

public class Program {
    void main() {
        Scanner sc = new Scanner(System.in);
        IO.print("Enter the number A: ");
        int numA = sc.nextInt();
        IO.print("Enter the number B: ");
        int numB = sc.nextInt();
        int numC;

        if (numA == numB) {
            numC = numA + numB;
            IO.print("Number C = " + numC);
        } else {
            numC = numA * numB;
            IO.print("Number C = " + numC);
        }
    }
}
