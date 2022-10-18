package org.example;

import java.util.Random;
import java.util.Scanner;
    public class RockPaperScissors {
        public static void main(String[] args) {
            Scanner usrChoice = new Scanner(System.in);
            Random compChoice = new Random();
            int winsUser = 0;
            int winsComp = 0;
            int winsTies = 0;
            int rounds2Play = 0;
            Integer integer = null;

            while (true) {
                System.out.println("Welcome to Rock, Paper, Scissors! ");
                System.out.println("How many rounds would you like to play? Please choose a number between 1-10 ");
                while (rounds2Play > 10 || rounds2Play < 1) ;
                rounds2Play = Scanner.nextInt();
                int rounds2Play = Integer.parseInt(scanner.nextLine());
                {
                    System.out.println("You can't play " + rounds2Play + " rounds. Choose a number between 1-10");
                    System.out.println("How many rounds do you want to play? ");
                    int roundsCount = usrChoice.nextInt();

                    if (roundsCount < 1 || roundsCount > 10)
                        break;
                }

                for (int i = 1; i <= rounds2Play; i++) {
                    System.out.println(" Please select one of the following: ");
                    System.out.println("[1] for Rock");
                    System.out.println("[2] for Paper");
                    System.out.println("[3] for Scissors");
                    System.out.println("[x] for Exit");

                    // user choices
                    int numChoice = usrChoice.nextInt();
                    switch (numChoice) {
                        case 1:
                            numChoice = 1;
                            System.out.println("You Chose: Rock");
                            break;
                        case 2:
                            numChoice = 2;
                            System.out.println("You Chose: Paper");
                            break;
                        case 3:
                            numChoice = 3;
                            System.out.println("You Chose: Scissors");
                            break;

                    }
                    if (numChoice != 1 || numChoice != 2 || numChoice != 3)
                        System.out.println("Awe man you lost!");

                    // computer choices
                    int numChoice2 = compChoice.nextInt(3) + 1;
                    switch (numChoice2) {
                        case 1:
                            numChoice2 = 1;
                            System.out.println("The computer chose: Rock");
                            break;
                        case 2:
                            numChoice2 = 2;
                            System.out.println("The computer chose: Paper");
                            break;
                        case 3:
                            numChoice2 = 3;
                            System.out.println("The computer chose: Scissors");
                            break;
                    }
                    // the rules of the game
                    if (numChoice == 1 && numChoice2 == 1) {
                        System.out.println("Wow it's a tie!");
                        winsTies++;
                    }
                    if (numChoice == 2 && numChoice2 == 1) {
                        System.out.println("Yay! You won!");
                        winsUser++;
                    }
                    if (numChoice == 3 && numChoice2 == 1) {
                        System.out.println("Awe the computer won!");
                        winsComp++;
                    }
                    if (numChoice == 1 && numChoice2 == 2) {
                        System.out.println("Winner: COMPUTER");
                        winsComp++;
                    }
                    if (numChoice == 2 && numChoice2 == 2) {
                        System.out.println("Wow it's a tie!");
                        winsTies++;
                    }
                    if (numChoice == 3 && numChoice2 == 2) {
                        System.out.println("Yay! You won!");
                        winsUser++;
                    }
                    if (numChoice == 1 && numChoice2 == 3) {
                        System.out.println("Yay! You won!");
                        winsUser++;
                    }
                    if (numChoice == 2 && numChoice2 == 3) {
                        System.out.println("Awe the computer won!");
                        winsComp++;
                    }
                    if (numChoice == 3 && numChoice2 == 3) {
                        System.out.println("Wow it's a tie!");
                        winsTies++;
                    }
                }
                // End Game display screen
                System.out.println("You Won: " + winsUser + " rounds");
                System.out.println("The computer won: " + winsComp + " rounds");
                System.out.println("There were " + winsTies + " ties");

                if (winsUser > winsComp)
                    System.out.println("You were the overall winner!");
                if (winsUser < winsComp)
                    System.out.println("The overall winner was the computer!");
                if (winsUser == winsComp)
                    System.out.println("In the end you guys tied!");

                System.out.println("Do you want to play again? 'Y' or 'N'? ");
                String usrQuestion = usrChoice.nextLine();

                if (usrChoice.nextLine().equals("[Y]"))
                    continue;
                else {
                    System.out.println("Thank you For Playing!");
                    break;
                }

            }


        }
    }