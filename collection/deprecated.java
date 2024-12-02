// searching element

import java.util.*;
public class SearchingElement
{
	public static void main(String x[])
	{
		Vector <Integer> v=new Vector <>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		
		int index=v.indexOf(2);
		System.out.println(index);
		int lastindex=v.lastIndexOf(2);
		System.out.println(lastindex);
	}
}