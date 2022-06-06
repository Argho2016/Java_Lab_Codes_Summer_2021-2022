import java.lang.*;

class setget {
	public static void main(String args[])
	{
		Book bk = new Book("JK", 55, "NIce");
		bk.setAuthor("JK Rowling");
		System.out.println(bk.getAuthor());
	}
	
}
//------------------------------------------------
class Book{
	private String bookName;
	private int bookID;
	private String bookAuthor;
	
	public Book(String name, int bookk, String author)
	{
		this.bookName = name;
		this.bookID = bookk;
		this.bookAuthor = author;
	}
	
	public void setAuthor(String author)
	{
		if (author.equals("Good") || author.equals("Bad"))
		{
			this.bookAuthor = author;
		}else
		{
			this.bookAuthor = "NR";
		}
	}
	
	public String getAuthor()
	{
		return bookAuthor;
	}
	
	public void setID(int id)
	{
		this.bookID = id;
	}
	public int getID()
	{
		return this.bookID;
	}
	public void setName(String name)
	{
		this.bookName = name;
	}
	public String getName()
	{
		return this.bookName;
	}
	
}
