// searching element

import java.util.*;
public class SearchingElement
{
	public static void main(String x[])
	{
		Vector  v=new Vector();
		v.add(1);
		v.add(2);
		v.add("hi");
		v.add(4);
		v.add(2);
		
		System.out.println(v);
		int index=v.indexOf(2);
		System.out.println(index);
		int lastindex=v.lastIndexOf(2);
		System.out.println(lastindex);
		
		//int c=v.get(2);
		if(v.get(i)==2)
		v.remove(1);
				System.out.println(v);

	}
}