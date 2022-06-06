import java.lang.*;
import java.util.Scanner;

public class secondTheory extends Food
{
	public void Biriany()
	{
		System.out.println("Eating pizza");
	}
	
	public static void main(String[] args)
	{
		
		Food ob = new Food();
		ob.Biriany();
		ob.Biriany(2, 5);
		secondTheory obb = new secondTheory();
		obb.Biriany();
	}
	
	
}

class Food
{
	public void Biriany()
	{
		System.out.println("Eating Biriany");
	}
	
	public int Biriany(int a, int b)
	{
		int sum = a + b;
		System.out.println("Eating a lot of Biriany"+ sum);
		return sum;
	}
}





