// Method Start with

public class StartWithMethod
{
	public static void main(String x[])
	{
		String s="ram,sham,ganesh,ramesh,suresh";
		String s1[]=s.split(",");
		for(String s2:s1)
		{
			boolean b=s2.startsWith("r");
			if(b)
			{
				System.out.println(s2);
			}
		}
	}
}