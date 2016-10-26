package com.company;

import java.util.*;
public class Phonebook {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        LinkedHashMap<String,String>phonebook = new LinkedHashMap<String,String>();
        String input = console.nextLine();
        while(input!="END"){
            String[] inputArr = input.split(" ");
            String inputFirstElement = inputArr[0];

            String checkForComandA = "A";
            String checkForComandS = "S";
            if (inputFirstElement.equals(checkForComandA))
            {
                if (phonebook.containsKey(inputArr[1]))
                {
                    phonebook.remove(inputArr[1]);
                    phonebook.put(inputArr[1], inputArr[2]);
                }
                else
                {
                    phonebook.put(inputArr[1], inputArr[2]);

                }
            }
            else if (inputFirstElement.equals(checkForComandS))
            {
                if (phonebook.containsKey(inputArr[1]))
                {
                    System.out.println(inputArr[1] + " -> " + phonebook.get(inputArr[1]));
                }
                else
                {
                    System.out.println("Contact " + inputArr[1] + " does not exist.");
                }
            }
            input=console.nextLine();
        }
    }
}
