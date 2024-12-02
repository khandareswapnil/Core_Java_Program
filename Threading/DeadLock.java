// DeadLock

import java.lang.Thread; 
class A extends Thread
{
	public synchronized void d( B b)
	{
		System.out.println("Hi I am As d method in A class");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception ex){}
		System.out.println("we call the B's last() meyhod");

		b.last();
	}
	
	public synchronized void last()
	{
		System.out.println("Hi am Last method in A class");
	}
} 
class B extends Thread
{
	public synchronized void d1(A a)
	{
		System.out.println("Hi i am d1 method in B class");
		try{
			Thread.sleep(1000);
		}
		catch(Exception ex){}
		System.out.println("hi we call the A's last() method");
			a.last();
	}
	public synchronized void last()
	{
		System.out.println("Hi am B's last method"); 
	}
}
public class DeadLock extends Thread
{
		A a=new A();
		B b=new B();

		public void m1()
		{
			this.start();
			a.d(b);
		}
		public void run()
		{
			b.d1(a);
		}
		

	
	public static void main(String x[])
	{
		DeadLock t=new DeadLock();
		t.m1();
	}
}