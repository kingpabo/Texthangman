package hangmanPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {
	boolean gameOver;
	boolean singlePlayer;
	Game(){
		this.gameOver = false;
		this.singlePlayer =  true;
	}


	public static String getWord() {
		final  String word = "Bastardo"; 
		return word.toUpperCase();
	}


	public  static void run(String w, Players obj) {
		//	int wordLength = w.length();
		final int wrongLimit = 8;
		int wrongGuesses = 0;
		int correctGuesses = 0;
		char[] wordArr = w.toCharArray();
		char [] answerArr = new char[w.length()];
		char [] stateArr  = new char[w.length()];
		int tries = 0;
		int errorsMade = 0;

		List<Character> guesses = new ArrayList<Character>();



		for(wrongGuesses = 0; wrongGuesses < wrongLimit+1; wrongGuesses++) {
			if (wrongGuesses == wrongLimit) {
				System.out.println("Ouch! it seems like you made too many wrong guesses. \nThe correct word was "+w+". \nBetter luck next time!");
				break;
			}
			for (int x = 0; x < answerArr.length; x++) {
				if (answerArr[x] == '\u0000'){
					answerArr[x] = '_';	
				}
			}
			stateArr = answerArr.clone();

			//char guess = Character.toUpperCase(scanner.next().charAt(0));
			
			char guess = Character.toUpperCase(obj.getInput());
			tries ++;

			boolean beenDone = false;

			for (int t = 0; t < guesses.size(); t++) {
				if(guess == guesses.get(t)) {
					beenDone = true;
				}
			}

			if(beenDone == false) {
				guesses.add(guess);
				for(int y = 0; y < w.length(); y++) {
					if(guess == wordArr[y]) {
						answerArr[y] = guess;
						correctGuesses ++;	
					}
				}//if the character that the user selected is found anywhere in the array, the value is placed at the same index in the Answer array.

				if (Arrays.equals(answerArr, stateArr) == false) {
					System.out.println("Congrats! Your guess was right!!");
					//stateArr = answerArr.clone();
					wrongGuesses--;
					System.out.println(Arrays.toString(answerArr));
					if(correctGuesses == answerArr.length){
						System.out.print("Congrats!! You Won!! It took you "+ tries + " moves to figure it out!" );
						break;
					}
				}else {

					errorsMade++;
					System.out.println("Oops you guessed wrong. Try again! You have "+ (wrongLimit - errorsMade) +" more wrong guesses");
					System.out.println(Arrays.toString(answerArr));
				}
			}else{
				System.out.println("It seems that you have made this guess before. Please try again.");
				wrongGuesses --;
			}
		}
	}


}
