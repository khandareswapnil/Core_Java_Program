// Abstraction Question 

import java.util.*;

abstract class Shape1
{
	abstract double area();
	abstract double perimeter();
	void display()
	{
		System.out.println("Area is "+area());
		System.out.println("Perimeter is "+perimeter());
	}
}

class Circle extends Shape1
{
	double r;
	double area;
	double perimeter;
	Circle(double r)
	{
		this.r=r;
	}
	double area()
	{
		area=3.14*r*r;
	}
	double perimeter()
	{
		perimeter=2.3414*r;
	}
	
	void display()
	{
		super.display();
	}
}

class Rectangle extends Shape1
{
	int height;
	int width;
	int area;
	int perimeter;
	
	Rectangle(int width,int height)
	{
		this.height=height;
		this.width=width;
	}
	
	void area()
	{
		area=height*width;
	}
	void perimeter()
	{
		perimeter=2*(height+width);
	}
	void display()
	{
		super.display();
	}
	
}

public class ShapeApp1
{
	public static void main(String x[])
	{
		Scanner s=new Scanner();
		System.out.println("Enter the Radius");
		double r=s.nextDouble();
		
		System.out.println("Enter the Width and Heigth");
		int width=s.nextInt();
		int height=s.nextInt();
		
		Circle c=new Circle(r);
		c.display();
		Rectangle re=new Rectangle(width,height);
		re.display();
	}
	

}
