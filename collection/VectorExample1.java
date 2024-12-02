// set Manual capacity

import java.util.*;
public class VectorExample1
{
	public static void main(String x[])
	{
		Vector v= new Vector(3);
		System.out.println("The Default Capacity is" +v.capacity());
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		System.out.println("Vector Data Is" +v);
		System.out.println("Now Capacity is" +v.capacity());
		
	}
}