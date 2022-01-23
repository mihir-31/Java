package com.company;

import java.util.Scanner;
import java.util.Random;
public class Exercies2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: 0 for rock , 1 for paper , 2 for scissor  : ");
        int userInput = sc.nextInt();
        Random random = new Random();
        int CompInput = random.nextInt(3);
        if(userInput==CompInput){
            System.out.println("Draw");
        }
        else if(userInput==0&&CompInput==2||userInput==1&&CompInput==0||userInput==2&&CompInput==1){
            System.out.println("YOU WON");
        }
        else{
            System.out.println("COMPUTER WON");
        }
        System.out.println("Computer choice: "+CompInput );


    }
}
