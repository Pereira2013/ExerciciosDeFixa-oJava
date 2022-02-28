package application;

import entities.Empolyee;

import java.util.Locale;
import java.util.Scanner;

public class ProgramEmpolyee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Empolyee emp = new Empolyee();

        System.out.print("Nome: ");
        emp.name = sc.nextLine();

        System.out.print("Gross salary: ");
        emp.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Empolyee: " + emp);

        System.out.println("Which percentage to increase salary ? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);
        System.out.println();
        System.out.println("Updated data: " + emp);

        sc.close();
    }
}
