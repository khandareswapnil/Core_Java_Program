// Naming thread

import java.lang.Thread;
public class MultiThread extends Thread
{
	public void run()
	{
		System.out.println("Running.......");
	}
	
	public static void main(String x[])
	{
		MultiThread m=new MultiThread();
		MultiThread m2=new MultiThread();
		
		System.out.println(m.getName());
		System.out.println(m2.getName());
		m.start();
		m2.start();
		System.out.println("After the Chaning The Name");
		m.setName("HEllo");
		System.out.println(m.getName());
	}
}