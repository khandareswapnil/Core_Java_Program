// Question 2

import java.util.*;
abstract class Shape
{	
	double r;
	int b;
	int h;
	void setValue(double r,int b,int h)
	{
		this.r=r;
		this.b=b;
		this.h=h;
	}
	abstract void calculateArea();
	abstract void calculatePerimeter();
}

class Circle extends Shape
{
	void calculateArea()
	{
		double Area=3.14*r*r;
		System.out.println("Area of Circle\t"+Area);
	}
	void calculatePerimeter()
	{
		double perimeter=2*3.14*r;
		System.out.println("Perimeter of Circle\t"+perimeter);
	}
}

class Triangle extends Shape
{
	void calculateArea()
	{
		
	}
	void 
}

 

public class ShapeApp
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Radius of Circle");
		double r=s.nextFloat();
		Circle c=new Circle();
		c.setValue(r,5,5);
		c.calculateArea();
		c.calculatePerimeter();
	}
}