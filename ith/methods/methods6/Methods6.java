import java.util.Scanner;

public class Methods6 {
   public static void main(String[] args) {
   boolean authorised = isAuthorised();
   for ( int i = 0; i < 5; i = i + 1) {
      if (isAuthorised()) {
				System.out.println("Grattis, r�tt l�senord!");
				break;
		}
	}

   } 
   static boolean isAuthorised() {
      System.out.println("Skriv in tre l�senord");
      Scanner s = new Scanner(System.in);
      String password1 = s.nextLine();
      String password2 = s.nextLine();
      String password3 = s.nextLine();
      return password1.equals("candy") && password2.equals("cookie") && password3.equals("cake");
            
      }
    
   }