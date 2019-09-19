/*
 * 3. Play the guess the number game. Your program randomly generates
	an integer between 0 and 100 inclusively. Prompts the user to guess
	what this number is letter the user know the range and giving feedback
	on each guess.
 */

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // creates the scanner object
        Random rand = new Random(); // builds the random object
        int mysteryNumber = rand.nextInt(101); // generates a random number from 0-100 inclusive
        int input;

        System.out.println("Let's play the random number game, I will make a number you have to guess it.");
        System.out.println("Enter your first guess: ");
        input = scan.nextInt();

        while(input != mysteryNumber) {
            System.out.println("Sorry, that was not the number.");
            if (input >100 || input< 0) {
                System.out.println("Check your range, enter numbers between 0 and 100");
            }
            else if(input<mysteryNumber) {
                System.out.println("Try guessing something larger.");
            }
            else if(input > mysteryNumber) {
                System.out.println("Try guessing something smaller.");
            }
            System.out.println("Enter your next guess: ");
            input = scan.nextInt();
        }

        System.out.println("Congratulations, you guessed the number correctly, it was: " + mysteryNumber);


    }
}
