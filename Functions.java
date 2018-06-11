package com.philip;

import org.w3c.dom.UserDataHandler;

import java.util.Scanner;

public class Functions {
    int z = 100; //Global variable

    public static void area(double h, double b) {
        double result = 0.5 * b * h;
        System.out.println(result);
    }

    public double volume(double r) { //if a function is void, it doesnt output anything
        double result = 4 / 3 * 22 / 7 * r * r * r;
        // System.out.println(result);
        return result;

    }

    public static void main(String[] args) {
        System.out.println(1234);
        Scanner s = new Scanner(System.in);//System.in aka keyboard
        System.out.println("First Number : ");
        int first = s.nextInt();

        System.out.println("Second Number");
        int second = s.nextInt();
        int result = first + second;
        System.out.println("Sum is + " + result);
        area(60, 30);
        area(first, second);
        Functions f = new Functions();
        f.volume(15);
        f.volume(7);
        f.volume(first);
        f.volume(second);

        f.converter(10000, "USD", true);
        f.converter(250000, "EUR", false);
        f.converter(100000, "GBP", true);
        f.converter(100000, "UGX", true);

        System.out.println("Volume is " + f.volume(10));
        System.out.println(f.volume(6.55));
        double v = f.volume(5);
        System.out.println(Math.round(v));


    }

    public void converter(double kes, String currency, boolean rounded) {
        double result = 0;

        if (currency.equals("USD")) {

            result = kes / 104.0;

        } else if (currency.equals("EUR")) {

            result = kes / 119.0;

        } else if (currency.equals("GBP")) {

            result = kes / 135.0;

        }
        if (rounded == true) {
            System.out.println(currency + Math.round(result));
        } else {

            System.out.println(currency + result);
        }


    }

}
