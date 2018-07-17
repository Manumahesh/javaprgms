import java.util.Scanner;
class UprCse 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s1=s.nextLine();
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>=65&&s1.charAt(i)<=90)
				count++;
		}
		System.out.println(count);
	}
}
