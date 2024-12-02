// Question 6
import java.util.*;
class Employee
{
	int eid,esal;
	String ename;
	String eaddress;
	String email;
		
	void setValue(int eid,int esal,String ename,String email,String eaddress)
	{
		this.eid=eid;
		this.esal=esal;
		this.ename=ename;
		this.email=email;
		this.eaddress=eaddress;
	}
	void display()
	{
		System.out.printf("%d\t%d\t%s\t%s\t%s",eid,esal,ename,email,eaddress);
	}

		
}
public class Question6
{
	public static void main(String x[])
	{
		int eid,esal;
		String ename;
		String eaddress;
		String email;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the Employee Information");
		eid = s.nextInt();
		esal = s.nextInt();
		ename = s.nextLine();
		email = s.nextLine();
		eaddress = s.nextLine();
		
		Employee em = new Employee();
		em.setValue(eid,esal,ename,email,eaddress);
		em.display();
	}
}