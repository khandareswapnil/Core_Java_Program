// 

class A implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}

public class Example1
{
	public static void main(String x[])
	{
		A a=new A();
		//Thread t=new Thread(a);
		a.run();
	}
}