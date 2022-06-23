class fifthlab{
	public static void main(String args[])
	{
		Student st = new Student();
		st.walk();
		Worker wk = new Worker();
		wk.walk();
		//Person p = new Person();
		//p.sleep();
		//p.walk();
	}
}

abstract class Person
{
	public abstract void walk();
	public void sleep(){
		System.out.println("Person Sleeping");
	}
}

class Worker extends Person
{
	public void walk()
	{
		System.out.println("Worker Walking");
	}
}

class Student extends Person
{
	public void walk()
	{
		System.out.println("Student Walking");
	}
}

