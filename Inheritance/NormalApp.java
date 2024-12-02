// Question 5

abstract class Normal
{
	abstract void show();
}

class NaBp
{
	void show()
	{
		System.out.println("I am Child Class");
	}
}

public class NormalApp
{
	public static void main(String x[])
	{
		NaBp n = new NaBp();
		n.show();
	}
}