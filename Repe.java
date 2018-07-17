import java.util.Scanner;
class Repe 
{
	public static String remove(String s)
	{
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' '&&s.charAt(i)>=97&&s.charAt(i)<=122)
			{
				temp+=s.charAt(i);
			}
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
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String ip=s.nextLine();
		int count=0;
		ip=remove(ip);
		ip=sort(ip);
		System.out.println(ip);
		for(int i=0;i<ip.length()-1;i++)
		{
				if(ip.charAt(i)==ip.charAt(i+1))
					count++;
				else
				{
					System.out.print(ip.charAt(i));
					System.out.println(count+1);
					count=0;
				}
		}
		System.out.print(ip.charAt(ip.length()-1));
		System.out.println(count+1);
	}
}
