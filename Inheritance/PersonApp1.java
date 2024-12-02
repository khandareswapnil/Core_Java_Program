// Question 7 Abstraction 

abstract class Person
{
	abstract void eat();
	abstract void exercise();
}

class Athlete extends Person
{
	void eat()
	{
		System.out.println("Minimum Eating");
	}
	void exercise()
	{
		System.out.println("Daily Exercise");
	}
}

class LazyPerson extends Person
{
	void eat()
	{
		System.out.println("Maximum eating");
	}
	void exercise()
	{
		System.out.println("No Exercise");
	}
}
public class PersonApp1
{
	public static void main(String x[])
	{
		Athlete a=new Athlete();
		a.eat();
		a.exercise();
		LazyPerson l=new LazyPerson();
		l.eat();
		l.exercise();
	}
}