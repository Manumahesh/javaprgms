import java.util.Scanner;

class Test2
{
	public static String res(String s)
	{
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>64&&s.charAt(i)<91)
				temp+=(char)(s.charAt(i)+32);
			else if(s.charAt(i)>=97&&s.charAt(i)<=122)
				temp+=(char)(s.charAt(i)-32);
			else
				temp+=s.charAt(i);
		}
		return temp;
	}
	public static String vowels(String s)
	{
		String d="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='0'||s.charAt(i)=='U')
			{
				d+="*";
				d+=s.charAt(i);
			}
			else
				d+=s.charAt(i);
		}
		return d;
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
		String d1="";
		String d2="";
		String s2=scn.nextLine();
		d1=remove(s1);
		d2=remove(s2);
		d1=upper(s1);
		d2=upper(s2);
		int c=0;
		if(d1.length()==d2.length())
		{
			d1=sort(d1);
			d2=sort(d2);
			for(int i=0;i<s1.length();i++)
			{
				if(d1.charAt(i)!=d2.charAt(i))
				{
					s1=res(s1);
					s2=res(s2);
					System.out.println("Not an Anagram");
					c=1;
					break;
				}
			}
			if(c!=1)
			{
				s1=vowels(s1);
				s2=vowels(s2);
				System.out.println("Anagram");
			}
		}
		else
			System.out.println("Not an Anagram");
			System.out.println(s1);
			System.out.println(s2);
	}
}
