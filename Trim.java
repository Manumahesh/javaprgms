import java.util.Scanner;
class Trim 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String sen=s.nextLine();
		int sp=0,ep=0;
		for(int i=0;i<sen.length();i++)
		{
			if(sen.charAt(i)!=' ')
			{
				sp=i;
				break;
			}
		}
		for(int i=sen.length()-1;i>=0;i--)
		{
			if(sen.charAt(i)!=' ')
			{
				ep=i;
				break;
			}
		}
		String temp="";
		for(int i=sp;i<=ep;i++)
		{
			temp+=sen.charAt(i);
		}
		System.out.println(temp);
	}
}

