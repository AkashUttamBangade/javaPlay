package org.example.operator;

import java.util.Map;
import java.util.Optional;

public class Operator {
    public static void main(String[] args) {
    //    instanceOf();
    //    associavity();
    //    bitwise();
        shiftOps();
        findSum(10);
        findSumWithComplex(9);
        findLastDigit(9745);
        findLastDigit(-9745);
        arithmaticProgression(5,3,5);
        arithmaticProgression(2,1,5);

        geomatricProgression(2,3,5);
        geomatricProgression(1,2,4);
    }

    private static void arithmaticProgression(int start, int diff, int position) {
        int digit = start+((position-1)*diff);
        System.out.println("arithmaticProgression - "+digit);
    }

    private static void geomatricProgression(int start, int rate, int position) {
        //int digit = start*rate*(position-1);
        int digit = start * (int)Math.pow(rate,(position-1));
        System.out.println("geomatricProgression - "+digit);
    }

    private static void instanceOf(){
        Person p= new Person();
        Boy b = new Boy();

        System.out.println(p instanceof Person); //true
        System.out.println(p instanceof Boy); //False
        System.out.println(p instanceof Intra); //False

        System.out.println(b instanceof Person); //True
        System.out.println(b instanceof Boy); //True
        System.out.println(b instanceof Intra); //True

    }

    private static void associavity(){
        int a=20, b=30, c=40, d=5, e=6;
        System.out.println(a+b);
        System.out.println("Akash "+a);
        System.out.println("Akash "+a+b);
        System.out.println("Akash "+(a+b));
        System.out.println(a+b+" Akash "+c);

        System.out.println(a+++b);

        int g = d+++b;
        System.out.println(g);
        System.out.println(d);
    }

    private static void  bitwise(){
        int a = 5, b = 8;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a);

        String binary[]={
                "0000","0001","0010","0011","0100","0101",
                "0110","0111","1000","1001","1010",
                "1011","1100","1101","1110","1111"
        };

        System.out.println(" a= "+binary[a]);
        System.out.println(" b= "+binary[b]);
//        System.out.println(" a|b= "+binary[c]);
//        System.out.println(" a&b= "+binary[d]);
//        System.out.println(" a^b= "+binary[e]);
//        System.out.println("~a & b|a&~b= "+binary[f]);
//        System.out.println("~a= "+binary[g]);

    }

    private static void shiftOps(){
        int a = -1;

        System.out.println(a>>>30);
        System.out.println(a>>>31);
    }

    private static int findSum(int n){
        int sum =0;

        sum= (n*(n+1))/2;
        int sum1= (n*(n-1))/2;

        System.out.println("Find sum = "+sum);
        System.out.println("Find sum1 = "+sum1);

        return sum;
    }

    private static int findSumWithComplex(int n){
        int sum = 0;
        if(n%2 == 0)
            sum=(n/2)*(n+1);
        else
            sum=((n+1)/2)*n;

        System.out.println("findSumWithComplex sum = "+sum);
        return sum;
    }

    private static void findLastDigit(int n){
        System.out.println("Find Last Digit = "+ Math.abs(n%10));
    }
}

class Person{}
class Boy extends Person implements Intra{}
interface Intra{}
