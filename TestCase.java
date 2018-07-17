import java.util.Scanner;
class TestCase 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the binary:");
		String s1=s.nextLine();
		s.close();
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='1')
				count++;
			else
			{
				if(count>1)
				System.out.print(count);
				count=0;
			}
		}
		1System.out.print(count);
	}
}
