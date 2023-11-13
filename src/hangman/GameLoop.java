package hangman;

import java.util.Random;
import java.util.Scanner;

public class GameLoop {
	
	private String completed_word;
	private String modified_word;
	private int correct_guesses;
	private int wrong_guesses;
	private int remaining_guesses;
	private char guess;
	public static final int TRIES = 8;
	
	public String getWord(int index) {
		switch (index) {
		case 0: return "UNIVERSITY";
		case 1: return "COMPUTER";
		case 2: return "LAPTOP";
		case 3: return "HEADPHONES";
		case 4: return "FUZZY";
		case 5: return "DOG";
		case 6: return "KEYHOLE";
		case 7: return "TELEPHONE";
		case 8: return "PRINTER";
		case 9: return "BUILDING";
		case 10: return "TRUCK";
		case 11: return "CAR";
		case 12: return "HOUSE";
		case 13: return "GAME";
		case 14: return "FIELD";
		case 15: return "CAT";
		case 16: return "GIN";
		case 17: return "PARTY";
		case 18: return "PURPLE";
		case 19: return "ADDRES";
		case 20: return "WATERFALL";
		default: return "Illegal index";
		}
	}; 
	
	public boolean GameLooplayground() {
		
		boolean flag;
		Random random = new Random();
		int randomNumber = random.nextInt(21);
		
		completed_word = getWord(randomNumber);
		
		// Using String.repeat to fill the modified_word with '-'
		modified_word = String.valueOf('-').repeat(completed_word.length());
		
		remaining_guesses = TRIES;
		flag = false;
		
		while(remaining_guesses > 0) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Your guess: ");
			guess = scanner.next().charAt(0);
			guess = Character.toUpperCase(guess);
			search();
			if(completed_word.equalsIgnoreCase(modified_word)) {
				flag = true;
				break;
			}
			System.out.println("The random word is now: " + modified_word);
			System.out.println("You have " + remaining_guesses + " guesses left.");
		}
		
	     
	     if(flag) {
	    	 System.out.println("Congratulations! You guessed the word:" + completed_word);
	     }
	     else {
	    	 System.out.println("Sorry. The word was: " + completed_word);
	     }
	     System.out.println("You made "+ correct_guesses + " correct guesses and " + wrong_guesses + " wrong guesses.");
	     return flag;
	}
	
	public void search() {
		 int index = -1;
		 boolean flag = false;
		 for (int i = 0; i < completed_word.length(); i++) {
            if (completed_word.charAt(i) == guess) {
                index = i;
                // flag to see if there is a character to match the guess 
                flag = true;
                StringBuilder stringBuilder = new StringBuilder(modified_word);
   	    	 
                stringBuilder.setCharAt(index, guess);
                // Convert the StringBuilder back to a String
                modified_word = stringBuilder.toString();
            }
         }
	     results(flag);
	}
	
	public void results(boolean flag) {
		if(flag) {
			System.out.println("The guess is CORRECT!");
			correct_guesses++;
		}
		else {
			System.out.println("There are no " + guess + " in the word.");
			wrong_guesses++;
			remaining_guesses--;
		}		
	}

}

