package org.example;
import java.awt.geom.Area;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi!");
        Scanner Input = new Scanner(System.in);

       // System.out.println((2+3.5)*(5/5.0)+30.0-40.0/20.0-15.0);
       // System.out.println((2f + 100.1) + 1 - 15);
int A=20, B=25;

      //  System.out.println((float) A/(float)B);


       // System.out.println(A);
        //System.out.println(B);


       // System.out.println(A);
        //System.out.println(B);
//A++ نفذ   العمليه وبعدها  ضيف واحد
        //++A   ضيف واحد وبعدها     نفذ  العمليه


        System.out.println(A);
        System.out.println(B);
       // A*=5;   //A=A*5
       // System.out.println(A);
        //B/=5;   //B=B/5
        System.out.println(++B*--A*10);
 System.out.println(B++*--A*10);




    }
}