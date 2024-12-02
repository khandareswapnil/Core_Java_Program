// Thread Concept

import java.lang.Thread;
class A extends Thread
{
	public void run() 
	{
		try{
		for(int i=0;i<=20;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				Thread.sleep(1);
			}
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
		for(int i=1;i<=20;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
				Thread.sleep(1);
			}
		}
		}
		catch(Exception ex)
		{
			System.out.println("Error is"+ex);
		}
	}
}


public class ThreadConcept
{
	public static void main(String x[])
	{
		A a=new A();
		a.start();
		B b=new B();
		b.start();
	}
}