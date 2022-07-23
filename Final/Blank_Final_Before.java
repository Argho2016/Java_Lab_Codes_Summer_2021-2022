import java.util. * ;

public class finaljava1 {
	int a;
   public int add() { 
      final int x = 30;
      int y = 70;
	  a = 50;
      int z = x+y+a;
      return z;
   }
   public static void main(String args[]) {
      finaljava1 test = new finaljava1();
      int add = test.add();
      System.out.println("The sum of x and y is: " + add);
   }
} 
