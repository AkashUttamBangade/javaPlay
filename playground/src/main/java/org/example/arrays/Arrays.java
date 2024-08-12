package org.example.arrays;

import java.util.*;

public class Arrays {
    public static void main(String[] args) {
    //   quizMisc();
     //   arrlength();
    //    joggedArray(3);
   //     threeDimensions();

        int[] numbers = new int[]{5, 6, 55, 2, 4, 8, 4,4, -9, -8 };
//        92, 2, 74, 55, 0, 10, -60, 24, 91, -67, 11
//        int k = 6;
//        int[] arrRet = lessThanknum(numbers,k);

//        int[] evenOdd = evenOdd(numbers);
//        int[] evenOdd1 = evenOdd1(numbers);

//        List<Integer> arr = new ArrayList<>();
//        arr.add(10);  arr.add(20);  arr.add(60);  arr.add(40);  arr.add(50);
//        boolean arraySortedOrNot = arraySortedOrNot(arr);
//        boolean arraySortedOrNot1 = arraySortedOrNot1(arr);
//
//        int N = 4;
//        int [][] M = {{2, 1, 4, 3},
//                {1, 2, 3, 2},
//                {3, 6, 2, 3},
//                {5, 2, 5, 3}};
//
//        int distinctNumbers = distinctNumbers(M, N);

        int i  = largestNumber(numbers);
        int d= sumNumbers(numbers);
        double dd = posAverage(numbers);

    }

    private static double posAverage(int[] numbers) {
        double retVal = 0;
        int count =0;
        for (int i=0; i<numbers.length; i++){
            if(numbers[i]>0){
                count++;
                retVal += numbers[i];
            }
        }
        retVal = retVal/count;
        System.out.println(retVal);
        return retVal;
    }

    private static int sumNumbers(int[] numbers) {
        int retVal= 0;
        for (int i=0; i<numbers.length; i++){
            retVal += numbers[i];
        }
        System.out.println(retVal);
        return retVal;
    }

    private static int largestNumber(int[] numbers) {
        int large = 0;
        for (int i=0; i<numbers.length; i++){
            if(large<numbers[i]){
                large = numbers[i];
            }
        }
        System.out.println(large);
        return large;
    }

    private static int distinctNumbers(int[][] m, int n) {
        int[] arrResult = new int[n];
        int index =0;
        for(int i=0; i<m[index].length; i++){
            arrResult[i] = m[index][i];
        }

        HashSet hs = new HashSet();

        while (index<arrResult.length){
        for(int i=1; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                if(arrResult[index]==m[i][j])
                    hs.add(m[i][j]);
                  //  System.out.println(m[i][j]+" ");
            }
            System.out.println();
        }
        index++;}

        System.out.println();
        for(int i=0; i<arrResult.length; i++){
            System.out.print(arrResult[i]+" ");
        }

        System.out.println(hs);
        return arrResult.length;
    }

    private static boolean arraySortedOrNot1(List<Integer> arr) {
        for(int i=1; i<arr.size(); i++){
            if (arr.get(i) < arr.get(i - 1))
                return false;
        }
        return true;
    }

    private static boolean arraySortedOrNot(List<Integer> arr) {
        boolean retVal = true;

        List<Integer> sortedList = new ArrayList<>();
        sortedList.addAll(arr);
        Collections.sort(sortedList);

        for(int i=0; i<arr.size(); i++){
            if(arr.get(i)!=sortedList.get(i)){
                retVal= false;
            }
        }
        System.out.println(retVal);
        return retVal;
    }

    private static int[] evenOdd1(int[] numbers) {
        int [] arr = new int[numbers.length];
        int index=0;
        for(int arrVal : numbers){
            if(arrVal%2==0){
                arr[index]=arrVal;
                index++;
            }
        }
        for(int arrVal : numbers){
            if(arrVal%2!=0){
                arr[index]=arrVal;
                index++;
            }
        }
        return arr;
    }

    private static int[] evenOdd(int[] numbers) {
        int[] result = new int[numbers.length];
        int evenIndex = 0;
        int oddIndex = numbers.length - 1;

        // Traverse the original array
        for (int number : numbers) {
            if (number % 2 == 0) {
                result[evenIndex] = number;
                evenIndex++;
            } else {
                result[oddIndex] = number;
                oddIndex--;
            }
        }

//        System.out.println(evenIndex+" "+oddIndex);
//        for(int i=1; i<=result.length; i++){
//            System.out.print(result[i-1]+ " ");
//        }

            oddIndex = evenIndex;
            for (int i = numbers.length - 1; i >= (numbers.length+oddIndex)/2; i--) {
                if (result[i] % 2 != 0) {
                    int temp = result[oddIndex];
                    result[oddIndex] = result[i];
                    result[i] = temp;
                    oddIndex++;
                }
            }

        System.out.println();
        System.out.println(evenIndex+" "+oddIndex);
        for(int i=1; i<=result.length; i++){
            System.out.print(result[i-1]+ " ");
        }

        return result;
    }

    private static int[] lessThanknum(int[] numbers, int k) {
        int count = 0;

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]<k){
                count++;
            }
        }

        int[] arr = new int[count];

        int index =0;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]<k){
                arr[index++] = numbers[i];
            }
        }

//        System.out.println();
//        for(int i=1; i<=arr.length; i++){
//            System.out.print(arr[i-1]+ " ");
//        }
        return arr;
    }

    private static void threeDimensions() {
        int [][][] arr1 = new int[3][2][2];
        int[][][] arr = new int[][][]{
                { {1, 2}, {1, 2} },
                { {3, 4}, {3, 4} },
                { {5, 6}, {5, 6} }
        };

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                for(int k=0; k<arr[i][j].length; k++){
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    private static void joggedArray(int r) {

        int arr1[][] = new int[][]{ new int[]{1,2,3,4}, new int[]{2,3,4,5}, new int[]{3,4,5,6} };
        int arr2[][] = { new int[]{1,2,3,4}, new int[]{2,3,4,5}, new int[]{3,4,5,6} };
        int arr3[][] = { {1,2,3,4}, {2,3,4,5}, {3,4,5,6} };
        int arr4[][] = new int[][]{ {1,2,3,4}, {2,3,4,5}, {3,4,5,6} };

        int[][] arr = new int[r][];
        System.out.println(arr.length);

        //initialize with row+1 digits.
        for(int i=0; i<r; i++){
            arr[i] = new int[i+1];
        }

        int count = 0;

        for(int i=0; i<r; i++){
            for(int j=0; j<=i; j++){
                System.out.print(arr[i][j]+" ");
                arr[i][j] = count++;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void arrlength() {
        int[] arr = {1, 2, 3, 4, 5};

        for(int i=arr.length-1; i>=0; i--){
            System.out.print("=="+arr[i]+" ");
        }

        System.out.println();
        for(int i=1; i<=arr.length; i++){
            System.out.println(arr[i-1]);
        }

        int [] arr3 = new int[5];

        for(int i=1; i<=arr3.length; i++){
            System.out.println(arr3[i-1]);
        }
    }

    private static void quizMisc() {
//        int size =0;
//        int arr[] = new int[size];
//        System.out.println(arr[0]);

        int arr1[][]={{1,3,5},{2,3,6,7}};
        System.out.println(arr1.length);

        for (int i=0; i<arr1[0].length; ++i){
            System.out.println(arr1[0]);
        }

        int length =0;
        if(!!(~~1!=0)){
            length=1;
        }else{length=-1;}

        int [] arr2= new int[length];
        arr2[0]=1;
        System.out.println(arr2.length);

        int [] arr3 = new int[length];
        arr3[0]=1;
        System.out.println(arr2==arr3);

    }
}
