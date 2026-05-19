package app;

import java.util.Arrays;
import java.util.Scanner;


public class Program {
    void main() {
        Scanner sc = new Scanner(System.in);
        int[] numbers;
        IO.print("Enter the number A: ");
        int numberA = sc.nextInt();
        IO.print("Enter the number B: ");
        int numberB = sc.nextInt();
        IO.print("Enter the number C: ");
        int numberC = sc.nextInt();

        numbers = new int[]{numberA, numberB, numberC};

        Arrays.sort(numbers);
        IO.print("The numbers in ascending order are: ");

        for (int i = 2; i >= 0; i--) {
            IO.print(numbers[i] + " ");
        }


    }
}
