// Synchronized Block

import java.lang.Thread;
class A
{
	void printTable(int n)
	{
		synchronized(this){
			for(int i=0;i<=5;i++)
			{
				System.out.println(n*i);
				try{
					Thread.sleep(1000);
				}
				catch(Exception ex)
				{
					System.out.println("Error is "+ex);
				}
			}
		}
	}
}

class B extends Thread
{
	A a;
	B(A a)
	{
		this.a=a;
	}
	public void run()
	{
		a.printTable(2);
	}
}

class C extends Thread
{
	A a;
	C(A a)
	{
		this.a=a;
	}
	public void run()
	{
		a.printTable(5);
	}
}	

public class SynchronizedBlock
{
	public static void main(String x[]) throws Exception
	{
		A a=new A();
		B b=new B(a);
		C c=new C(a);
		b.start();
		b.join();
		c.start();
		
	}
}