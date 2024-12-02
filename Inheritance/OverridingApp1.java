// method overriding

class A
{
	static void show()
	{
		System.out.println("I am Parent Class");
	}
}

class B extends A
{
	static void show()
	{
		System.out.println("I am Child Class B");
	}
}

class C extends A
{
	static void show()
	{
		System.out.println("I am child class c");
	}
}

public class OverridingApp1
{
	public static void main(String x[])
	{
		A a=new B();
		a.show();
		a=new C();
		a.show();
	}
}