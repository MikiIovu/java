import java.util.Scanner;

public class Dowhile2 {
   public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   int number;

   do {
      System.out.println("Skriv ett tal mellan 0 och 9");
      number = scanner.nextInt();

   } while(number >= 10 || number < 0 );  
   
   System.out.println("Grattis du skrev rätt tal"); 
    
   }
}

/*
import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
	
		while (true) {
			Scanner s = new Scanner(System.in);
			int input = s.nextInt();
			if (input >= 0 && input < 10) {
				System.out.println("Number is within range!");
				break;
			}
		}
	}
 
}
*/