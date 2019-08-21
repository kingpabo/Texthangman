package hangmanPackage;

public class LazyAI extends Players {
	
	
	public LazyAI(){
		super();
	}

	public char getInput() {
		char [] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		int rand = (int)(Math.random() * (26-1)) + 1;
		char g = alphabet[rand - 1];
		setCurrGuess(g);
		return g;
	}

}


