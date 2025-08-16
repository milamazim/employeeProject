package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        Employee em = new Employee();
       
        System.out.print("Name: ");
        em.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        em.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        em.tax = sc.nextDouble();        
        System.out.print("\n");
        System.out.printf("Employee: %s, $ %.2f%n%n", em.name, em.netSalary());
        System.out.print("Which percentage to increase salary? "); 
        double percentage = sc.nextDouble();        
        System.out.print("\n");
        em.increaseSalary(percentage);
        System.out.print("\n");     

        sc.close();

    }
}
