// Syncronization 

import java.lang.Thread;
class Table
{
	synchronized void ptintTable(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(n*i);
		}
		try
		{
			Thread.sleep(400);
		}
		catch(Exception ex)
		{
			System.out.println("error is "+ex);
		}
	}
}

class MyThread1 extends Thread
{
	Table t;
	MyThread1(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.ptintTable(2);
	}
}

class MyThread2 extends Thread
{
	Table t;
	MyThread2(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.ptintTable(5);
	}
}

public class SynchronizationAPP
{
	public static void main(String x[])
	{
		Table t=new Table();
		MyThread1 obj1=new MyThread1(t);
		MyThread2 obj2=new MyThread2(t);
		obj1.start();
		obj2.start();
	}
}