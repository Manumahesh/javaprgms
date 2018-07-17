import java.util.Scanner;
class Pangram 
{
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
	public static String dup(String s)
	{
		char [] a=s.toCharArray();
		String temp="";
		for(int i=0;i<s.length()-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				temp+=a[i];
			}
		}
		temp+=a[s.length()-1];
		System.out.println(temp);
		return temp;
	}
	public static String sort(String s)
	{
		String temp="";
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
			if(s.charAt(i)>=65&&s.charAt(i)<=90||s.charAt(i)>=97&&s.charAt(i)<=122)
			{
				temp+=s.charAt(i);
			}
		}
		return temp;
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String name=s.nextLine();
		name=remove(name);
		name=upper(name);
		name=sort(name);
		name=dup(name);
		if(name.length()==26)
			System.out.println("Panagram");
		else
			System.out.println("Not Panagram");
	}
}
