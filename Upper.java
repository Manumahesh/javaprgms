Dimport java.util.Scanner;
class Upper 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the string:");
		String name=scn.nextLine();
		String temp="";
		for(int i=0;i<name.length()-1;i++)
		{
			//Uppercase
			if(name.charAt(i)>64&&name.charAt(i)<91)
				temp+=(char)(name.charAt(i)+32);
			else if(name.charAt(i)>=97&&name.charAt(i)<=122)
				temp+=(char)(name.charAt(i)-32);
			else
				temp+=name.charAt(i);
		}
		System.out.println(temp);
	}
}
