package com.bridgelabz.logical_program;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int count = scanner.nextInt();
        int a = 0;
        int b = 1;
        int nextNum = 0;
        System.out.println(a+" "+b);

        for (int i=2; i < count; i++) {
            nextNum = a + b;
            System.out.println(nextNum);
            a = b;
            b = nextNum;
        }
    }
}
