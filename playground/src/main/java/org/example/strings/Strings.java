package org.example.strings;

import java.util.*;

public class Strings {
    public static void main(String[] args) {

        miscelleneous1();

        int strLength = lengthString("gEEkdsa");
        int countWords = countWords("We are Here.");
        String sliceString = sliceString("Hello");
        changeCase("world");
        alphabets('c', 'n');

        System.out.println();
        boolean isPanagram = isPanagram("Thequickbrownsoverthelazydog");

        char extraChar = extraChar("eabcd", "abcde");
        boolean isAnagram = isAnagram("aabaa ", "baaaaa");
        System.out.println("isAnagram = " + isAnagram);

        boolean isPalindrome = isPalin("TenEt");
        System.out.println("isPalindrome = " + isPalindrome);

        String reverseString = reverseString("Hello");
        System.out.println("reverseString = " + reverseString);
        String reverseString1 = reverseString1("Hello");
        System.out.println("reverseString1 = " + reverseString1);

        toBinary("10");
        int binary_to_decimal = binary_to_decimal("1010");
        System.out.println("binary_to_decimal = " + binary_to_decimal);

        int findPattern = findPattern("geeksforgeeks", "ageeks");
        System.out.println("findPattern = " + findPattern);

    }

    private static int findPattern(String s, String p) {
     //   for(int i = 0; i<s.length()-p.length()-1; i++){
            return s.indexOf(p);
    }

    private static int binary_to_decimal(String number) {
        int retVal = 0;
        int pos2 = 1;

        for (int i = number.length()-1; i>=0; i--){
            retVal = retVal+(number.charAt(i)-'0')*pos2;
            pos2 = pos2*2;
        }
        return retVal;
    }

    private static void toBinary(String N) {
        int n = Integer.valueOf(N);
        String retVal = "";
        while (n > 0) {
            retVal = (n%2)+retVal;
            n=n/2;
        }
        System.out.println(retVal);
    }

    private static String reverseString1(String s) {
        String retVal = "";
        int n = s.length()-1;
        for (int i = n; i>=0; i--){
            retVal = retVal+s.charAt(i);
        }
        return retVal;
    }

    private static String reverseString(String s) {
        return new StringBuffer(s).reverse().toString();
    }

    private static boolean isPalin(String s) {
        boolean retVal = true;
        String str = s.toLowerCase();
        for(int i = 0; i<str.length()/2; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return retVal;
    }

    private static void miscelleneous1() {
        String a = null;
        String b = "null";
//        System.out.println("a == b = "+ (a==b));
//        System.out.println("a.equals(b) = "+ a.equals(b));
//        System.out.println("a.contains(b) = "+ a.contains(b));

        System.out.println("--------------------***************--------------------");

        String first = "GFG";
        String second = new String("GFG");

        System.out.println("first==second = "+ (first==second));
        System.out.println("first.equals(second) = "+ first.equals(second));
        System.out.println("first.equals(new String(\"GFG\")) = "+ first.equals(new String("GFG")));
        System.out.println("first.equals(new String(second)) = "+ first.equals(new String(second)));
        System.out.println(first = new String(first));

        System.out.println("--------------------***************--------------------");

        first = "GFGg";
        String first1 = "GFG";

        System.out.println("first == (first1.concat(first)) = "+(first == (first1.concat(first))));
        System.out.println("first.equals(\"\"+first1+\"g\")) = "+(first.equals(""+first1+"g")));

        System.out.println("--------------------***************--------------------");

        StringBuffer sb1 = new StringBuffer("GFG1");
        StringBuffer sb2 = new StringBuffer("GFG1");

        System.out.println("sb1==sb2 = "+ (sb1==sb2));
        System.out.println("sb1.equals(sb2) = "+ sb1.equals(sb2));
        System.out.println("sb1.toString.equals(sb2.toString) = "+ sb1.toString().equals(sb2.toString()));
        System.out.println("sb1.equals(sb1) = "+ sb1.equals(sb1));
        //System.out.println("a.contains(b) = "+ a.contains(b));

        StringBuffer sb3 = sb1;
        System.out.println("Before sb1 reverse 1, 3 = "+sb1+" "+sb3);
        sb1 = sb1.reverse().append(sb3.reverse());
        System.out.println("After sb1 reverse = "+sb3);
        System.out.println(sb1);

        System.out.println("--------------------***************--------------------");

        StringBuffer strBuf = new StringBuffer("gfg1");
        String strbufstr = "gfg1";

//        int i = strBuf.compareTo(strBuf);
//     //   System.out.println(strBuf.compareTo(strBuf));
//        System.out.println(i);
        System.out.println(strBuf.toString().indexOf("g", 1));
        System.out.println('a'^97^12);

    }

    private static boolean isAnagram(String a, String b) {
        boolean retVal = true;

        if(a.length()!=b.length())
            return retVal;

        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        Arrays.sort(aChars);
        Arrays.sort(bChars);

        for(int i =0; i<aChars.length; i++) {
            if (aChars[i] != bChars[i])
                return false;
        }
        return retVal;
    }

    private static char extraChar(String s1, String s2) {
        char retChar = 0;

        for(int i=0; i<s1.length(); i++){ //0000^a, b, c, d
            retChar ^=s1.charAt(i);
          //  System.out.println(retChar+" "+(int)retChar);
        }
        System.out.println();
        for(int i=0; i<s2.length(); i++){
            retChar ^=s2.charAt(i);
           // System.out.println(retChar+" "+(int)retChar);
        }

     //   System.out.println(retChar+"--------");

        return retChar;
    }

    private static boolean isPanagram(String str) {
        boolean isPanagram = false;
        char[] atoz = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] strCharArray = str.toLowerCase().toCharArray();
        Arrays.sort(strCharArray);
        System.out.println(strCharArray);

        Set<Character> alphabets = new HashSet<>();

        for(char ch : strCharArray){
            if(Character.isLetter(ch)){
                alphabets.add(ch);
            }
        }

        if(alphabets.size()==26)
            isPanagram = true;

        System.out.println("isPanagram - "+isPanagram);
        return isPanagram;
    }

    private static void alphabets(char c1, char c2) {
        for(char c = c1; c<=c2; c++){
            System.out.print(c+" ");
        }
    }

    private static void changeCase(String s) {
        System.out.println("changeCase 1 - "+s.substring(0,1).toUpperCase()+s.substring(1));
        System.out.println("changeCase 2 - "+s.toUpperCase());
    }

    private static String sliceString(String s) {
        String retVal = "";
        //ignore first and last word
        retVal = s.substring(1, s.length()-1);
        System.out.println("sliceString - "+retVal);
        return retVal;
    }

    private static int countWords(String str) {
        int countWords =0;
            countWords = str.split("\\s").length;
            System.out.println("countWords - "+countWords);
        return countWords;
    }

    private static int lengthString(String geeks) {
        System.out.println("lengthString - "+geeks.length());
        return geeks.length();
    }
}
