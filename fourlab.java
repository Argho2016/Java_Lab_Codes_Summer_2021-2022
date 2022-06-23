import java.lang.*;

class fourlab {
	public static void main(String args[])
	{
		ride r = new ride(4, "Good", 1000);
		//r.wheelCar=4;
		r.setCondition("Bad");
		//r.priceCar=7;
		//System.out.println(r.wheelCar);
		System.out.println(r.getCondition());
		//System.out.println(r.priceCar);
		//ride r1 = new ride();
		
	}
}
class ride
{
	public int wheelCar;
	private String conditionCar;
	private int priceCar;
	
	public void bus()
		{
			System.out.println("I am taking the bus");
		}
		/*
		ride() //default or empty constructor
		{
			System.out.println("Object is created");
		}*/
		
		//parameterized constructor
		ride(int wheel, String condition, int price)
		{
			this.wheelCar = wheel;
			this.conditionCar = condition;
			this.priceCar = price;
		}
		
		public void setCondition(String condition)
		{
			if(condition.equals("Good") || 
			condition.equals("Bad") ||
			condition.equals("Average"))
			{
				this.conditionCar = condition;
			}
			else
			{
				this.conditionCar = "Invalid Input";
			}
		}
		public String getCondition()
		{
			return conditionCar;
		}
		
		public void setPrice(int price)
		{
			this.priceCar = price;
		}
		
		public int getPrice()
		{
			return priceCar;
		}
}