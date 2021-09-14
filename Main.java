/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Fabrizio Giolito
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the price of item 1: ");
        Scanner s1 = new Scanner(System.in);
        int p1 = s1.nextInt();
        System.out.println("Enter the quantity of item 1: ");
        Scanner s2 = new Scanner(System.in);
        int q1 = s2.nextInt();
        System.out.println("Enter the price of item 2: ");
        Scanner s3 = new Scanner(System.in);
        int p2 = s3.nextInt();
        System.out.println("Enter the quantity of item 2: ");
        Scanner s4 = new Scanner(System.in);
        int q2 = s4.nextInt();
        System.out.println("Enter the price of item 3: ");
        Scanner s5 = new Scanner(System.in);
        int p3 = s5.nextInt();
        System.out.println("Enter the quantity of item 3: ");
        Scanner s6 = new Scanner(System.in);
        int q3 = s6.nextInt();

        double subtotal = (p1*q1) + (p2*q2) + (p3*q3);
        double tax = subtotal * 0.055;
        double total = subtotal + tax;
        System.out.println("Subtotal: $" + subtotal + "\nTax: $"+ tax + "\nTotal: $" + total);
    }
}
