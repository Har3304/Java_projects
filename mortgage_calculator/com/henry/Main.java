package com.henry.mortgage_calc;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Principal
        System.out.print("Principal Amount: ");
        double principal = scanner.nextDouble();

        // Annual Interest Rate
        System.out.print("Annual Interest Rate (e.g. 12 for 12%): ");
        double annualInterest = scanner.nextDouble();

        // Years
        System.out.print("Loan Period (Years): ");
        int years = scanner.nextInt();

        // Convert to monthly values
        double monthlyInterest = annualInterest / 100 / 12;
        int numberOfPayments = years * 12;

        // Mortgage Formula
        double mortgage = principal *
                (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        // Format output
        NumberFormat currency =
                NumberFormat.getCurrencyInstance(new Locale("en", "IN"));

        System.out.println("Mortgage Payment: " + currency.format(mortgage));

        scanner.close();
    }
}
