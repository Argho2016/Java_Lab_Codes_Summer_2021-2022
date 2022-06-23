class fourtheory{
	
	public int x;
	public static int a = 10;
		
		fourtheory()
		{
			System.out.println("Object is Created");
		}
		
		static
		{
			int a= 20;
			System.out.println("Class is Created");
		}
	
	public static void main(String args[])
	{
		fourtheory ft = new fourtheory();
		fourtheory ft2 = new fourtheory();
		ft.x = 5;
		ft2.x = 10;
		ft.a = 40;
		ft2.a = 50;
		
		System.out.println(ft.x);
		System.out.println(ft2.x);
		System.out.println(ft.a);
		System.out.println(ft2.a);
	}
	
}

