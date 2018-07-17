class Book
{
	private int pages;
	public void setData(int x)
	{
		if(x>0)
			pages=x;
	}
}
public int getData()
{ 
	return pages;
}

class BookApp
{

	public static void main(String args[])
	{
		Book b=new Book();
		b.setData(200);
		int m=b.getData();
		System.out.println("Value+:"+m);
	}
}