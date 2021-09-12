/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
 *  Copyright 2021 Tony Tang
 */

package org.example;
import java.util.Scanner;

public class assignment22 {

    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);

        System.out.println("First Number: ");
        int num1 = scan.nextInt();
        System.out.println("Second Number: ");
        int num2 = scan.nextInt();
        System.out.println("Third Number: ");
        int num3 = scan.nextInt();

        int largest;

        while (true) {

            if (num1 == num2 || num1 == num3 || num2 == num3) {

                System.out.println("Number already entered. Please Enter a different number!!");
                break;
            }

            if (num1 > num2 && num1 > num3) {
                largest = num1;
                System.out.println("The largest number is " + largest);
                break;
            }

            if (num2 > num1 && num2 > num3) {
                largest = num2;
                System.out.println("The largest number is " + largest);
                break;
            }

            if (num3 > num1 && num3 > num2) {
                largest = num3;
                System.out.println("The largest number is " + largest);
                break;
            }

        }
    }
}