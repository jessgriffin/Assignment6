/****************************************************************************
 *
 * Created by: Jess and 
 * Created on: Nov 2016
 * This is the beginning of a yahtzee game. The game rolls the dice and lets the user pick which dice to roll
 ****************************************************************************/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Yahtzee {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int currentRoll[] = new int [5];
		//currentroll is what numbers the current dice are holding. Usersroll holds the index of which dice the user wants to roll
		char usersRoll[]; 
		
		//roll dice for the first time
		currentRoll[0] = (int) (Math.random() * 5 + 1) ;
		currentRoll[1] = (int) (Math.random() * 5 + 1) ;
		currentRoll[2] = (int) (Math.random() * 5 + 1) ;
		currentRoll[3] = (int) (Math.random() * 5 + 1) ;
		currentRoll[4] = (int) (Math.random() * 5 + 1) ;
		
			System.out.println("Your dice have been rolled automatically for the first time");
			PrintDice(currentRoll);
			
			System.out.println("Type the index of which dice you would like to roll with no spaces. EX: 123");
			
			InputStreamReader r = new InputStreamReader(System.in);
		    BufferedReader br = new BufferedReader(r);
		    
		    String input = br.readLine();
			
		    usersRoll = input.toCharArray();
		    
		    currentRoll = RollDice(currentRoll, usersRoll);
		    
	}
	
	public static void PrintDice (int [] currentDice) {
			
			System.out.print(currentDice[0] + " ");
			System.out.print(currentDice[1] + " ");
			System.out.print(currentDice[2] + " ");
			System.out.print(currentDice[3] + " ");
			System.out.println(currentDice[4]);
			
	}
	
	public static int [] RollDice (int currentDice[], char usersRoll[]) {
		
		for (int counter = 0; counter < usersRoll.length; counter++) {
			
			if ( usersRoll[counter] == '1') {
				
				currentDice[0] = (int) (Math.random() * 5 + 1) ;
				
			} else if (usersRoll[counter] == '2') {
				
				currentDice[1] = (int) (Math.random() * 5 + 1) ;
				
			} else if (usersRoll[counter] == '3') {
				
				currentDice[2] = (int) (Math.random() * 5 + 1) ;
				
			} else if (usersRoll[counter] == '4') {
				
				currentDice[3] = (int) (Math.random() * 5 + 1) ;
				
			} else if (usersRoll[counter] == '5') {
				
				currentDice[4] = (int) (Math.random() * 5 + 1) ;
			} else {
				
				System.out.println("Invalid input");
			}
			
		}
		
		PrintDice(currentDice);
		return currentDice;
	}
	
}
