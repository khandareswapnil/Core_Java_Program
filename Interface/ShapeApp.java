// Interface Question2

import java.util.*;
interface Shape
{
	void area();
	void perimeter();
}
class Circle implements Shape
{
	float r;
	Circle(float r)
	{
		this.r=r;
	}
	public void area()
	{
		System.out.printf("Radius is %f", 3.14*r*r);
	}
	public void perimeter()
	{
		System.out.printf("Perimeter is %f",2*3.14*r);
	}
}

class Rectangle implements Shape
{
	int l;
	int b;
	Rectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	public void area()
	{
		System.out.printf("The Area of Reactangle is %d",l*b); 
	}
	public void perimeter()
	{
		System.out.printf("The Perimeter Of Reactangle %d",(l+b)*2);
	}
	
}
public class ShapeApp
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Radius of Circle");
		float r=s.nextFloat();
		System.out.println("Enter the Length and Breadth");
		int len=s.nextInt();
		int bre=s.nextInt();
			
			Circle c=new Circle(r);
			c.area();
			c.perimeter();
			
			Rectangle reac = new Rectangle(len,bre);
			reac.area();
			reac.perimeter();
		
	}
}