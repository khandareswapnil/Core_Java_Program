// Join the Two ArrayList
import java.util.*;
public class JoinArrayList
{
	public static void main(String x[])
	{
		ArrayList al=new ArrayList();
		ArrayList al1=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		
		System.out.println(al);
		al1.add("A");
		al1.add("B");
		al1.add("C");
		al1.add("D");
		al1.add("E");
		al1.add("F");
		al1.add("G");
			System.out.println("Second Array List");
			System.out.println(al1);
		
			al.addAll(al1);
			System.out.println("After Joining The ArrayList");
						System.out.println(al);

		
		
	

	}
	
}