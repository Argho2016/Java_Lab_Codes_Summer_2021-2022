import java.lang.*;
import java.util.Scanner;

public class Theory2
{
	public static void main(String[] args)
	{
		//Theory2 ob = new Theory2();
		//ob.Food();
		//Food("Biriany", 100);
		/*System.out.println(Add(4, 7));
		double x = 45;
		double y = 66;		
		System.out.println(Math.max(x, y));
		System.out.println(Math.sqrt(y));
		System.out.println(Math.pow(x, y));
		System.out.println(Math.log(x));
		System.out.println(Math.log10(x));
		System.out.println(Math.exp(x));*/
		
		AIUB uni = new AIUB();
		uni.Motivation();
		
	}
	
	public static void Food(String name, int price)
	{
		System.out.println("I am eating " + name 
		+ " and Its price is " + price);
	}

	public static int Add(int a, int b)
	{
		int sum = Math.max(a, b);
		return sum;
	}
	
	public static int Add(int a)
	{
		int sum = a;
		return sum;
	}
	
	public static double Add(double a)
	{
		double sum = a;
		return sum;
	}
	
}

class AIUB
{
	public void Motivation()
	{
		System.out.println("Where Leaders are Created");
	}
}






