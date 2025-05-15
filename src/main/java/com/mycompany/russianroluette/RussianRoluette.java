/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.russianroluette;

import java.util.Random;
import javax.swing.JOptionPane ;


/**
 *
 * @author 4nzuz
 */
public class RussianRoluette {

    public static void main(String[] args) {
        //Create Random object to generate a random number
        Random random = new Random() ;
        //Generate a random number between 1 and 100 (inclusive)
        int numberToGuess = random.nextInt(6)+1 ;
        //Counter to keep track of the number of guesses the user makes
        int numberOfTries = 0;
        //Variable to store user's guess
        int guess;
        //Boolean flag to determine if the user has guessed correctly
        boolean hasWon = false;
        
        //Welcom messsage to the user
        JOptionPane.showMessageDialog(null, "!!Welcome to RUSSIAN ROLUETTE!!");
        JOptionPane.showMessageDialog(null,"If you guess the same number as the bot, YOU DIE! ");
        
           int game=  JOptionPane.showConfirmDialog(null, "Would you like to continue?"+ JOptionPane.YES_NO_CANCEL_OPTION) ;
                 if (game==JOptionPane.YES_OPTION) {
        
        //Loop continues until the user guesses the correct number
        while (!hasWon) { //i.e: Is not False = is true
              //Prompt the user to enter a guess
             String Guess = JOptionPane.showInputDialog("You got 6 chambers...\nPick one and try your luck...");
            guess = Integer.parseInt(Guess);
           //Read the guess of the user
             numberOfTries++ ; //Increment the number of tries (numberOfTries = numberOfTries+1)
             
             //Check if the guess is lower than the target number
             if (guess<numberToGuess) {
                 JOptionPane.showMessageDialog(null,"You survive,\nfor now...");
                 int choice1 = JOptionPane.showConfirmDialog(null, "Would you like to continue?" +JOptionPane.YES_NO_OPTION) ;
                 if (choice1 ==JOptionPane.YES_OPTION) {
                 continue ;
                 } else {
                 break;
                 }
                 
            }
             //Check if the guess is higher than the targer number
             else if (guess>numberToGuess){
                 JOptionPane.showMessageDialog(null,"You're still alive???");
                 int choice = JOptionPane.showConfirmDialog(null, "Would you like to continue?" + JOptionPane.YES_NO_OPTION);
                 if (choice ==JOptionPane.YES_OPTION) {
                 continue;
                 } else {
                 break;
                 }
            }
             //If the guess is spot on (correct)
             else {
                 JOptionPane.showMessageDialog(null,"YOU'VE BEEN SHOT!!! Chamber number: "+ guess+ "  was loaded! \nYou died after: "+numberOfTries +" tries");
                 break;
            }
             
         } 
         } else {
                 JOptionPane.showMessageDialog(null,"Come back when your not a loser!");
                 }
           }
}

             
              
        
    

