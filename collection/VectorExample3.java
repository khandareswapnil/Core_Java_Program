// copy the constructor from one collection to another collection

import java.util.*;
public class VectorExample3
{
	public static void main(String x[])
	{
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		Vector v=new Vector(al);
		System.out.println(v);
		System.out.println(v.capacity());
	}
}