package org.example.inputOutput;

import java.io.*;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class InputOutput {
    public static void main(String[] args) throws IOException, ParseException {
        // Geeks g = new Geeks();
        //Geeks.IOFunction();

//        System.out.println("--------------------------------------------------");
//        User user = new User();
//        user.getInfo();

//        System.out.println("--------------------------------------------------");
//        ioStreamRead.ioStreamMethod();

//        System.out.println("--------------------------------------------------");
//        ioStreamReadWrite.ioStreamMethod();

//        System.out.println("--------------------------------------------------");
//        ioStreamReadByte.ioStreamMethod();

//        System.out.println("--------------------------------------------------");
//        bufferReader.ioStreamMethod();
//        bufferReader1.ioStreamMethod();

//        outputFormatter.ioStreamMethod();

        FastIO.ioStreamMethod();


    }
}

class Geeks{
    static void IOFunction() throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        System.out.println(true);

        char cc = 'a';
        System.out.println(cc+1);

        while(t-- > 0){

            int a = sc.nextInt();
            float b = sc.nextFloat();
            long c = sc.nextLong();
            byte d = sc.nextByte();
            sc.nextLine();
            String s=sc.nextLine();

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(s);

            double aa = sc.nextDouble();

            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            String myInput = read.readLine();

            int num_int = sc.nextInt();
            String num = Integer.toString(num_int);

            int ans = Integer.valueOf(num) *2;
            int ans1 = Integer.parseInt(num);

            Scanner scn = new Scanner(System.in);


        }

    }
}

class User{

    //Scanner Class

    public void getInfo() {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        char gender = sc.next().charAt(0);
        int age = sc.nextInt();
        long mobileNo = sc.nextLong();
        double cgpa = sc.nextDouble();

        float sum = 0, count=0;
        System.out.println("Enter sequential marks.");
        while(sc.hasNextFloat()){
            float sum1=sc.nextFloat();
            sum+=sum1;
            count++;
        }
        float average = sum/count;

        System.out.println("Name - "+name);
        System.out.println("Gender - "+gender);
        System.out.println("age - "+age);
        System.out.println("Mobile No. - "+mobileNo);
        System.out.println("CGPA - "+cgpa);

        System.out.println("Average sum = "+average);

    }
}

class ioStreamRead{

    public static void ioStreamMethod() throws IOException {

        FileReader fr = null;
        try {
            fr = new FileReader("C:/InspiSpace/qualys/logs/am/logback.properties");
            int temp;
            while((temp = fr.read())!=-1){
                System.out.print((char)temp);
            }
        }
        finally {
            if(fr != null){
                fr.close();
            }
        }

    }
}

class ioStreamReadWrite {

    public static void ioStreamMethod() throws IOException {

        FileReader fr = null;
        FileWriter fw = null;
        try{
            fr = new FileReader("C:/InspiSpace/qualys/logs/am/logback.properties");
            fw = new FileWriter("C:/InspiSpace/qualys/logs/am/logback1.properties");
            System.out.print(fr.read());
            int temp;
            while((temp = fr.read())!=-1){
               // System.out.print((char)temp);
                fw.write(temp);
            }
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(fr != null){
                fr.close();
            }
            if (fw != null) {
                fw.close();
            }
        }
    }
}

class ioStreamReadByte {

    public static void ioStreamMethod() {

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
         fis = new FileInputStream("C:/InspiSpace/qualys/logs/am/logback.properties");
         fos = new FileOutputStream("C:/InspiSpace/qualys/logs/am/logback2.properties");
         int temp;
         while ((temp= fis.read())!=-1){
             fos.write((byte) temp);
             //fos.write(temp);
         }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class bufferReader {

    public static void ioStreamMethod() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Integer : ");
        int i = scn.nextInt();

        System.out.println("Enter String : ");
        String s = scn.nextLine();

        System.out.println("Integer and String : "+i+"  "+s);

    }
}

class bufferReader1 {

    public static void ioStreamMethod() throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Integer : ");
        int i = Integer.parseInt(bf.readLine());


        System.out.println("Enter String : ");
        String s = bf.readLine();

        System.out.println("Integer and String : "+i+"  "+s);

        String str = System.console().readLine();
        System.out.println(str);

    }
}

class outputFormatter {

    public static void ioStreamMethod() throws ParseException {
        //1. Formatting output using System.out.printf()

        int x=9;
        System.out.printf("use - %d",x);
        System.out.printf("use -%.3f\n",Math.PI);

        //2. Formatting using DecimalFormat class
        double d= 5467.83496;
        DecimalFormat df = new DecimalFormat("###");
        System.out.println("use - "+df.format(d));

        DecimalFormat df1 = new DecimalFormat("##.##");
        System.out.println("use - "+df1.format(d));

        DecimalFormat df2 = new DecimalFormat("00000000.00000000");
        System.out.println("use - "+df2.format(d));

        DecimalFormat df3 = new DecimalFormat("###,##.000000000");
        System.out.println("use - "+df3.format(d));

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        String str = "07/12/2020";

        String str1 = sdf.format(new Date());
        System.out.println(str1);
        System.out.println(sdf.parse(str));
    }
}

class FastIO {

    public static void ioStreamMethod() {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int k = scn.nextInt();

        int count=0;
        while (n-- >0){
            int sum = scn.nextInt();
            if(sum%k == 0){
                count++;

            }
        }

        System.out.println(count);
    }
}

class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader()
    {
        br = new BufferedReader(
                new InputStreamReader(System.in));
    }

    String next()
    {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() { return Integer.parseInt(next()); }

    long nextLong() { return Long.parseLong(next()); }

    double nextDouble()
    {
        return Double.parseDouble(next());
    }

    String nextLine()
    {
        String str = "";
        try {
            if(st.hasMoreTokens()){
                str = st.nextToken("\n");
            }
            else{
                str = br.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
