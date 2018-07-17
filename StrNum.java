import java.util.Scanner;
class StrNum 
{
	public static String append(String str)
	{
		String temp="";
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=48&&str.charAt(i)<=57)
			{
				sum+=Character.getNumericValue(str.charAt(i));
			}
			else
				temp+=str.charAt(i);
		}
		temp+=sum;
		return temp;
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		int count=0;
		for(int i=0;i<s1.length()-1;i++)
		{
			if(s1.charAt(i)==' '&&s1.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		String[] ar=new String[count+1];
		int j=0;
		String temp="";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=' ')
			{
				temp+=s1.charAt(i);
			}
			else
			{
				ar[j]=temp;
				j++;
				temp="";
			}
		}
		ar[j]=temp;
		String t="";
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=append(ar[i]);
			t+=ar[i];
			t+=" ";
		}
		System.out.println(t);
	}
}
