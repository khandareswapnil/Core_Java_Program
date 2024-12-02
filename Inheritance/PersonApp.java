// inheritence


import java.util.*;
class Person
{
	String name;
	int age;
	Person(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	void dispalyInfo()
	{
		System.out.println("Name\t"+name);
		System.out.println("Age\t"+age);
	}
}

class Student extends Person
{
	int major;
	Student(String name,int age,int major)
	{
		super(name,age);
		this.major=major;
	}
	
	void dispalyInfo()
	{
		System.out.println("This is Student Information");
		System.out.println("Name\t"+name);
		System.out.println("Age\t"+age);
		System.out.println("Major\t"+major);
	}
}

class Teacher extends Person
{
	String subject;
	Teacher(String name,int age,String subject)
	{
		super(name,age);
		this.subject=subject;
	}
	void dispalyInfo()
	{
		System.out.println("This is Teacher Information");
		System.out.println("Name\t"+name);
		System.out.println("Age\t"+age);
		System.out.println("Subject\t"+subject);
	}
}

public class PersonApp
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Name and age of Student");
		String name=s.nextLine();
		int age=s.nextInt();
		System.out.println("Enter the Major of Student");
		int major=s.nextInt();
		
		System.out.println("Enter the name and age of teacher");
		s.nextLine();
		String tname=s.nextLine();
		int tage=s.nextInt();
		s.nextLine();
		System.out.println("Enter the Subject Of Teacher");
		String subject=s.nextLine();
		
		Student std=new Student(name,age,major);
		std.dispalyInfo();
		
		Teacher t=new Teacher(tname,tage,subject);
		t.dispalyInfo();
		
	}
}