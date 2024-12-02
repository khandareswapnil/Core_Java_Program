// Is Alive Method 

import java.lang.Thread;
class A extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=8;i++)
			{
				System.out.printf("First %d \t\n ",i);
				
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
		try
		{
			for(int i=5;i<=10;i++)
			{
				System.out.printf("second %d\n",i);
				Thread.sleep(10000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is"+ex);
		}
	}
}

public class IsAliveMethod
{
	public static void main(String x[]) throws Exception
	{
		A a=new A();
		a.start();
		a,joi();
		//System.out.println("Now the status of First Thread"+a.isAlive());
		B b=new B();
		b.start();
	}
}