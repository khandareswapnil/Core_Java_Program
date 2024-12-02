// Question 19


public class Demo
{
	public static void main(String x[])
	{
		String s="What";
		StringBuffer  sb=new StringBuffer("What");
		System.out.print(sb.compareTo(s)+","+s.compareTo(sb));
		System.out.println("\nhashCode of S is "+System.identityHashCode(s));
		
		System.out.println("\nhashCode of S is "+System.identityHashCode(sb));

	}
}


