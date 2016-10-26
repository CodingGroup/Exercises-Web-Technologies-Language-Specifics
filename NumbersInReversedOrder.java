package com.company;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

    public class Main {

        public static void main(String[] args) {

            Scanner console = new Scanner(System.in);
            String input = console.nextLine();
            char[] charArr = input.toCharArray();

            for (int i = charArr.length-1; i >= 0 ; i--) {
                System.out.print(charArr[i]);
            }

        }
    }
