// join concept in Thread

import java.lang.Thread;
class Thread1 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<=6;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
			
		}
		catch(Exception ex)
		{
			System.out.println("Error ex" +ex);
		}
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=11;i<=20;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error ex" +ex);
		}
	}
}

class Thread3 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=21;i<=30;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error ex" +ex);
		}
	}
}

public class JoinThread
{
	public static void main(String x[]) throws Exception
	{
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		Thread3 t3=new Thread3();
		
		t3.join();
		t1.start();
		//t1.join();
		t2.start();
		//t2.join();
		t3.start();
		
	
	}
}