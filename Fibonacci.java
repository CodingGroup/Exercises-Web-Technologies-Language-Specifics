package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String position = console.nextLine();
        long number = Long.parseLong(position);
        Fibonaci(number);

    }
    static void Fibonaci(long pos)
    {
        long fib0 = 1;
        long fib1 = 1;
        long fibCurrent = 1;

        for (int i = 2; i <= pos; i++)
        {
            fib0 = fib1;
            fib1 = fibCurrent;
            fibCurrent = fib0 + fib1;
        }

        System.out.print(fibCurrent);
    }
}

