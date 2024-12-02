// 

import java.util.*;
class L
{
	protected int x;
	void show(int x)
	{
		this.x=x;
	}
}

class C extends L
{
	void display(int y)
	{
		
		System.out.println("Y" +y);
		System.out.println("X"+x);
	}
}

public class Local
{
	public static void main(String x[])
	{
			Scanner s = new Scanner(System.in);
			C c=new C();
			c.show(50);
			c.display(100);
	}
}