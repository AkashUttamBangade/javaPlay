package org.example.Methods;

import static org.example.loop.Loops.isPrime;

class Methods {
    // swap() doesn't swap i and j

    public static void main(String[] args)
    {
        System.out.println(args.length+6);
        Integer i = new Integer(10);
        Integer j = new Integer(20);
        swap(i, j);
        System.out.println(" i = " + i + " , j = " + j);

        argumentFunction(1,2);
        firstDigit(58764);
        printPrimeFactorization(12);

    }

    public static void printPrimeFactorization(int n){
        for(int i=2; i<=n; i++){
            boolean isPrime = isPrime(i);
            if(isPrime){
                while (n%i==0){
                    System.out.print(i+" ");
                    n=n/i;
                }
            }
        }
    }

    public static void argumentFunction(int a, int b){
        System.out.println(a+b);
    }

    public static int firstDigit(int n){
        double pw = Math.pow(10, (int) Math.log10(n));
        n= (int) (n/pw);
        return n;
    }

    public static void swap(Integer i, Integer j)
    {
        Integer temp = new Integer(i);
        i = j;
        j = temp;
    }
}
