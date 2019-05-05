import java.util.Scanner;

public class String1 {
   public static void main(String[] args) {
      System.out.println("Write your name");
      Scanner reader = new Scanner(System.in);
      String name = reader.next();
      System.out.println ("Are you a man or a woman?");
      String input = reader.next();

      if (input.equals("man")) {
         System.out.println("Hello mister " + name);
      } else if (input.equals("woman")) {
         System.out.println("Are you married");
         String given = reader.next();
         if (given.equals("yes")) {
            System.out.println("Hello misses " + name);
         } else {
            System.out.println("Hello miss " + name);
         }
      } else {
         System.out.println("Wrong input");
      }
   }
}

