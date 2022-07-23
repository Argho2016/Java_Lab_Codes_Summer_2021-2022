import java.util. * ;

public class finaljava1 {
	final int a;
   finaljava1() { 
      final int x = 30;
      int y = 70;
	  a = 50;
      int z = x+y+a;
      System.out.println(z); 
   }
   public static void main(String args[]) {
      new finaljava1();
      
   }
} 
