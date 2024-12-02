// constructor using inheritance

class A
{
	A()
	{
		System.out.println("I am Parent Class");
	}
}

class B extends A
{
	B()
	{
		System.out.println("I am Child Class");
	}
}

public class Default
{
	public static void main(String x[])
	{
		B b=new B();
	}
}