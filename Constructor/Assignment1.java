
//Assignment 1

import java.util.*;
class Rectangle
{
	private int l,b;
	public Rectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	public void result()
	{
		int res=l*b;
		System.out.println("The Area of Rectangle is " +res);
	}
	
	
}
public class Assignment1
{
	public static void main(String x[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Length and Breadth of Renctangle");
		int len = s.nextInt();
		int bre = s.nextInt();

		Rectangle r = new Rectangle(len,bre);
		r.result();
	}
}

