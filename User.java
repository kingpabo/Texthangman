package hangmanPackage;

import java.util.Scanner;

public class User extends Players{
	
	public static Scanner scanner = new Scanner(System.in);
	
	User(){
		super();
	}	
	
	
	public char getInput() {
		char a = Character.toUpperCase(scanner.next().charAt(0));
		return a;
	}

}
