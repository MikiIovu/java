import java.util.Scanner;
import java.util.Random;


public class Rpsgame {

	public static void main(String[] args) {
		System.out.println("V�lkommen till Sten, sax, p�se");
	    System.out.println("V�lj ett alternativ");
	    System.out.println("1. Sten");
	    System.out.println("2. P�se");
	    System.out.println("3. Sax");

	    Scanner s = new Scanner(System.in);
	    int choice = s.nextInt();
	    
	    Random rand = new Random();
	    int answer = rand.nextInt(3);
	    answer += 1;
	    
	    if (choice == answer) {
	    	System.out.println ("It's a tie");
	    } else if (choice - answer == 1) {
	    	System.out.println ("You won");
	    } else {
	    	System.out.println("You lost");
	    }
	    
	    System.out.println("the computer chose: " + answer);
	    
	    
	    
     }
	    
	    
}
