// inheritence Assignment 2

import java.util.*;
class Area
{
	protected float r;
	protected int len;
	protected int wid;
	void setRadius(float r)
	{
		this.r=r;
	}
	void setLength(int len,int wid)
	{
		this.len=len;
		this.wid=wid;
	}
}

class Circle extends Area
{
	float getRadius()
	{
		return 2*3.14f*r;
	}
}

class Reactangle extends Area
{
	int getReactangle()
	{
		return len*wid;
	}
}



public class Assignment2
{
	public static void main(String x[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Radius");
		float r = s.nextFloat();
		
		System.out.println("Enter the Length and Width");
		int l=s.nextInt();
		int w=s.nextInt();
		
		Circle c=new Circle();
		c.setRadius(r);
		float a =c.getRadius();
		System.out.println("The Area of Circle\t"+a);
		
		Reactangle rea=new Reactangle();
		rea.setLength(l,w);
		int area=rea.getReactangle();
		System.out.println("The Area of Reactangle\t"+area);
		
	}
}