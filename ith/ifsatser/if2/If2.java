import java.util.Scanner;

public class If2 {
   public static void main(String[] args) {
      System.out.println("Write a score");
      Scanner reader = new Scanner(System.in);
      int score = reader.nextInt();
      if (score >= 50) {
         System.out.println("Godkänd");
      } else {
         System.out.println("Underkänd");
      }
   }
}