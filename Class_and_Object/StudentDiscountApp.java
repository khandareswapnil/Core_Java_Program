//Question POJO CLASS 10

import java.util.*;
class Student
{
	private int id;
	private String name;
	private float per;
	private int totalfees;
	
	void setId(int id)
	{
		this.id=id;
	}
	int getId()
	{
		return id;
	}
	
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	void setPer(float per)
	{
		this.per=per;
	}
	float getPer()
	{
		return per;
	}
	void setTotalfees(int totalfees)
	{
		this.totalfees=totalfees;
	}
	int getTotalfees()
	{
		return totalfees;
	}
}

class DiscountFees
{
	Student s;
	double disfees;
	double actualpaidfees;
	void setStudent(Student s)
	{
		this.s=s;
	}
	void checkDiscount()
	{
		if(s.getPer()>=60)
		{
			disfees = s. getTotalfees()*0.3;
		}
		else
		{
			disfees=s.getTotalfees();
		}
		actualpaidfees = s.getTotalfees()-disfees;
	}
	
	void show()
	{
		System.out.println("Id Of Student");
		System.out.printf("%d\n",s.getId());
		System.out.println("Name Of Student");
		System.out.printf("%s\n",s.getName());
		System.out.println("Per Of Student");
		System.out.printf("%f\n",s.getPer());
		System.out.println("Total fees of Coures");
		System.out.printf("%d\n",s. getTotalfees());
		System.out.println("You Get the Discount of Total Fess");
		System.out.printf("%f\n",disfees);
		System.out.println("Your Actual Paid Amount is");
		System.out.printf("%f\n",actualpaidfees);
		
	}
}
public class StudentDiscountApp
{
	public static void main(String x[])
	{
		Scanner s = new Scanner(System.in);
		int id;
		String name;
		float per;
		int totalfees;
		
		System.out.println("Enter the Id");
		id=s.nextInt();
		s.nextLine();
		System.out.println("Enter the Name");
		name = s.nextLine();
		System.out.println("Enter the Per");
		per = s.nextFloat();
		System.out.println("Enter the  Totalfess");
		totalfees = s.nextInt();

		Student st = new Student();
		st.setId(id);
		st.setName(name);
		st.setPer(per);
		st.setTotalfees(totalfees);

		DiscountFees D = new DiscountFees();
		D.setStudent(st);
		D.checkDiscount();
		D.show();
	}
}