// super concept

class A
{
	A(int x)
	{
		System.out.println("I am super Class"+x);
	}
}

class B extends A
{
	B()
	{
		this(10);
		System.out.println("I am B Integer Constructor" );
	}
	B(int y)
	{
		this(true);
		System.out.println("I am this y Constructor" +y);
	}
	B(boolean z)
	{
		System.out.println("I am z Constructor" +z);
	}
}

public class Super
{
	public static void main(String x[])
	{
		B b=new B();
	}
}