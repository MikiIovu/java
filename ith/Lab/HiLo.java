import java.util.Scanner;

public class HiLo {

   public static void main(String[] args) {

      System.out.println("Välkommen till HiLo spelet");
      System.out.println("Vilken svårighetsgrad vill du spela?");
      System.out.println("1. Lätt (1-10)");
      System.out.println("2. Mellan (1-100)");
      System.out.println("3. Svårt (1-1000)");

      Scanner s = new Scanner(System.in);
      int choice = s.nextInt();
      switch (choice) {
         case 1:
            playGame(10);
            break;
         case 2:
            playGame(100);
            break;
         case 3:
            playGame(1000);
            break;
         default:
            System.out.println("Ogliltigt alternativ");
            break;
      }
   }

   public static int playGame(int maxNumber) {
      int max = 0;

      if (maxNumber == 10) {
         System.out.println("Gissa på ett tal mellan 1 och 10");
         max = 10;
      } else if (maxNumber == 100 ) {
         System.out.println("Gissa på ett tal mellan 1 och 100");
         max = 100;
      } else if (maxNumber == 1000) {
         System.out.println("Gissa på ett tal mellan 1 och 1000");
         max = 1000;
      }

      int answer = (int)(Math.random() * max) + 1;
      int numberOfGuesses = 0;

      Scanner s = new Scanner(System.in);
      int guess = 0;
      do {
         guess = s.nextInt();
         numberOfGuesses = numberOfGuesses + 1;
         giveResponse(answer,guess);
      } while (answer != guess);

      System.out.println("Du gissade " + numberOfGuesses + " antal gånger");

      return numberOfGuesses;
   }

   public static void giveResponse(int answer, int guess) {
      if (guess > answer) {
         System.out.println("För stor ");
      } else if (guess < answer) {
         System.out.println("För lite ");
      } else {
         System.out.println("Grattis du hittade numret");
      }
   }
}