// vector set default capacity and incremental capacity


import java.util.*;
public class VectorExample2
{
	public static void main(String x[])
	{
		Vector v=new Vector(3,1);
		System.out.println("The Default Capacity of Vector"+ v.capacity());
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		System.out.println("Vector Is "+v);
		System.out.println("Now Capacity of Vector"+ v.capacity());

	}
}