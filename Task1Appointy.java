/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1appointy;

import java.util.Random;

import java.util.Scanner;

/**
 *
 * @author HimanshuSoni3105@outlook.com
 */
public class Task1Appointy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereSystem.out.println("Welcome to Rock, Paper, Scissors; Let's Play!");

       
        Scanner name = new Scanner(System.in);
        
        
            Scanner round = new Scanner(System.in);
       // Scanner sc = new Scanner(System.in);


        System.out.println("Hello World( ;-) I greet usually in this way..) \nHow many rounds would you love to play?");
        int rounds = round.nextInt();

        int value = 0;
        int player = 0;
        int computer = 0;

        do {
            // System.out.println("Current rounds played: " + value);

            String[] rps = {"rock", "paper", "scissors"};
            Random random = new Random();

            Scanner pchoice = new Scanner(System.in);
           
            System.out.println("Please enter Rock, Paper or Scissors:");
            String choiceprev;
            
                choiceprev = pchoice.nextLine();
               String choice;
                    choice = choiceprev.toLowerCase();
          
                    System.out.println();

            int select = random.nextInt(rps.length);

            System.out.println("Computer select: " + rps[select]);
            System.out.println("You selected: " + choice);
            System.out.println();

            if (choice.equals(rps[select])) {
                System.out.println("Its a Tie");
            }
            else {
                if(choice.equals("rock")) {
                    if(rps[select].equals(rps[1])) {
                        System.out.println("Paper beats rock.");
                        computer++;
                    }
                    if(rps[select].equals(rps[2])) {
                        System.out.println("Rock beats scissors.");
                        player++;
                    }
                }
                else if(choice.equals("paper")) {
                    if(rps[select].equals(rps[0])) {
                        System.out.println("Paper beats rock.");
                        player++;
                    }
                    if(rps[select].equals(rps[2])) {
                        System.out.println("Scissors beat paper.");
                        computer++;

                    }

                }
               else if(choice.equals("scissors")) {
                    if(rps[select].equals(rps[0])) {
                        System.out.println("Rock beat scissors.");
                        computer++;

                    }
                    if(rps[select].equals(rps[1])) {
                        System.out.println("Scissor beat Paper.");
                        player++;
                    }
                }
                else{
                    System.out.println("Please input CORRECT SPELLING or WORD..Try again!!;");
                }
            }

            System.out.println();
            System.out.println("You : " + player);
            System.out.println("Computer: " + computer);
            System.out.println();
            System.out.println();


           

            value++;
        }
        while(value < rounds);

                                        System.out.println("Final Score!");
                                        System.out.println(" You : " + player);
                                        System.out.println("Computer:" + computer);
                                        System.out.println();

                if(computer> player  ) {
                     System.out.println("You Lose! My Computer Wins ;-)");
                }
                
        if(  player>computer) {
              System.out.println("Congrats!! "  + ", You won!");
        }

    }
    
}
