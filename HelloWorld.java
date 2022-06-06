public class HelloWorld
{
	public static void main(String[] args)
	{
		System.out.println("Hello World");
		
		int a = 9;
		int b = 4;
		int sum = a + b;
		int sub = a - b;
		System.out.println("The Sum is " +sum+
		" and The Sub is " +sub);
		if(a > b)
		{
			System.out.println("a is greater");
		}
		else
			{
			System.out.println("b is greater");
			}
		
		int day = 2;
		switch (day)
		{
			case 1:
			System.out.println("Today is Sunday");
			break;
			
			case 2:
			System.out.println("Today is Monday");
			break;
			default:
			System.out.println("Invalid Command");
			break;
		}
		
		int arr[] = new int [3];
		arr[2] = 3;
		arr[1] = 45;
		arr[0] = 77;
		for (int ii = 0; ii<arr.length; ii++)
		{
		System.out.println(arr[ii]);
		}
		
		int ar[][] = new int[2][2];
		ar[0][0]=1;
		ar[0][1]=10;
		ar[1][0]=100;
		ar[1][1]=200;
		for (int i = 0; i<2; i++)
		{
			for (int j = 0; j<2; j++)
			{
				System.out.println(ar[i][j]);
			}
		}
			
	}
}