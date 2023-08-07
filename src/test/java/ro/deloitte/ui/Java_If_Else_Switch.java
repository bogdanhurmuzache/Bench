package ro.deloitte.ui;

import java.util.Random;
import java.util.Scanner;


public class Java_If_Else_Switch {

                                                    //If ELSE

        /*private static final int ROCK = 0;
        private static final int PAPER = 1;
        private static final int SCISSORS = 2;

        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random randomGenerator = new Random();

            String playerChoice;
            int playerValue = -1;
            int computerValue = randomGenerator.nextInt( 3);
            String computerChoice;

            // The code for the solution goes below this comment;
            if (computerValue == ROCK){
                computerChoice = "rock";
            } else if (computerValue == PAPER){
                computerChoice = "paper";
            } else {
                computerChoice = "scissors";
            }

            System.out.println("Please enter rock, paper or scissors ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (playerChoice.equals("rock")){
                playerValue = ROCK;
            }

            else if (playerChoice.equals("paper")){
                playerValue = PAPER;
            }

            else if (playerChoice.equals("scissors")){
                playerValue = SCISSORS;
            } else {
                System.out.printf("%s is not a valid choice.%n", playerChoice);
            }

            System.out.printf("Computer chose %s, player chose %s.%n", computerChoice, playerChoice);
            if (playerValue == computerValue){
                System.out.println("It's a draw!");
            } else if ((playerValue - 1 == computerValue)
                || (playerValue == ROCK && computerValue == SCISSORS)) {
                System.out.println("Player wins");
            }

            //System.out.printf("Player chose %s, the value is %s.%n", playerChoice, playerValue);
            scanner.close();
        }*/


                                                                    // SWITCH

    /*public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userChoice;

        System.out.println("Please choose one of the following options: ");
        System.out.println("1 - Cappucino");
        System.out.println("2 - Latte");
        System.out.println("3 - Americano");
        System.out.println("4 - Mocha");
        System.out.println("5 - Macchiato");
        System.out.println("6 - Espresso");
        System.out.println("Q - Quit the program");

        do {
            userChoice = scanner.nextLine();
            userChoice = userChoice.toLowerCase();
            System.out.println("You chose " + userChoice);

            switch(userChoice){
                case "1":
                    //System.out.println("Making Cappucino...");
                    //System.out.println("Steam the milk...");
                    //System.out.println("Froth the milk...");
                    //System.out.println("Make espresso...");
                    //System.out.println("Add the milk to the espresso...");
                    //break;
                case  "2":
                    System.out.println("making latte...");
                    System.out.println("Make espresso");
                    System.out.println("Steam the milk");
                    System.out.println("Add the milk to the espresso");
                    break;

                case "3":
                    System.out.println("Making the Americano");
                    break;

                case "4":
                    System.out.println("Making Mocha");
                    break;

                case "5":
                    System.out.println("Making Macchiato");
                    break;

                case "6":
                    System.out.println("Making Espresso");
                    break;

                default:
                    System.out.println("Returning coins");
                    break;
            }

        } while (!userChoice.equals("q"));


        scanner.close();
    }*/



                                                    // EXERCISE, copy into another Class file.

    /*public class TestClass {
        public static void main(String[] args) {
            Object obj1 = new Object();
            Object obj2 = obj1;
            if (obj1.equals(obj2)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }*/
}



