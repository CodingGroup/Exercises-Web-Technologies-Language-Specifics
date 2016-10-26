package com.company;

import java.util.*;

public class asdfg {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String[] input1 = console.nextLine().split(" ");
        String[] input2 = console.nextLine().split(" ");
        ArrayList<String> result = new ArrayList<String>();

        result.add(String.join("", input1));
        result.add(String.join("", input2));
        Collections.sort(result);
        for (String item : result) {

            System.out.println(item);
        }

    }
}
