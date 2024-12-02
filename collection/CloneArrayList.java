// Clone Copy In Java 

import java.util.*;
public class CloneArrayList
{
	public static void main(String x[])
	{
		ArrayList  al=new ArrayList ();
		al.add(50);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(60);
		
		ArrayList cloneList=(ArrayList) al.clone();
		System.out.println(al);
		System.out.println(cloneList);
		//Modifing Original ArrayList
		
		al.add(100);
		System.out.println(al);
		System.out.println(cloneList);
		Object value=al.get(2);
		System.out.println(value);
	}
}