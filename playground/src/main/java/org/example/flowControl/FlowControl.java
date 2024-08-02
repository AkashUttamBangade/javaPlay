package org.example.flowControl;

import java.util.Scanner;

public class FlowControl {
    public enum Days { Sun, Mon, Tue, Wed, Thu, Fri, Sat }
    public static void main(String[] args) {

      //  uitlity();
       // uitlity1();
     //   leapYear();
        calculator(5, 7, 'a');
        enumExample();
    }

    private static void calculator(int a, int b, char operator) {

        switch (operator++){
            case 97:
                System.out.println(a+b);
                break;
            case (98):
                System.out.println(a-b);
                break;
            case (3):
                System.out.println(a*b);
                break;
            default:
                System.out.println("Invalid Input");
        }

        if (operator == 'a'){
            System.out.println(operator);
        }

        if (operator-97+1 == 1){
            System.out.println("1");
        }

        if(operator++ >97 || operator==98)
            System.out.println(operator);

    }

    private static void leapYear() {
        String isLeap = "False";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year : ");
        int year = sc.nextInt();

        if(year%4==0&&year%100!=0){
            isLeap = "True";
        }else if(year%400==0){
            isLeap = "True";
        }
        System.out.println(isLeap);

        String isLeap1 = ((year%4==0&&year%100!=0)||(year%400==0))?"True":"False";
        System.out.println(isLeap1);
    }

    private static void uitlity1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int number1 = sc.nextInt();
        System.out.println("Enter Number 2: ");
        int number2 = sc.nextInt();
        System.out.println("Enter Number 3: ");
        int number3 = sc.nextInt();

        if(number1>number2 && number1>number3){
            System.out.print(number1);
        }else if(number2>number1 && number2>number3){
            System.out.print(number2);
        }else if(number3>number1 && number3>number2){
            System.out.print(number3);
        }

        int ans2 = Math.max(Math.max(number1, number2), number3);
        System.out.println(ans2);

    }

    public static void uitlity(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");

        //Switch Statement
        int number = sc.nextInt();
        switch (number){
            case (1):
                System.out.println("One");
                break;
            default:
                System.out.println("Not One");
        }

        //Apple game from bag to pick by me and friend - first me
        if(number%2==0){
            System.out.print("Friend");
        }else{
            System.out.print("You");
        }
    }

    public  static void enumExample(){

        Days[] days = Days.values();
        for(Days days1 : days){

            switch (days1){
                case Sun:
                    System.out.println("Sunday");
                    break;
                case Mon:
                    System.out.println("Monday");
                    break;
                default:
                    System.out.println("Monday1111");
            }
        }
    }
}
