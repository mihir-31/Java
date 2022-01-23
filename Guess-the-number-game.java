package com.company;

import java.util.Random;
import java.util.Scanner;

class game{
    int number;
    int UserInput;
    int noOfGuess=0;
    game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number");
        UserInput = sc.nextInt();
    }
    public boolean isCorrectNumber(){
        noOfGuess++;
        if (UserInput==number ){
            System.out.format("You have guess it right, Yes it is %d\nYou have attempted it for %d times",number,noOfGuess);
            return true;
        }
        else if (UserInput<number){
            System.out.println("Low...");
        }
        else if (UserInput>number){
            System.out.println("High...");
        }
        return false;
    }
}
public class Exercise3{
    public static void main(String[] args) {
        game g = new game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }

}
