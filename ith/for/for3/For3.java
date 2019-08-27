import java.util.Scanner;

public class For3 {
   public static void main(String[] args) {
      System.out.println("Write two numbers");
      Scanner reader = new Scanner(System.in);
      int numberOne = reader.nextInt();
      int numberTwo = reader.nextInt();
      int sum = 0;
      
      for ( int i = numberOne; i <= numberTwo; i++) {
         sum = sum + i;
      }
      
      System.out.println(sum);
     
   }
}
