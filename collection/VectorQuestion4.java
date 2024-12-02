// Question 4

import java.util.*;
public class VectorQuestion4
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		
		Vector <String> v=new Vector<>();
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter the String");
			String str=s.nextLine();
			v.add(str);
		}
		
		for(String str:v)
		{
			if(str.endsWith("sh"))
			{
				System.out.println(str);
			}
		}
	}
}