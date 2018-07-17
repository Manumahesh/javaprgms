import java.util.Scanner;
class Horse 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number of horses:");
		int n=scn.nextInt();
		System.out.println("Enter the horses:");
		int []a=new int[5];
		for(int i=0;i<n;i++)
		{
			a[i]=scn.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		int c=0;
		for(int i=0;i<n-1;i++)
		{
			if(a[i]>a[i+1])
				c=a[i]-a[i+1];
			else
				c=a[i+1]-a[i];

			}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println(c);
	}
}
