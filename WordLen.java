import java.util.Scanner;
class WordLen 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s1=s.nextLine();
		String temp="";
		s.close();
		int count=0;
		for(int i=0;i<s1.length()-1;i++)
		{
			if(s1.charAt(i)==' '&&s1.charAt(i+1)!=' ')
				count++;
		}
		String[] ar=new String[count+1];
		int j=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=' ')
				temp+=s1.charAt(i);
			else
			{
				ar[j]=temp;
				j++;
				temp="";
			}
		}
		ar[j]=temp;
		temp="";
		for(int i=0;i<ar.length;i++)
		{
			temp+=ar[ar.length-1]+ar[i]+(ar[i]+ar[ar.length-1-i]).length()+" ";
		}
		temp+=ar[ar.length/2]+ar[ar.length/2].length();
		System.out.println(temp);
	}
}
