import java.util.Scanner;

class Demo1 extends Thread
{
	public void run()
	{
		try{
			//Thread t2=Thread.currentThread();
			//System.out.println(t2);
			System.out.println("Banking activity/n");
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter Ac/no=");
			int a=scan.nextInt();
			System.out.println("Enter password=");
			int p=scan.nextInt();
			Thread.sleep(5000);
			System.out.println("Collect your money");
			System.out.println("Banking scti ended");
		}
		catch(Exception e)
		{
			System.out.println("Banking acti interrupted");
		}
	}
}


class Demo2 extends Thread
{
	public void run()
	{
		try{
			Thread t=Thread.currentThread();
			System.out.println(t);
			System.out.println("Num printing/n");
			for(int i=0;i<10;i++)
			{
				System.out.println(i);	
				Thread.sleep(5000);
			}
			System.out.println("Nnum printing ended");
		}
		catch(Exception e)
		{
			System.out.println("Printing acti interrupted");
		}
	}
}

class Launch
{
	public static void main(String	args[])
	{
		Thread t3=Thread.currentThread();
		System.out.println(t3);
		Demo1 d1= new Demo1();
		Demo2 d2= new Demo2();

		d1.start();
		d2.start();
	}
}