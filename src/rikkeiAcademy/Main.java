package rikkeiAcademy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your money");
        money = input.nextDouble();
        System.out.println("Enter your month");
        month = input.nextInt();
        System.out.println("Enter your interestRate");
        interestRate = input.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Totalinterest is :" + totalInterest);
    }
}
