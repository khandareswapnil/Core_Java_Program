//Example: Write a program to Create Application for Generate Student Marksheet for 4 year 

import java.util.*;
class Student
{
	private int id;
	private String name;
	private long contact;
	private String email;
	private String address;

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
	public void setContact(long contact)
	{
		this.contact=contact;
	}
	public long getContact()
	{
		return contact;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public String getEmail()
	{
		return email;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getAddress()
	{
		return address;
	}
}

class Sem
{
	private int sub[];
	public void setSub(int sub[])
	{
		this.sub=sub;	
	}
	public int []getSub()
	{
		return sub;
	}
}


class Year
{
	private String year[];
	private Sem s[];
	public void setYear(String year[])
	{
		this.year=year;
	}
	public String []getYear()
	{
		return year;
	}
	public void setSem(Sem s[])
	{
		this.s=s;
	} 
	public Sem []getSem()
	{
		return s;
	}
}

class Result
{
	void show(Student std,Sem se[],Year y[])
	{
		System.out.printf("Id = %d\t",std.getId());
		System.out.printf("Name = %s\t",std.getName());
		System.out.printf("Contact = %d\t",std.getContact());
		System.out.printf("Email = %s\t",std.getEmail());
		System.out.printf("Address = %s\t",std.getAddress());

		for(int i=0;i<2;i++)
		{
			System.out.println(y[i].getYear());
			for(int j=0;i<2;i++)
			{
				
					System.out.println(se[j].getSub());
				
			}
		}
	}
}

public class GenerateMarksheetApp
{
	public static void main(String x[])
   {
	Scanner s =new Scanner(System.in);
	String year[]= new String[4];
	int sem;
	int  sub[] = new int[6];	
	Sem se[] = new Sem[2];
	Year y[] = new Year[4];

	Student std = new Student();
	Result r = new Result();
	
	System.out.println("Enter the Id Of Student");
	int id = s.nextInt();
	s.nextLine();
	System.out.println("Enter the Name of Student");
	String name = s.nextLine();
	System.out.println("Enter the Contact Number of Student");
	long contact=s.nextLong();
	s.nextLine();
	System.out.println("Enter the Email of Student");
	String email = s.nextLine();
	System.out.println("Enter the Address of Student");
	String address = s.nextLine();

	std.setId(id);
	std.setName(name);
	std.setContact(contact);
	std.setEmail(email);
	std.setAddress(address);

	for(int i=0;i<2;i++)
	{
		System.out.println("Enter the Year");
		year[i]=s.nextLine();
		for(int j=0;j<2;j++)
		{
			System.out.println("Enter the Sem");
			sem=s.nextInt();
			
				for(int k=0;k<6;k++)
				{
					System.out.printf("Enter the %d Marks",k+1);
					sub[k]=s.nextInt();
				}
				 se[j] = new Sem();
				se[j].setSub(sub);
				
		}
		s.nextLine();
		 y[i] = new Year();
		y[i].setYear(year);
		y[i].setSem(se);
	}
	
	r.show(std,se,y);
   }

	
}

	