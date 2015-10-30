package canady_3_strings;

import java.util.Random;
import java.util.Scanner;

public class Canady_3_guessinggame {

    static Scanner sc = new Scanner(System.in);
    static int magicnumber;
    static int userguess;
    static String username;
    static Random randy = new Random();
    public static int counter = 3;

    public static void main(String[] args) {
        magicnumber = randy.nextInt(11);
        System.out.println("What is your name?");
        username = sc.nextLine();
        System.out.println("Let's play a guessing game, " + username + ".");
        System.out.println("The answer is between 1 and 10 and you have 3 guesses.");
        while(counter > 0) {
            playthegame();
        }
        if(counter == 0){
            System.out.println("Sorry! You lose.");
        }
    }

    static void playthegame() {
        Scanner userinputnumbers = new Scanner(System.in);
        System.out.println("Guess a number:");
        userguess = sc.nextInt();
        if (magicnumber == userguess) {
            System.out.println("Good job! You win.");
                counter = -1;
        } else {
            if (magicnumber > userguess) {
                counter--;
                System.out.println("Too low! " + counter + " guesses left.");
            } if(magicnumber < userguess) {
                counter--;
                System.out.println("Too high! " + counter + " guesses left.");
            }
        }
    }
} 
