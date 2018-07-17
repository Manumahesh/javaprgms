import java.util.Scanner;
class StringArray
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s1=s.nextLine();
		s.close();
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
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
}
