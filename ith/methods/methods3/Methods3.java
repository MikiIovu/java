public class Methods3 {
   public static void main(String[] args) {
   int c = multiplyByFour(2);
   int d = multiplyByFour(5);
   System.out.println(c);
   System.out.println(d);
   }
   
   static int multiplyByFour(int a) {
      int result = a * 4;
      return result;
   }
   
}