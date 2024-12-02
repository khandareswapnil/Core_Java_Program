// Shuffle Elements in array List

import java.util.*;
public class Shuffel
{
	public static void main(String x[])
	{
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		System.out.println("Original Array");
		System.out.println(al);
		System.out.println("After Shuffelling Array");
		        Collections.shuffle(al);

		System.out.println(al);

	}
}