package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String numberSTR = console.nextLine();
        long num = Long.parseLong(numberSTR);

        LastNumber(Math.abs(num));

    }

    static void LastNumber(long number){

        long lastNum = number%10;

        if (lastNum==0){
            System.out.println("zero");
        }
        else if (lastNum==1){
            System.out.println("one");
        }
        else if (lastNum==2){
            System.out.println("two");
        }
        else if (lastNum==3){
            System.out.println("three");
        }
        else if (lastNum==4){
            System.out.println("four");
        }
        else if (lastNum==5){
            System.out.println("five");
        }
        else if (lastNum==6){
            System.out.println("six");
        }
        else if (lastNum==7){
            System.out.println("seven");
        }
        else if (lastNum==8){
            System.out.println("eight");
        }
        else {
            System.out.println("nine");
        }

    }

}
