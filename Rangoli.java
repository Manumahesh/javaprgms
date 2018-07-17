import java.util.Scanner;
class Rangoli 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number of stars:");
		int n=scn.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i==0||i==n-1)&&j<n||(j==0||j==n-1)&&i<n||(i==(n/2)&&j<n||(j==(n/2)&&i<n)||i==j||i+j==n-1||i+j==(n/2)||i>(n/2)&&j<(n/2)&&i-j==(n/2)||j>(n/2)&&i<(n/2)&&j-i==(n/2)||i>(n/2)&&j>(n/2)&&i+j==n+5))
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

