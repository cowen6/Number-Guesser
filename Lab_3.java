/*
Name: Charlie Owen
Class: CS 232-002
Project: Number-Guessing Game; The user tries to guess a randomly generated secret
    number from 1 to 100. The program gives hints to if the user's guess is too
    low or too high. The program will output a congratulations message if the
    number is guessed and output the number of guesses used. If number is not
    guesssed in certain amount of guesses, program outpots a loss message.
Due: September 12th, 2021
 */
package lab_3;
import java.util.Scanner;

public class Lab_3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Create random and secret number
        int secret_num = (int) (Math.random() * 100) + 1;
        
        //Declare variables
        int num_guess = 0; //Set number of current guesses to 0
        int guess;
        
        System.out.println("I am thinking of a number between 1 and 100 ...");
        
        System.out.print("Please guess a number:  ");
        guess = input.nextInt(); //Take input and set as user's guess
        num_guess++; //increment user's number of guesses
        
        //Continue game until secret number is quessed or user guesses 15 times
        while(guess != secret_num && num_guess < 15){
            //Says if user's guess is too high
            if (guess > secret_num){
                System.out.println(guess + " is too high.");
            }
            //says if user's guess is too low
            else if (guess < secret_num){
                System.out.println(guess + " is too low.");
            }
            //Asks for another number
            System.out.print("Please guess a number:  ");
            guess = input.nextInt();
            num_guess++; //increments user's number of guesses
        }
        //Output Congratulations! message if secret number is guessed
        if (guess == secret_num){
            System.out.println("Congratulations! You guessed the number in " + num_guess + " guess(es)!");
        }
        //If user runs out of guesses, out put a Sorry! message
        else{
            System.out.println("Sorry! You failed to guess the number within 15 guess(es). The secret number was: " + secret_num + ".");
        }
    }
}