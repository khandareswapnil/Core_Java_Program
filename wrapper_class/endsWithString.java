// Boolean endsWith(?String s)

public class endsWithString
{
	public static void main(String x[])
	{
		String s="ram,sham,ganesh,ramesh";
		String s1[]=s.split(",");
		for(String s2:s1)
		{
			boolean b=s2.endsWith("am");
			if(b)
			{
				System.out.println(s2);
			}
		}
	}
}


// litrals : meaning 