// Question 9 Abstraction 


abstract class Bird
{
	abstract void fly();
	abstract void makeSound();
}

class Eagle extends Bird
{
	void fly()
	{
		System.out.println("Hi i am Eagle. I am flying in sky");
	}
	void makeSound()
	{
		System.out.println("Hi I am Eagle. My Sound rrr");
	}
}

class Hawk extends Bird
{
	void fly()
	{
		System.out.println("Hi i am Hawk. I am flying in sky");
	}
	void makeSound()
	{
		System.out.println("Hi I am Hawk. My Sound jjj");
	}
}
public class BirdApp
{
	public static void main(String x[])
	{
		Eagle e=new Eagle();
		e.fly();
		e.makeSound();
		
		Hawk h=new Hawk();
		h.fly();
		h.makeSound();
	}
}