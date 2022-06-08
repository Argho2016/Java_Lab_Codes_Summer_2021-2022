class lab3task2{
	public static void main(String[] args)
	{
		Account a = new Account();
		Account a2 = new Account("Dristi", "Student", 1000);
		a2.deposit(100);
		a2.withdraw(200);
		System.out.println("Name: " + a2.getAccName() + "\n" + "ID: " + a2.getAcId() + "\n" + 
		"Balance: " + a2.getBalance() + "\n" + "Deposit: " + a2.deposit + "\n" + "Withdraw: " + a2.withdraw);
	}
}

class Account
{
	private String accName, acid;
	private int balance;
	
	public int deposit, withdraw;
	
	public void setAccName(String accName)
	{
		this.accName = accName;
	}
	
	public String getAccName()
	{
		return accName;
	}
	
	public void setAcId(String acid)
	{
		this.acid = acid;
	}

	public String getAcId()
	{
		return acid;
	}
	
	public void setBalance(int balance)
	{
		this.balance = balance;
	}
	
	public int getBalance()
	{
		return balance;
	}
	
	Account()
	{
		System.out.println("Information of the Student");
	}
	
	Account(String accName, String acid, int balance)
	{
		this.accName = accName;
		this.acid = acid;
		this.balance = balance;
	}
	
	public int deposit(int am)
	{
		return deposit = balance + am;
	}
	
	public int withdraw(int am)
	{
		return withdraw = balance - am;
	}
}
