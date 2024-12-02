// 

interface Animal{
	 void sound();
	 void eat();
}

class Dog implements Animal{
	public void sound()
	{
		System.out.println("Hi Am Dog Sound");
	}
	public void eat()
	{
		System.out.println("Hi I Am Dog Eat");
	}
}

class Cat implements Animal
{
	public void sound()
	{
		System.out.println("Hi Am Cat Sound");
	}
	 public void eat()
	{
		System.out.println("Hi I Am cat Eat");
	}
}

public class AnimalApp
{
	public static void main(String x[])
	{
		Dog d=new Dog();
		d.sound();
		d.eat();
		
		Cat c=new Cat();
		c.sound();
		c.eat();
	}
}