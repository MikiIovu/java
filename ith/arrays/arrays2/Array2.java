import java.util.Scanner;

public class Array2 {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      
      System.out.println("Hur många tal vill du skriva in?");
       
      int numberOfNumbers = s.nextInt();
      int [] numbers = new int [numberOfNumbers];
      
      System.out.println("Skriv dina tal");
      
      for (int i = 0; i < numbers.length; i = i + 1) {
          System.out.println("Skriv in tal nummer " + (i + 1));
          numbers[i] = s.nextInt();
      }
      
      int sum = 0;
      for (int i = 0; i < numbers.length; i = i + 1) {
          sum = sum + numbers[i];
          System.out.println(numbers[i]);
      }
      System.out.println("Summa: " + sum);
   }
   
}