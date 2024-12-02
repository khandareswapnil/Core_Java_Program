// Question 3

import java.util.*;
class Swap
{
	/*int a,b;

	void setValue(int a,int b)
	{
		this.a=a;
		this.b=b;
	}*/
	void swapDigit(int a,int b)
	{
		int c = a;
		a=b;
		b=c;
		System.out.printf("After Swapping Values %d and %d",a,b);
	}

	void swapValue(int a,int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.printf("\nAfter Swapping Value Without using third Variable %d and %d", a,b);  
	}
}
public class Question3
{
	public static void main(String x[])
	{
		int a,b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Two Values");
		a = s.nextInt();
		b = s.nextInt();

		Swap sw = new Swap();
		//sw.setValue(a,b);
		sw.swapDigit(a,b);
		sw.swapValue(a,b);
	}
}
