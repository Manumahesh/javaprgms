import java.util.Scanner;
class Wipro1 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n:");
		int n=s.nextInt();
		int [][]a=new int[n][n];
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=++count;
				System.out.print(a[i][j]+"     ");
			}
			System.out.println();
		}
		int k=1;
		int[][] b=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0)
				{
					b[i][j]=a[i][j];
				}
				else if(i%2==0)
				{
					b[n-k][j]=a[i][j];
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(b[i][j]+"    ");
			}
			System.out.println();
		}
	}
}
