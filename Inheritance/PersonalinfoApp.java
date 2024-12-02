// Assignment 4

import java.util.*;
class Personalinfo
{
	protected String name;
	protected String middlename;
	protected String lastname;
	Personalinfo(String name,String middlename,String lastname)
	{
		this.name=name;
		this.middlename=middlename;
		this.lastname=lastname;
	}
}

class ProfessionalInfo extends Personalinfo
{
	int id;
	int salary;
	String skillset;
	ProfessionalInfo(int id,int salary,String skillset,String name,String middlename,String lastname)
	{
		super(name,middlename,lastname);
		this.id=id;
		this.salary=salary;
		this.skillset=skillset;
	}
	
	void show()
	{
		System.out.printf("%s\t%s\t%s",name,middlename,lastname);
		System.out.printf("%d\t%d\t%s",id,salary,skillset);
	}
}

public class PersonalinfoApp
{
	public static void main(String x[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Personal Information of Employee");
		System.out.println("Enter the First Name");
		String name=s.nextLine();
		System.out.println("Enter the Middle Name");
		String middlename=s.nextLine();
		System.out.println("Enter the Last Name");
		String lastname=s.nextLine();
		
		System.out.println("Enter the ProfessionalInfo of Employee");
		System.out.println("Enter the Id of Employee");
		int id=s.nextInt();
		System.out.println("Enter the Salary of Employee");
		int salary=s.nextInt();
		s.nextLine();
		System.out.println("Enter the SkillSet Of Employee");
		String skillset=s.nextLine();
		
		ProfessionalInfo p= new ProfessionalInfo(id,salary,skillset,name,middlename,lastname);
		p.show();
	}
}