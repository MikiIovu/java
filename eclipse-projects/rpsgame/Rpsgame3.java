import java.util.Scanner;
import java.util.Random;


public class Rpsgame3 {
	static int rock = 1;
	static int scissors = 2;
	static int paper = 3;
    
	public static void main(String[] args) {
		System.out.println("Välkommen till Sten, sax, påse");
	    
	    int choice = askForNumber();
	    
	    Random rand = new Random();
	    int answer = rand.nextInt(3);
	    answer += 1;
	    
	    int winner = whoWon(choice, answer);
	    
	    if (winner == 0) {
	    	System.out.println("It is a tie");
	    } else if (winner == 1) {
	    	System.out.println("You won");
	    } else {
	    	System.out.println("You lost");
	    }
	       
	    System.out.println("the computer chose: " + answer);    
    }
	
	private static int askForNumber() {
		System.out.println("Välj ett alternativ");
	    System.out.println("1. Sten");
	    System.out.println("2. Sax");
	    System.out.println("3. Påse");

	    Scanner s = new Scanner(System.in);
	    int number = s.nextInt();
	    return number;
	}
	
	private static int whoWon(int myAnswer, int computerAnswer) {
		if (myAnswer == computerAnswer) {
			return 0;
		}
		if (myAnswer == rock) {
			if (computerAnswer == scissors) {
				return 1;
			} else {
				return -1;
			}
		} else if (myAnswer == scissors) {
			if (computerAnswer == paper) {
				return 1;
			} else {
				return -1;
			}
		} else { // paper
			if (computerAnswer == rock) {
				return 1;
			} else {
				return -1;
			}
		}
	}
	
	    
}
