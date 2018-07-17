import java.util.Scanner;
class PwrFun 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter x and y");
		int x=s.nextInt();
		int y=s.nextInt();
		int p=power(x,y);
		System.out.println(p);
	}
	public static int power(int x,int y)
	{
		int sum=1;
		for(int i=0;i<y;i++)
		{
			sum=sum*x;
		}
		return sum;
	}
}
