package com.company;
import java.util.*;

public class SumReversedNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] inputStr = console.nextLine().split(" ");
        int[] input = new int[inputStr.length];

        for (int i = 0; i < inputStr.length; i++) {
            inputStr[i] = new StringBuilder(inputStr[i]).reverse().toString();
        }

        for (int i = 0; i < inputStr.length; i++) {
            input[i]=Integer.parseInt(inputStr[i]);
        }
        int sum = 0;
        for (int i:input) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
