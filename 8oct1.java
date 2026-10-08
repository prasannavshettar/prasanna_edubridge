package mentallll;

import java.util.ArrayList;
import java.util.Scanner;

public class project {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {
            System.out.println("\n1) Create");
            System.out.println("2) Display");
            System.out.println("3) Raise Salary");
            System.out.println("4) Exit");
            System.out.print("Enter choice (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    char continueInput = 'y';
                    while (continueInput == 'y' || continueInput == 'Y') {
                        System.out.print("\nEnter the name: ");
                        String name = scanner.nextLine();

                        System.out.print("Enter the age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine(); 

                        System.out.print("Enter the designation: ");
                        String desigCode = scanner.nextLine();

                        
                        employees.add(new Employee(name, age, desigCode));

                        System.out.print("Do you want to add another employee? (y/n): ");
                        continueInput = scanner.next().charAt(0);
                        scanner.nextLine(); 
                    }
                    break;

                case 2:
                    if (employees.isEmpty()) {
                        System.out.println("\nNo employee records found.");
                    } else {
                        System.out.println("\n=== Employee Records ===");
                        for (Employee emp : employees) {
                            emp.display();
                        }
                    }
                    break;

                case 3:
                    if (employees.isEmpty()) {
                        System.out.println("\nNo employee records available to update.");
                    } else {
                        System.out.print("\nEnter salary increment amount for all employees: ");
                        double increment = scanner.nextDouble();
                        for (Employee emp : employees) {
                            emp.raiseSalary(increment);
                        }
                        System.out.println("Salaries updated successfully!");
                    }
                    break;

                case 4:
                    System.out.println("\nExiting program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid selection. Please choose an option between 1 and 4.");
            }
        }
    }
}

class Employee {
    private String name;
    private int age;
    private String designation;
    private double salary;

    public Employee(String name, int age, String desigCode) {
        this.name = name;
        this.age = age;
        parseDesignationAndSalary(desigCode);
    }

    private void parseDesignationAndSalary(String code) {
        String cleanCode = code.trim().toLowerCase();

        if (cleanCode.startsWith("p")) {
            this.designation = "Programmer";
            this.salary = 20000;
        } else if (cleanCode.startsWith("m")) {
            this.designation = "Manager";
            this.salary = 30000;
        } else if (cleanCode.startsWith("t")) {
            this.designation = "Tester";
            this.salary = 25000;
        } else {
            this.designation = "Unknown";
            this.salary = 0;
        }
    }

    public void raiseSalary(double amount) {
        this.salary += amount;
    }

    public void display() {
        System.out.println("--------------------------------");
        System.out.println("Your name is        : " + name);
        System.out.println("Your age is         : " + age);
        System.out.println("Your salary is      : " + salary);
        System.out.println("Your designation is : " + designation);
        System.out.println("--------------------------------");
    }
}