// 

import java.util.*;
class Animal
{
	String name;
	int age;
	Animal(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	void makeSound()
	{
		System.out.println("hi");
	}
	
	void displaInfo()
	{
		System.out.println("Name\t"+name);
		System.out.println("Age\t"+age);
	}
}

class Dog extends Animal
{
	Dog(String name,int age)
	{
		super(name,age);
	}
	
	void makeSound()
	{
		System.out.println("Dog Info");
		System.out.println("BHO BHO");
	}
	
	void fetch()
	{
		System.out.println(name+ "is fetching the ball");
	}
}

class Cat extends Animal
{
	Cat(String name, int age)
	{
		super(name,age);
	}
	void makeSound()
	{
		System.out.println("Cat Info");
		System.out.println("Mau Mau");
	}
	void scratch()
	{
		System.out.println(name+ "is scratching the furniture");
	}
}



public class AnimalApp
{
	public static void main(String x[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Name And Age of Dog");
		String name=s.nextLine();
		int age=s.nextInt();
		
		System.out.println("Enter the Name and Age");
		s.nextLine();
		String cname=s.nextLine();
		int cage=s.nextInt();
		
		Dog d=new Dog(name,age);
		d.makeSound();
		d.displaInfo();
		d.fetch();
		
		Cat c=new Cat(cname,cage);
		c.makeSound();
		c.displaInfo();
		c.scratch();
		
	}
}