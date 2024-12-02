// Question 4

import java.util.*;

abstract class Employee
{
	String name;
	String lname;
	int salary;
	void setValue(String name,String lname,int salary)
	{
		this.name=name;
		this.lname=lname;
		this.salary=salary;
	}
	abstract void calculateSalary();
	abstract void displayInfo();
}

class Manager extends Employee
{
	void displayInfo()
	{
		System.out.println("Name :\t"+name);
		System.out.println("Last Name:\t"+lname);
	}
	void calculateSalary()
	{
		System.out.println("Salary :\t"+salary);
	}
	
}

class Programmer extends Employee
{
	void displayInfo()
	{
		System.out.println("Name :\t"+name);
		System.out.println("Last Name:\t"+lname);
	}
	void calculateSalary()
	{
		System.out.println("Salary :\t"+salary);
	}
}

public class EmployeeApp1
{
	public static void main(String x[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name of Manager");
		String name=s.nextLine();
		System.out.println("Enter the Last Name of Manager");
		String lname=s.nextLine();
		System.out.println("Enter the Salary of Manager");
		int salary=s.nextInt();
		
		System.out.println("Enter the name of Programmer");
		s.nextLine();
		String pname=s.nextLine();
		System.out.println("Enter the Last Name of Programmer");
		String plname=s.nextLine();
		System.out.println("Enter the Salary of Programmer");
		int psalary=s.nextInt();
		
		Manager  m =new Manager();
		System.out.println("Manager Info");
		m.setValue(name,lname,salary);
		m.displayInfo();
		m.calculateSalary();
		
		Programmer p=new Programmer();
		System.out.println("Programmer Info");
		p.setValue(pname,plname,psalary);
		p.displayInfo();
		p.calculateSalary();
		
	}
}