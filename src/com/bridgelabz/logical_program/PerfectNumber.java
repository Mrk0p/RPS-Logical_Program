package com.bridgelabz.logical_program;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i=1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == num) {
            System.out.println(num+" is perfect number .");
        }
        else {
            System.out.println(num+" is not a perfect number .");
        }
    }
}
