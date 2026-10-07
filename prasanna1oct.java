package edu_bridge;

import java.util.Scanner;

public class oct0110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month: ");
        String month = scanner.nextLine().trim();

        switch (month.toLowerCase()) {
            case "1":
                System.out.println("Welcome to January!");
                break;
            case "2":
                System.out.println("Welcome to February!");
                break;
            case "3":
                System.out.println("Welcome to March!");
                break;
            case "4":
                System.out.println("Welcome to April!");
                break;
            case "5":
                System.out.println("Welcome to May!");
                break;
            case "6":
                System.out.println("Welcome to June!");
                break;
            case "7":
                System.out.println("Welcome to July!");
                break;
            case "8":
                System.out.println("Welcome to August!");
                break;
            case "9":
                System.out.println("Welcome to September!");
                break;
            case "10":
                System.out.println("Welcome to October!");
                break;
            case "11":
                System.out.println("Welcome to November!");
                break;
            case "12":
                System.out.println("Welcome to December!");
                break;
            default:
                System.out.println("Invalid month entered: " + month);
                break;
        }

        scanner.close();
    }
}