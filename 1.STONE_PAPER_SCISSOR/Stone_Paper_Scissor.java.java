//coding with mr_tamizhan_03
//java coding for stone,paper & scissor

import java.util.Scanner;  //import scanner class of util package
import java.util.*;        //import java util package 
import java.util.Random;   //import random class of util package

public class Stone_Paper_Scissor   //class name Stone_Paper_Scissor
{
    public static void main(String args[])
    {
        System.out.println("WELCOME TO THE STONE,PAPER & SCISSOR GAME!!");  //print the welcome message

        int userChoice, computerChoice, stone, paper, scissor;

        Scanner code = new Scanner(System.in);  //initialze the scanner class
       //create random input for the computer
       Random rnd = new Random();  
      
      //Assigning values to the following variables:
      stone = 0;
      paper = 1;
      scissor = 2;
      
      //display the choice 
      System.out.println("ENTER THE CHOICE!!! ");
      System.out.println("0=STONE");
      System.out.println("1=PAPER"); 
      System.out.println("2=SCISSOR");

      userChoice =code.nextInt();
        //if user chooses above 2
        while (userChoice > 2) {
            System.out.println("give number between 0 and 2");
            userChoice = code.nextInt();
        }
       //user selections
       if (userChoice == stone)
       {
         System.out.println("User choose STONE");
       }
       else if(userChoice == paper)
        {
          System.out.println("User choose PAPER");
        }
       else
        {
          System.out.println("User choose SCISSOR");
        }
			//computer input (random)
            computerChoice = rnd.nextInt(3);
      
            //computer selection
            if(computerChoice == stone)
            {
              System.out.println("Computer cho ose STONE");
            }
            else if(computerChoice == paper)
              {
                System.out.println("Computer choose PAPER");
              }
            else
              {
                System.out.println("Computer choose SCISSOR");
              }
               //Results section
      
      //Draw
      while (userChoice == computerChoice) {
        System.out.println("draw try again");
        
        // if user chooses above 2
        userChoice = code.nextInt();
                      while (userChoice > 2) {
                        System.out.println("give number between 0 and 2");
                        userChoice = code.nextInt();
                        }
        computerChoice = rnd.nextInt(3);
                   // DRAW user selections
                    if (userChoice ==stone)
                        {
                            System.out.println("User chose STONE");
                        }
                    else
                    {
                        if(userChoice== paper)
                        {
                            System.out.println("User choose PAPER");
                        }
                        else
                        {
                            System.out.println("User choose SCISSOR");
                        }
        }      
                   //DRAW computer selection
                    if(computerChoice == stone)
                        {
                            System.out.println("Computer choose STONE");
                        }
                    else
                        {
                            if(computerChoice == paper)
                            {
                                System.out.println("Computer cho0se PAPER");
                            }
                            else
                            {
                                System.out.println("Computer cho0se SCISSORS");
                            }
                        }
                    } //END DRAW
  
//RESULTS
  if (computerChoice==stone)
    {
        if (userChoice==paper)
        {  
            System.out.println("User wins!");
        }
        else 
        {
            System.out.println("Computer Wins");
        }
    }
  else if (computerChoice==paper)
  {
    if (userChoice==stone)
        {
            System.out.println("Computer wins");
        }
    else
        {
            System.out.println("User Wins!");
        }
  }
  else if (userChoice==stone)
  {
    System.out.println("User Wins");
  }
  else
  {
      System.out.println("Computer Wins");
  }
            



     //Print a final message for the user
System.out.println("THANKS FOR PLAYING THE STONE,PAPER & SCISSOR GAME");
    }
}