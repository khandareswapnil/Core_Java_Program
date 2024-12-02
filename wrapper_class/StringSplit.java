// String split(String)

public class StringSplit
{
	public static void main(String x[])
	{
		String s="abc@gmail.com,pqr@gmail.com,xyz@gmail.com";
		
		String email[]=s.split(",");
		for(String emails:email)
		{
			System.out.println(emails);
		}
	}
}

