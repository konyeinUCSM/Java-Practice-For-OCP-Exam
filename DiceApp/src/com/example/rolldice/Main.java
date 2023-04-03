package com.example.rolldice;

import java.util.Scanner;

public class Main {
	 
	static Scanner input =  new Scanner(System.in);
	static int diceForUser1;
	static int diceForUser2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 1 for the user1 dice");
		int user1 = input.nextInt();
		if(user1 == 1) {
			diceForUser1 = RollDice(1, 6);
			System.out.println("The Number Point for user 1 dice is " + diceForUser1);
		}
		System.out.println("Enter 2 for the user2 dice");
		int user2 = input.nextInt();
		if(user2 == 2) {
			diceForUser2 = RollDice(1, 6);
			System.out.println("The Number Point for user 2 dice is " + diceForUser2);

		}
		if (diceForUser1>diceForUser2) {
			System.out.println("The Winner is User1");
		} else {
			System.out.println("The winner is User2");
		}
		

	}
	
	public static int RollDice(int low,int high) {
		int randomDiceNumber = (int)(Math.random() * (high - low + 1)) + 1;
		return randomDiceNumber;
		
	}

}
