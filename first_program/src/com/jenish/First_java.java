package com.jenish;

import java.util.Scanner;

public class First_java {
    public static void main(String[] args) {

//        Write a program to print whether a number is even or odd, also take input from the user.

        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the number to find odd or even: ");
//        int num = input.nextInt();
//
//        if(num % 2 == 0){
//            System.out.println("even");
//        }
//        else{
//            System.out.println("odd");
//        }

//        Take name as input and print a greeting message for that particular name.

//        System.out.print("Enter your name: ");
//        String name = input.nextLine();
//        System.out.println("Welcome " + name);

//        Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

//        System.out.print("Enter the initial sum of money: ");
//        double principal = input.nextDouble();
//        System.out.print("Enter the annual interest rate as a percentage: ");
//        double rate = input.nextDouble();
//        System.out.print("Enter the duration in years: ");
//        double time = input.nextDouble();
//
//        double si = (principal * rate * time) / 100;
//
//        System.out.println(si);

//        Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

//        System.out.print("Enter which operation want(+, -, *, /): ");
//        char symbol = input.next().charAt(0);
//        System.out.print("Enter the num1: ");
//        int a = input.nextInt();
//        System.out.print("Enter the num2: ");
//        int b = input.nextInt();
//
//        if (symbol == '+'){
//            System.out.println("sum: " + (a + b));
//        }
//        if (symbol == '-'){
//            System.out.println("sub: " + (a - b));
//        }
//        if (symbol == '*'){
//            System.out.println("mul: " + (a * b));
//        }
//        if (symbol == '/'){
//            System.out.println("div: " + (a / b));
//        }

//        To calculate Fibonacci Series up to n numbers.

        int f = input.nextInt();

        int a = 0 , b = 1;

        for (int i = 1; i <= f; i++){
            System.out.println(a + "");
            int sum = a + b;
            a=b;
            b=sum;
        }

    }
}
