class Test {
		
	public int x;
	 public static int a = 5;
	static
	{
		a=10;
		System.out.println("Static block. ");
	}

	// Constructor calling
	Test() { System.out.println("Object is created"); }
	

	public static void main(String args[])
	{
		Test t1 = new Test();
		Test t2 = new Test();
		t1.x = 10;
		t2.x = 20;
		t2.a = 35;
		System.out.println("t1.x: "+t1.x);
		System.out.println("t2.x: "+t2.x);
		System.out.println("t1.a: "+t1.a);
		System.out.println("t2.a: "+t2.a);
	}
	
}
