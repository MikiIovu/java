import java.util.Scanner;
import java.util.Random;


public class Rpsgame2 {

	public static void main(String[] args) {
		System.out.println("Välkommen till Sten, sax, påse");
	    System.out.println("Välj ett alternativ");
	    System.out.println("1. Sten");
	    System.out.println("2. Sax");
	    System.out.println("3. Påse");

	    Scanner s = new Scanner(System.in);
	    int choice = s.nextInt();
	    
	    int rock = 1;
	    int scissors = 2;
	    int paper = 3;
	    
	    Random rand = new Random();
	    int answer = rand.nextInt(3);
	    answer += 1;
	    
	    if (answer == rock) {
	    	if (choice == rock) {
	    		System.out.println("It is a tie");
	    	} else if (choice == paper ) {
	    		System.out.println("You won");
	    	} else if (choice == scissors) {
	    		System.out.println("You lost");
	    	}
	    } else if (answer == paper) {
	    	if (choice == rock) {
	    		System.out.println("You lose");
	    	} else if (choice == paper ) {
	    		System.out.println("It is a tie");
	    	} else if (choice == scissors) {
	    		System.out.println("You win");
	    	}
	    } else if (answer == scissors) {
	    	if (choice == rock) {
	    		System.out.println("You win");
	    	} else if (choice == paper ) {
	    		System.out.println("You lost");
	    	} else if (choice == scissors) {
	    		System.out.println("It is a tie");
	    	}
	    }
	    
	    System.out.println("the computer chose: " + answer);
	    
	    
	    
     }
	    
	    
}
