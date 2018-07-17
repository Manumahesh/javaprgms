import java.util.Scanner;
class Test4 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the binary:");
		String n=s.nextLine();
		int big=0;
		int count=0;
		for(int i=0;i<n.length();i++)
		{
			if(n.charAt(i)=='1')
			{
				count++;
			}
			else if(count>big)
			{
				big=count;
				count=0;
			}
			else
				count=0;
		}
		if(count>big)
			{
				big=count;
			}
		System.out.println(big);
	}
}
