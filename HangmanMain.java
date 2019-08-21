package hangmanPackage;

import java.util.ArrayList;

/**
 * 
 */


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author papab
 *
 */
public class HangmanMain {
	public static Scanner scanner = new Scanner(System.in);


	public static boolean starter() {
		boolean b = false;
		String start = scanner.next().toLowerCase();
		if (start.equals("start")) {
			System.out.println("Alright let's go!");
			b = true;	
		}else {
			System.out.print("You seem to have entered something else. Please try again.\n");
			b = starter();
		}
		return b;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Thank you for playing this game. Please type \"Start\" to begin the game");
		boolean bool = starter();
		if (bool == true) {
			System.out.println("You have a maximum of 8 wrong guesses. Begin");
			LazyAI lazy = new LazyAI();
			User user = new User();
			Game game = new Game();
			game.run(game.getWord(), user);
		}

	}
}