package com.company;

import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        //String input = console.nextLine();
        long number = Long.parseLong(console.nextLine());
        boolean result = PrimeCheck(number);


        if (result == true) {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }



    }
    static boolean PrimeCheck(long number)
    {
        if (number==0 || number==1)
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++)
        {
            if (number % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
