// Compare To ArrayList 

import java.util.*;
public class CompareArrayList
{
	public static void main(String x[])
	{
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(500);
		al.add(300);
		al.add(400);
		al.add(200);
		//al.add(600);
		
		ArrayList al1 = new ArrayList();
		al1.add(100);
		al1.add(200);
		al1.add(300);
		al1.add(400);
		al1.add(500);
		
		if(al.equals(al1))
		{
			System.out.println("Both Are Equal");
		}
		else
		{
			System.out.println("Both Are Not Equal");
		}

	}
}