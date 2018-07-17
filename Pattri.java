import java.util.Scanner;
class  Pattri
{
	public static void main(String[] args) 
	{
		Scanner scn=new  Scanner(System.in);
		System.out.println("Enter the number of stars:");
		int n=scn.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0&&j<=(n-1)||j==0)
				System.out.print("a");
				else
					System.out.print(" ");
			}
			for(int j=0;j<n;j++)
			{
				if(i==0||i<=(n-1)&&j==(n-1))
				System.out.print("a");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==(n/2)||i<=(n/2)&&j==0)
				System.out.print("a");
				else
					System.out.print(" ");
			}
			for(int j=0;j<n;j++)
			{
				if(i==(n/2)||i<=(n/2)&&j==(n-1)||(i>=(n/2))&&(j>=(n/2))&&(i+j==(n-2)))
				System.out.print("a");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}