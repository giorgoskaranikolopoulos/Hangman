package hangman;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		Statistics stats = new Statistics();
		
		
		System.out.println("MAIN MENU");
		System.out.println("- Start a new Game (N)");
		System.out.println("- Statistics (S)");
		System.out.println("- Exit (E)");
		System.out.println("Please enter your choice:");
		
		char selection = scanner.next().charAt(0);
		
		while(selection != 'E') {
			if(selection == 'N') {
				GameLoop game = new GameLoop();
				if(game.GameLooplayground()) {
					stats.updateWins();
				}
				else {
					stats.updateLoses();
				}
			}
			else if(selection == 'S') {
				stats.printInfo();
			}
			
			System.out.println("Please enter your choice:");
			
			selection = scanner.next().charAt(0);
		}
		scanner.close();
	}

}
