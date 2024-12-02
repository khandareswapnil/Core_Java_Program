// Question 6

interface A
{
	void show();
}
interface B
{
	void show();
}
class C implements A,B
{
	public void show()
	{
		System.out.println("Hi Am Show Method");
	}
}
public class D
{
	public static void main(String x[])
	{
		C c=new C();
		c.show();
	}
}