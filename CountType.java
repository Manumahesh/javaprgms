import java.util.Scanner;
class CountType
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=scn.nextLine();
		int v=0,c=0,sc=0,n=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='0'||s.charAt(i)=='U')
			{
				v++;
			}
			else if(s.charAt(i)>=48&&s.charAt(i)<=57)
			{
				n++;
			}
			else if((s.charAt(i)>=65&&s.charAt(i)<=90)||(s.charAt(i)>=97&&s.charAt(i)<=122))
			{
				c++;
			}
			else
			{
				sc++;
			}
		}
			System.out.println("Vowels:"+v);
			System.out.println("Consonents:"+c);
			System.out.println("Number:"+n);
			System.out.println("Special Characters:"+sc);
	}
}
