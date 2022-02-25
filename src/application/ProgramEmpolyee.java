package application;

import entities.Empolyee;

import java.util.Locale;
import java.util.Scanner;

public class ProgramEmpolyee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Empolyee emp = new Empolyee();

        System.out.println("Nome: ");
        emp.name = sc.nextLine();
    }
}
