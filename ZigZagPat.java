import java.util.Scanner;
class ZigZagPat 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int[] ar1={1,2,3,4,5,6};
		int[] ar2={2,4,4,1,7,9,7,4,5,6,3};
		int n1=ar1.length;
		int n2=ar2.length;
		int k=0;
		if(n1>=n2)
		{
			k=n1;
		}
		else
		{
			k=n2;
		}
		int j=0;
		int []o=new int[n1+n2];
		for(int i=0;i<k;i++)
		{
			if(i<n1)
			{
				o[j]=ar1[i];
				j++;
			}
			if(i<n2)
			{
				o[j]=ar2[i];
				j++;
			}
		}
		int n=n1+n2;
		for(int i=0;i<n;i++)
		{
			System.out.print(o[i]+" ");
		}
	}
}
