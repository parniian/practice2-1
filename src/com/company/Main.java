package com.company;

import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number1:");
        String str1 = scanner.nextLine();
        Double number1 = Double.parseDouble(str1);
        System.out.println("enter number2:");
        String str2 = scanner.nextLine();
        double number2 = Double.parseDouble(str2);

        System.out.println("sum="+(number1+number2));
        System.out.println("difference="+(number1-number2));
        System.out.println("product="+(number1*number2));
        if (number2!=0)
            System.out.println("quotient="+(number1/number2));
        else
            System.out.println("undefined!");


    }
}
