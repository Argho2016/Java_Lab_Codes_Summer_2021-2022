import java.lang.*;
import java.util.Scanner;


public class secondLab
{
	public static void main(String[] args)
	{
		Scanner keyboardInput = new Scanner(System.in);
		//System.out.println("What is your name?");
		//String name = keyboardInput.nextLine();
		//System.out.println("Hello " +name);
		int x, y, sum;
		x = keyboardInput.nextInt();
		y = keyboardInput.nextInt();
		sum = x + y;
		System.out.println("The total is " +sum);
		
	}
}





