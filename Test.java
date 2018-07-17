import java.util.Scanner;
class Test
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s1=s.nextLine();
		char []a=s1.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			if(a[i]!=' ')
			{
				if(a[i]>96&&a[i]<119||a[i]>=65&&a[i]<=86)
					a[i]=(char)(a[i]+4);
				else if(a[i]>=119&&a[i]<=122||a[i]>=87&&a[i]<=90)
					a[i]=(char)(a[i]-22);
				else if(a[i]>=48&&a[i]<=54)
					a[i]=(char)(a[i]+4);
				else if(a[i]>=55&&a[i]<=57)
					a[i]=(char)(a[i]-4);
			}
		}
		String temp="";
		for(int i=0;i<a.length;i++)
			{
					temp+=a[i];
			}
			System.out.print(temp);
	}
}
