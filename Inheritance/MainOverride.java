// 
class ChildMain
{
	public static void main(String x[])
	{
	
	System.out.println("Hi I Am Child Main Method");
	}
}

public class MainOverride
{
	public static void main(String x[])
	{
		System.out.println("I am Parent Main Method");
		ChildMain.main();
	}
}