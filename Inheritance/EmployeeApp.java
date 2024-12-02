// Employee Management System


import java.util.*;
class Employee
{
		String name;
		int id;
		double salary;
		void setValues(String name,int id,double salary)
		{
			this.name=name;
			this.id=id;
			this.salary=salary;
		}
		
		void displayDetails()
		{
			System.out.println("Name\t"+name);
			System.out.println("id\t"+id);
			System.out.println("Salary\t"+salary);
		}
}

class Manager extends Employee
{
	String department;
	double bonus;
	void setManageValues(String department,double bonus)
	{
		this.department=department;
		this.bonus=bonus;
	}
	
	void displayDetails()
	{
		System.out.println("Name\t"+name);
		System.out.println("id\t"+id);
		System.out.println("Salary\t"+salary);
		System.out.println("Department\t"+department);
		System.out.println("Bonus\t"+bonus);
	}
}
public class EmployeeApp
{
	public static void main(String x[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Name of Employee");
		String name=s.nextLine();
		System.out.println("Enter the Id of Employee");
		int id=s.nextInt();
		System.out.println("Enter the Salary of Employee");
		double salary=s.nextDouble();
		System.out.println("Enter the Department");
		s.nextLine();
		String department=s.nextLine();
		System.out.println("Enter the Bonus");
		double bonus=s.nextDouble();
		
		Manager m=new Manager();
		m.setValues(name,id,salary);
		m.setManageValues(department,bonus);
		m.displayDetails();
	}
}
