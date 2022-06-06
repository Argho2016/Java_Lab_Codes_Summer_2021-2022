public class theory
{
	public static void main(String[] args)
	{
		System.out.print("Hello World");
		System.out.println("Hello World");
		int x = 10;
		int y = 5;
		int sum = x + y;
		System.out.println("The sum is :" +sum);
		int sub = x - y;
		System.out.println("The sum is :" +sum+ "\nThe sub is :" +sub);
		
		double a = 3.1416;
		boolean b = true;
		char c = 't';
		
		int day = 2;
		switch(day)
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
		
		int arr[] = new int[3];//1D array
		arr[0] = 3;
		arr[1] = 2;
		arr[2] = 5;
		for (int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		int ar[][] = new int[2][2]; //2D Array
		ar[0][0] = 2;
		ar[0][1] = 3;
		ar[1][0] = 1;
		ar[1][1] = 4;
		
		for (int j = 0; j<2; j++)
		{
			for (int k = 0; k<2; k++)
			{
				System.out.println(ar[j][k]);
			}
		}
		
	}	
}	