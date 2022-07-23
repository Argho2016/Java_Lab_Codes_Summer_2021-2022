import java.util. * ;

public class finaljava {
  final int x = 10;
  int a = x + 4;

  public static void main(String[] args) {
    finaljava myObj = new finaljava();
    //myObj.x = 25;
    System.out.println(myObj.x);
	System.out.println(myObj.a);
  }
}