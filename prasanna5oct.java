package edu_bridge;

import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        this.salary = 25000.0;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public double getSalary() { return salary; }
    
    public void raiseSalary(double amount) {
        this.salary += amount;
    }

    public void displayDetails() {
        System.out.printf("Name: %-15s | Age: %-3d | Salary: Rs.%.2f%n", name, age, salary);
    }
}

public class oct0110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employeeList = new ArrayList<>();
        int choice = 0;

        do {
            System.out.println("\n=======================");
            System.out.println("       MAIN MENU       ");
            System.out.println("=======================");
            System.out.println("1. Create Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Raise Salary");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid selection. Please enter a valid menu number.");
                scanner.next(); 
                continue;
            }
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    boolean keepCreating = true;
                    while (keepCreating) {
                        System.out.print("\nEnter Name: ");
                        String name = scanner.nextLine().trim();

                        System.out.print("Enter Age: ");
                        while (!scanner.hasNextInt()) {
                            System.out.println("Invalid entry. Please input a numerical age value.");
                            scanner.next();
                            System.out.print("Enter Age: ");
                        }
                        int age = scanner.nextInt();
                        scanner.nextLine();

                        employeeList.add(new Employee(name, age));
                        System.out.println("Record saved successfully!");

                        System.out.print("Do you want to continue adding? (yes/no): ");
                        String response = scanner.nextLine().trim().toLowerCase();

                        if (response.equals("no")) {
                            keepCreating = false;
                        } else if (!response.equals("yes")) {
                            System.out.println("Unknown command. Safely returning to Main Menu.");
                            keepCreating = false;
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n--- EMPLOYEE REGISTRY ---");
                    if (employeeList.isEmpty()) {
                        System.out.println("No records found. Please create an entry first.");
                    } else {
                        for (Employee emp : employeeList) {
                            emp.displayDetails();
                        }
                    }
                    break;

                case 3:
                    if (employeeList.isEmpty()) {
                        System.out.println("\nDatabase is empty. Cannot process salary hikes.");
                    } else {
                        System.out.print("\nEnter salary hike amount to apply to all: ");
                        while (!scanner.hasNextDouble()) {
                            System.out.println("Invalid amount format.");
                            scanner.next();
                            System.out.print("Enter hike amount: ");
                        }
                        double hike = scanner.nextDouble();
                        scanner.nextLine();

                        for (Employee emp : employeeList) {
                            emp.raiseSalary(hike);
                        }
                        System.out.println("Salaries updated for all employees successfully!");
                    }
                    break;

                case 4:
                    System.out.println("\nTerminating program safely. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please pick an option between 1 and 4.");
            }

        } while (choice != 4);

        scanner.close();
    }
}