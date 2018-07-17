import java.util.Scanner;
class Wipro 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			if((i%2)==0)
			{
				for(int j=n;j>=1;j--)
				{
					System.out.print(i+1);
				}
				System.out.print(i+2);
				System.out.println();
			}
			else
			{
				System.out.print(i+2);
				for(int j=n;j>=1;j--)
				{
					System.out.print(i+1);
				}
				System.out.println();
			}
		}
	}
}
