import java.util.Scanner;

public class Array1 {
   public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   int [] numbers = new int [5];
   
   System.out.println("Skriv fem tal");
   
   for (int i = 0; i < 5; i = i+1) {
      numbers[i] = s.nextInt();
   }
    for (int i = 0; i < 5; i = i+1) {
      System.out.println(numbers[i]);
    }
    
    int sum = 0;
      sum = numbers[0] + numbers [1] + numbers[2] + numbers[3] + numbers[4];
      System.out.println(sum);
    }
   
}