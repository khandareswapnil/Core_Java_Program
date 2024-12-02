//Wrapper Class

public class StringApp
{
	public static void main(String x[])
	{
		String s="Good Morning India";
		int index=s.indexOf("Ma");
		if(index!=-1)
		{
			System.out.println("Data Found");
		}
		else
		{
			System.out.println("Data Not Found");
		}
	}
}
