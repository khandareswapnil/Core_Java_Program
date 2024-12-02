// Question 3

interface Movable
{
	void move();
}
interface Flyable
{
	void fly();
}

class Airplane implements Movable,Flyable
{
	public void move()
	{
		System.out.println("Hi Am Airplane Move From One Position to Another Position");
	}
	public void fly()
	{
		System.out.println("Hi Am Airplane Fly In Air");
	}
}

public class MovableApp
{
	public static void main(String x[])
	{
		Airplane a=new Airplane();
		a.move();
		a.fly();
	}
}