
import java.util.Random;
import java.util.Scanner;
import java.util.*;

class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        String anotherGame = new String();

        do {
            int playerGuess = 0;
            int numGuesses = 5;
            int randomNumber  = rand.nextInt(100);

            System.out.println("\nLet the guessing begin...\n");
            System.out.println("You are limited to only " + numGuesses + " guesses.");

            System.out.println("Enter your guess between 1-100: ");

            while (playerGuess != randomNumber) {

                try {
                    playerGuess = input.nextInt();

                } catch (InputMismatchException e) {
                    System.out.println("\nNo letters or words allowed!");
                    System.out.println("Enter your guess between 1-100: ");
                    input.nextLine();
                    continue;
                }

                if (numGuesses == 1){
                    System.out.println("You have run out of guesses.");
                    System.out.println("The number was " + randomNumber + ".");
                    break;
                }
                else if (randomNumber > playerGuess){
                    numGuesses -= 1;
                    System.out.println("Think higher than " + playerGuess);
                    System.out.println("You have " + numGuesses + " left.");
                }
                else if (randomNumber < playerGuess){
                    numGuesses -= 1;
                    System.out.println("Think lower than " + playerGuess);
                    System.out.println("You have " + numGuesses + " left.");
                }
                else if (randomNumber == playerGuess) {
                    System.out.println("Your guess was right! You are the champion!");
                    System.out.println("The number was " + randomNumber + ".");
                }
            }

            System.out.println("\nWould you like to play again?");
            System.out.println("Please type \"yes\"" + " or \"no\".");
            //System.out.println("Please type yes/no");
            anotherGame = input.next();

        } while (anotherGame.equalsIgnoreCase("yes"));

        System.out.println("\nThanks for playing my number guessing game!");
        input.close();

    }//main method


}//main class
