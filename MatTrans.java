import java.util.Scanner;
class MatTrans 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the m and n");
		int m=s.nextInt();
		int n=s.nextInt();
		int [][]ar=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				ar[i][j]=s.nextInt();
			}
		}
		int [][]o=new int[m][n];
		for(int i=0;i<ar.length;i++)
		{
			int k=ar.length-1;
			for(int j=0;j<ar[i].length;j++)
			{
				o[i][j]=ar[k][i];
				k--;
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(o[i][j]+" ");
			}
			System.out.println();
		}
	}
}
