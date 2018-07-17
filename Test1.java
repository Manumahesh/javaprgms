import java.util.Scanner;
class 
{
	public static String vowels(String s)
	{
		String d="";
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='0'||s.charAt(i)=='U')
		{
			d+="*";
		}
		else
			d+=s.charAt(i);
	}
	public static String upper(String s)
	{
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=65 && s.charAt(i)<=90)
			{
				temp+=(char)(s.charAt(i)+32);
			}
			else
				temp+=s.charAt(i);
		}
		return temp;
	}
	public static String sort(String s)
	{
		char [] a=s.toCharArray();
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					char t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		String tem="";
		for(int i=0;i<s.length();i++)
		{
			tem+=a[i];
		}
		return tem;
	}
	public static String remove(String s)
	{
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				temp+=s.charAt(i);
			}
		}
		return temp;
	}
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s1=scn.nextLine();
		System.out.println("Enter the string:");
		String s2=scn.nextLine();
		s1=remove(s1);
		s2=remove(s2);
		s1=upper(s1);
		s2=upper(s2);
		int c=0;
		if(s1.length()==s2.length())
		{
			s1=sort(s1);
			s2=sort(s2);
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)!=s2.charAt(i))
				{
					System.out.println("Not an Anagram");
					c=1;
					break;
				}
			}
			if(c!=1)
			{
				s1=vowels(s1);
				System.out.println("Anagram");
			}
		}
		else
		System.out.println("Not an Anagram");
		System.out.println(s1);
		System.out.println(s2);
	}
}
