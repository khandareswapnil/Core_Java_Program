

abstract class MyAbstract{
   private void MyMethod()
{
	System.out.println("private methood");
}
}

class MyClass extends MyAbstract
{
	public static void main(String x[])
	{
		MyAbstract obj=new MyClass();
		obj.MyMethod();
	}
}