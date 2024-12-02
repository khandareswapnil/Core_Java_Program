// School Management System

import java.util.*;
class Person
{
	String name;
	int age;
	int id;
	void setValue(String name, int age, int id)
	{
		this.name=name;
		this.age=age;
		this.id=id;
	}
	void displayDetails()
	{
		System.out.println("Name\t"+name);
		System.out.println("Age\t"+age);
		System.out.println("ID\t"+id);
	}
}

class Student extends Person
{
	String grade;
	void setGrade(String grade)
	{
		this.grade=grade;
	}
	
	void displayDetails()
	{
		System.out.println("Student Info");
		super.displayDetails();
		System.out.println("Grade\t"+grade);
	}
}

class Teacher extends Person
{
	String subject;
	void setSubject(String subject)
	{
		this.subject=subject;
	}
	
	void displayDetails()
	{
		System.out.println("Teacher Info");
		super.displayDetails();
		System.out.println("Subject\t"+subject);
	}
}

public class SchoolManagementSystem
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Name of Student");
		String name=s.nextLine();
		System.out.println("Enter the Age of Student");
		int age=s.nextInt();
		System.out.println("Enter the ID of Student");
		int id=s.nextInt();
		s.nextLine();
		System.out.println("Enter the Grade of Student");
		String greade=s.nextLine();
		
		System.out.println("Enter the Name of Teacher");
		String tname=s.nextLine();
		System.out.println("Enter the Age of Teacher");
		int tage=s.nextInt();
		System.out.println("Enter the ID of Teacher");
		int tid=s.nextInt();
		s.nextLine();
		System.out.println("Enter the Subject oF Teacher");
		String subject=s.nextLine();
		
		Student std=new Student();
		std.setValue(name,age,id);
		std.setGrade(greade);
		std.displayDetails();
		
		Teacher t=new Teacher();
		t.setValue(tname,tage,tid);
		t.setSubject(subject);
		t.displayDetails();
		
	}
}