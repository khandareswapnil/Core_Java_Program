//  constructor Assignment 1

import java.util.*;
class Value
{
	protected int x;
	protected int y;
	void setValue(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
}

class Add extends Value
{
	int getAdd()
	{
		return x+y;
	}
}
class Mul extends Value
{
	int getMul()
	{
		return x*y;
	}
}

class Div extends Value
{
	int getDiv()
	{
		return x/y;
	}
}

public class Assignment1
{
	public static void main(String p[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Two Values");
		int x=s.nextInt();
		int y=s.nextInt();
		
		Add a= new Add();
		a.setValue(x,y);
		int res=a.getAdd();
		System.out.println("The Addition of Two Number\t"+res);
		Mul m=new Mul();
		m.setValue(x,y);
		int res1=m.getMul();
		System.out.println("The Muliplication of Two Number\t"+res1);
		Div d=new Div();
		d.setValue(x,y);
		int res2=d.getDiv();
		System.out.println("The Division of Two Number\t"+res2);
	}
}