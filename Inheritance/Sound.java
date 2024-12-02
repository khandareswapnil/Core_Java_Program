// Question 1

abstract class Animal
{
	abstract void sound();
}

class Lion extends Animal
{
	void sound()
	{
		System.out.println("Hi I am Lion");
	}
}

class Tiger extends Animal
{
	void sound()
	{
		System.out.println("Hi I am Tiger");
	}
}

public class Sound
{
	public static void main(String x[])
	{
		Lion l=new Lion();
		l.sound();
		Tiger t=new Tiger();
		t.sound();
	}
}