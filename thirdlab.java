class thirdlab{
		
	public static void main(String args[])
	{
		Animal aml = new Animal();
		aml.Mammal();
		aml.Cat();
		aml.Tiger();
	}	
}
class Animal extends Feline {
	public void Mammal()
	{
		System.out.println("This is a Mammal");
	}
}
class Feline{
	public void Cat()
	{
		System.out.println("This is a Cat");
	}
	
	public void Tiger()
	{
		System.out.println("This is a Tiger");
	}
}





