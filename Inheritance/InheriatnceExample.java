// 

import java.util.*;
 class operation21
{
	protected int a;
	protected int b;
	void show(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	 void getAdd()
	 {
	 }
}

class operation22 extends operation21
{

	void getAdd()
	{
		int add=a+b;
		System.out.println(add);
	}
}
public class InheriatnceExample
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Two values");
		int a=s.nextInt();
		int b=s.nextInt();
		
		operation21 o2=new operation22();
		o2.show(a,b);
		o2.getAdd();
	}
}