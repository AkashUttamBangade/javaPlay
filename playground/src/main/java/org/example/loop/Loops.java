package org.example.loop;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

//        performance();
//        countDigits();
//        numberTable();
//        factorial();
//        greatestCommonDivisorOrHighetstCommonFactor();
//        leastCommonMultiple();
//        allDivisor();
//        primeNumber();
//        fibonacci();
    }

    private static void fibonacci() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of sequence in fibonacci - ");
        int i = sc.nextInt();

        int a=0, b=1;
        if(i == 1)
            System.out.println(a);
        else if(i == 2)
            System.out.println(a+" "+b);
        else{
            System.out.print(a+" "+b);
            for(int c=3; c<=i; c++){
                int d = a+b;
                System.out.print(" "+d);
                a=b;
                b=d;

            }
        }
    }

    private static void primeNumber() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number - ");
        int input = sc.nextInt();

        if(input<=1)
            System.out.println("False");

        for(int i=2; i*i<input; i++){
            if(input%i==0){
                System.out.println("No Prime.");
                break;
            }
        }
        System.out.println("Prime.");
    }

    private static void allDivisor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number - ");
        int input = sc.nextInt();

        for(int i=1; i<=input; i++){
            if(input%i==0){
                System.out.print(i+" ");
            }
        }
    }

    private static void leastCommonMultiple() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number - ");
        int i1 = sc .nextInt();
        System.out.println("Enter second number - ");
        int i2 = sc .nextInt();

        int number =i1*i2;
        int smaller = Math.min(i1,i2);
        for (int i = 1; i<=i1; i++){
            if((i*i2)%i1==0){
                System.out.println("i1 - "+i1);
                number=i*i2;
                System.out.println("Least Common Factor ------ "+number);
                break;
            }
        }
        System.out.println("Least Common Factor - "+number);
    }

    private static void greatestCommonDivisorOrHighetstCommonFactor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number - ");
        int i1 = sc .nextInt();
        System.out.println("Enter second number - ");
        int i2 = sc .nextInt();

        int smaller = Math.min(i1,i2);

        int number = 1;
        for (int i=1; i<=smaller; i++){
            if((i1%i == 0)&&(i2%i ==0 )){
                number = i;
            }
        }
        System.out.println("Number GCD HCF - "+number);
    }

    private static void factorial() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        int factorial = getFactorial(i);
        System.out.println("factorial of i = "+factorial);

        int factorialFor = getForFactorial(i);
        System.out.println("factorial of i with for = "+factorial);
    }

    private static int getForFactorial(int i) {
        int sum = 0;
        for (int a = i; a>0; a--){
            sum *= (a-1);
        }
        return sum;
    }

    private static int getFactorial(int i) {

        if(i==0)
            return 1;
        return i*getFactorial(i-1);
    }

    private static void numberTable() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Table of - ");
        int i = sc.nextInt();
        System.out.println("Enter Table upto - ");
        int n = sc.nextInt();
        int a = 1;

        while(a<=n){
            System.out.println(i+" * "+a+" = "+(i*a));
            a++;
        }
    }

    private static void countDigits() {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int count =0;

        while (i!=0){
            i=i/10;
            count++;
        }
        System.out.println("Count of Digits = "+count);
    }

    private static void performance() {
        List<Integer> list = new ArrayList<>();
        long startTime;
        long endTime;

        for (int i = 0; i<10000; i++){
            list.add(i);
        }

        startTime = Calendar.getInstance().getTimeInMillis();
        for (int lists : list){
            int a = lists;
        }
        endTime = Calendar.getInstance().getTimeInMillis();
//        System.out.println("ForEach Start time -  "+startTime);
//        System.out.println("ForEach End Time - "+endTime);
        System.out.println("ForEach End Time -Start time = "+(endTime-startTime));

        startTime = Calendar.getInstance().getTimeInMillis();
        for (int b = 0; b<list.size(); b++){
            int a = b;
        }
        endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("For loop End Time -Start time = "+(endTime-startTime));

    }

}
