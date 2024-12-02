// Comparable

import java.util.*;
class Employee implements Comparable<Employee>   
{
	int id;
	String name;
	int salary;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public  int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public int getSalary()
	{
		return salary;
	}
	
	public Employee(){}
	public Employee(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public int CopmareTo(Employee e)
	{
		if(this.getId()>e.getId())
		{
			return 1;
		}
		else if(this.getId()<e.getId())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
public class ComparableApp1
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		ArrayList <Employee> al=new ArrayList <Employee> ();
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the ID");
			int id=s.nextInt();
			System.out.println("Enter the Name");
			String name=s.nextLine();
			System.out.println("Enter the Salary");
			int salary=s.nextInt();
			
			al.add(new Employee(id,name,salary));
		}
		
		System.out.println("Before Sorting Records");
		for(Employee e:al)
		{
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary());
		}
		
		Collections.sort(al);
		System.out.println("Before Sorting Records");
		for(Employee e:al)
		{
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary());
		}
		
	}
}