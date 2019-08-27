import java.util.Scanner;

public class Dowile1 {
   public static void main(String[] args) {
   int number;  
      
   do {
      System.out.println("Write a number");
      Scanner reader = new Scanner(System.in);
      number = reader.nextInt();  
      
      } while (number < 100);
   
   }
}
