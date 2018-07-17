import java.util.Scanner;
class Pat1 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=scn.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=i;j<n;j++)
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
			for(int j=i;j<n;j++)
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
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print("*");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=n;j>i;j--)
			{
				System.out.print("*");
			}
			for(int j=n;j>i;j--)
			{
				System.out.print("*");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=n;j>i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=n-1;j>i;j--)
			{
				System.out.print("*");
			}
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			for(int j=n-1;j>i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
