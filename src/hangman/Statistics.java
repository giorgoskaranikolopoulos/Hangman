package hangman;

public class Statistics {
	
	private int games;
	private int wins;
	private int loses;
	
	public Statistics() {
		// TODO Auto-generated constructor stub
		games = 0;
		wins = 0;
		loses = 0;
	}
	
	public void updateWins() {
		wins++;
		games++;
	}
	
	public void updateLoses() {
		loses++;
		games++;
	}
	
	public void printInfo() {
		//You have played so far 5 games. You won 3 times and lost 2 times.
		System.out.println("You have played so far " + games + " games. You won " + wins + " times and lost " + loses +" times.");
	}
}
