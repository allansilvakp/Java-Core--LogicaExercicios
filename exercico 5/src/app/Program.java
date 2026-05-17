package app;

import java.util.Scanner;

public class Program {
    void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Minimum Salary: ");
        double minSalary = sc.nextDouble();
        System.out.print("Enter a User Salary: ");
        double userSalary = sc.nextDouble();

        IO.println("The user earns " + String.format("%.2f", userSalary / minSalary) + " minimum salaries.");;
    }
}
