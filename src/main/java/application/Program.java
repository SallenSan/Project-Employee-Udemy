package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Employee> list =  new ArrayList<>();

        System.out.println("How many employees? ");
        int e = scan.nextInt();

        for(int i=1; i<=e; i++ ) {
            System.out.println("Employee # " + i + "data: ");
            System.out.println("Is a Outsourced Employee y or n?");
            char ch = scan.next().charAt(0);
            System.out.println("What's is the employee's name?");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.println("How many hours worked?");
            int hours = scan.nextInt();
            System.out.println("What's the value per hour worked?");
            double valuePerHour = scan.nextDouble();
            if (ch == 'y') {
                System.out.println("What's is the additional charge?");
                double additionalCharge = scan.nextDouble();
                Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                list.add(emp);

            } else {
                Employee emp = new Employee(name, hours, valuePerHour);
                list.add(emp);
            }

        }
            System.out.println();
            System.out.println("PAYMENTS: ");
            for(Employee emp : list) {
                System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));

        }


        scan.close();
    }
}