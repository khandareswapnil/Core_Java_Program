// Question 2

abstract class Shape
{	
	int r;
	int b;
	int h;
	void setValue(int r,int b,int h)
	{
		this.r=r;
		this.b=b;
		this.h=h;
	}
	abstract void calculateArea();
	abstract void calculatePerimeter();
}

class Circle
{
	void calculateArea()
	{
		int Area=3.14*r*r;
		System.out.println("Area of Circle\t"+Area");
	}
	
}

class 

public class ShapeApp
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Radius of Circle");
		float r=s.nextFloat();
		Circle c=new Circle();
		c.calculateArea();
	}
}