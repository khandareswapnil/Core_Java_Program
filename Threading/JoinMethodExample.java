//  Join Method

import java.lang.Thread;
class A extends Thread
{
	public void run()
	{
		try{
		for(int i=1;i<=30;i++)
		{
			System.out.printf("First = %d\n",i);
			Thread.sleep(1000);	
		}
		}
			catch(Exception ex)
			{
			System.out.println("Error is"+ex);
			}
	}
}


class B extends Thread
{
	public void run() 
	{
		try{
			
		for(int i=5;i<40;i++)
		{
			
			System.out.printf("Second = %d\n",i);
			Thread.sleep(1000);
		}
		}
		catch(Exception ex)
			{
			System.out.println("Error is"+ex);
			}
	}
}
	

public class JoinMethodExample
{
	public static void main(String x[]) throws Exception
	
	{
		A a=new A();
		a.start();
		a.join();
		B b=new B();
		b.start();
	}
}