package com.company;
import java.util.Scanner;
public class Result{
    public static void main(String[] args) {
        System.out.println("Enter Your Marks of");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your DBMS marks : ");
        int D = sc.nextInt();
        System.out.println("Enter your CN marks : ");
        int C = sc.nextInt();
        System.out.println("Enter your TOC marks : ");
        int T = sc.nextInt();
        System.out.println("Enter Your SPOS marks : ");
        int S = sc.nextInt();
        System.out.println("Enter your IOT marks : ");
        int I = sc.nextInt();
        float Percentage = (float) (D+C+T+S+I)/500.0f * 100.0f;
        System.out.println("Percentage obtained by student is " + Percentage  + "%");


    }


}
