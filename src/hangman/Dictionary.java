package hangman;

public class Dictionary {

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

}
