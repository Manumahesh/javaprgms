import java.util.Scanner;
class Newpat 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number of stars:");
		int n=scn.nextInt();
		scn.close();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<n;j++)
			{
				if(i==j)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			for(int j=0;j<n;j++)
			{
				if(i+j==
					(n-1))
				System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=n-1;j>=i;j--)
			{
				System.out.print("*");
			}
			for(int j=0;j<n;j++)
			{
				if(i+j==(n-1))
				System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int j=0;j<n;j++)
			{
				if(i==j)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int j=n-1;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=n-1;j>=i;j--)
			{
				System.out.print("*");
			}
			for(int j=n-1;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
