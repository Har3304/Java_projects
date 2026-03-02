package com.prime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int x = scanner.nextInt();

        List<Integer> primes = new ArrayList<>();

        for (int i = 1; i <= x; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        System.out.println("Prime numbers:");
        System.out.println(primes);

        scanner.close();
    }
}
