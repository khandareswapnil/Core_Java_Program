// Vector Question 4
import java.util.*;

class Employee
{
	int id;
	String name;
	int salary;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
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
	
	
	
}

public class ArrayListQuestion1
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		ArrayList <Employee> al=new ArrayList<>();
		Employee e[];
		e=new Employee[5];
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the Id of Employee");
			int id=s.nextInt();
			System.out.println("Enter the Nameof Employee");
			s.nextLine();
			String name=s.nextLine();
			System.out.println("Enter the Salary of Employee");
			int salary=s.nextInt();
			e[i]=new Employee();
			e[i].setId(id);
			e[i].setName(name);
			e[i].setSalary(salary);
			al.add(e[i]);
		}
		
		for(Employee el:al)
		{
			String obj=el.getName();
			if(obj.startsWith("r") && obj.endsWith("sh"))
			{
				System.out.printf("%d\t%s\t%d\n",el.getId(),el.getName(),el.getSalary());
			}
		}
		
		
	}
}