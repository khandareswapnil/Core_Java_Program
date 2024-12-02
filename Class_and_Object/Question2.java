// Question 2
import java.util.*;
class Area
{
	double r,l,b,b1,h,cArea,rArea,tArea;
	void setValue(double r,double l,double b,double h,double b1)
	{
		this.r=r;
		this.l=l;
		this.b=b;
		this.h=h;
		this.b1=b1;
	}
	void calArea()
	{
		cArea=3.14*r*r;
	}
	void calRect()
	{
		rArea=l*b;
	}
	void calTri()
	{
		tArea=0.5*b1*h;
	}
	void showArea()
	{
		System.out.println("Area of Circle "+cArea);
		System.out.println("Area of Rectangle "+rArea);
		System.out.println("Area of Triangle "+tArea);
	}
}
public class Question2
{
	public static void main(String x[])
	{
		double r,l,b,h,b1;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the radius of Circlr");
		r = s.nextInt();
		System.out.println("Enter the length and Breadth of Rectangle");
		b=s.nextInt();
		l=s.nextInt();
		System.out.println("Enter the breadth and height of triangle");
		b1=s.nextInt();
		h=s.nextInt();
		
		Area a = new Area();
		a.setValue(r,l,b,h,b1);
		a.calArea();
		a.calRect();
		a.calTri();
		a.showArea();
	}
}