import java.util.Scanner;
class NewStr 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		String s1=scn.nextLine();
		char[] ar=s1.toCharArray();
		int sum=0;
		String temp="";
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]!=' ')
			{
				if(ar[i]>=48&&ar[i]<=57)
				{
					sum+=Character.getNumericValue(ar[i]);
				}
				else
					temp+=ar[i];
			}
			else
			{
				temp+=sum;
				sum=0;
				temp+=' ';
			}
		}
		temp+=sum;
		temp+=' ';
		System.out.println(temp);
	}
}
