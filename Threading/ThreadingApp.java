// 

import java.lang.Thread;
class D extends Thread
{
	void show()
	{
		System.out.println("I am show method");
	}
	public void run() 
	{
		
		try{
		System.out.println("Hi i am D class");
		Thread.sleep(1000);
		System.out.println("Hi am D of Another Class");
		}
		catch(Exception ex)
		{
			System.out.println("Error is"+ex);
		}
	}
	
}
class E extends Thread 
{
	public void run()
	{
		System.out.println("Hi i am E class");
		
	}
}
public class ThreadingApp
{
	public static void main(String x[])
	{
		D d=new D();
		d.run();
		d.show();
		E e=new E();
		e.run();
	}
}