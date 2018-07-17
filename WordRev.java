import java.util.Scanner;
class WordRev 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s1=s.nextLine();
		String temp="";
		s.close();
		int count=0;
		for(int i=0;i<s1.length()-1;i++)
		{
			if(s1.charAt(i)==' '&&s1.charAt(i+1)!=' ')
				count++;
		}
		String[] ar=new String[count+1];
		int j=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=' ')
				temp+=s1.charAt(i);
			else
			{
				ar[j]=temp;
				j++;
				temp="";
			}
		}
		ar[j]=temp;
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=reverse(ar[i]);
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]);
			System.out.print(" ");
		}
	}
	public static String reverse(String t)
	{
		String t1="";
		for(int i=t.length()-1;i>=0;i--)
		{
			t1+=t.charAt(i);
		}
		return t1;
	}
}
