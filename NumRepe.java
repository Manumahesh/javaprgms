import java.util.Scanner;
class NumRepe 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String ip=s.nextLine();
		int count=0;
		char [] a=ip.toCharArray();
		String temp="";
		for(int i=0;i<ip.length()-1;i++)
		{
			if(a[i]=='1')
			{
				count++;
			}
			else if(a[i]=='0'&&a[i+1]!='0'&&count!=1)
			{
				System.out.println(count);
				count=0;
			}
		}
		//temp+=a[ip.length()-1];
		if(ip.charAt(ip.length()-1)=='1')
		System.out.println(count+1);
		else
		System.out.println(count+1);
		//System.out.print(ip.charAt(ip.length()-1)+" ");
		//System.out.println(count+1);
		//System.out.println(ip);
	}
}
