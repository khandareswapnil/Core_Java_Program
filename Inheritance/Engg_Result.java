// Assignment 2

import java.util.*;
class Per
{
	protected int s[];
	float per;
	void claPer(int s[])
	{
		int sum=0;
		this.s=s;
		for(int i=0;i<5;i++)
		{
			sum=sum+s[i];
		}
		 per=sum/5;
	}
}

class CSE extends Per
{
	String name;
	int id;
	String address;
	String year;
	CSE(String name,int id,String address,String year)
	{
		this.name=name;
		this.id=id;
		this.address=address;
		this.year=year;
	}
	void showCsePer()
	{
		System.out.println("Name\tID\tAddress\tyear");
		System.out.printf("%s\t%d\t%s\t%s\n",name,id,address,year);
		System.out.printf("%f",per);
	}
}

class ETC extends Per
{
	String name;
	int id;
	String address;
	String year;
	ETC(String name,int id,String address,String year)
	{
		this.name=name;
		this.id=id;
		this.address=address;
		this.year=year;
	}
	
	void showETCPer()
	{
		System.out.println("Name\tID\tAddress\tyear");
		System.out.printf("%s\t%d\t%s\t%s\n",name,id,address,year);
		System.out.printf("%f",per);
	}
}
public class Engg_Result
{
	public static void main(String x[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the CSE Student Data of Name, id, address, year");
		String name=s.nextLine();
		int id=s.nextInt();
		s.nextLine();
		String address=s.nextLine();
		String year=s.nextLine();
		
		int cse[] = new int[5];
		System.out.println("Enter the marks of CSE student");
		for(int i=0;i<5;i++)
		{
			cse[i]=s.nextInt();
		}
		CSE c=new CSE(name,id,address,year);
		c.claPer(cse);
		c.showCsePer();
		
		System.out.println("\nEnter the ETC Student Data of Name, id, address, year\n");
		s.nextLine();
		String ename=s.nextLine();
		int eid=s.nextInt();
		s.nextLine();
		String eaddress=s.nextLine();
		String eyear=s.nextLine();
		
		int etc[] = new int[5];
		System.out.println("Enter the marks of CSE student");

		for(int i=0;i<5;i++)
		{
			etc[i]=s.nextInt();
		}
		
		ETC e=new ETC(ename,eid,eaddress,eyear);
		e.claPer(etc);
		e.showETCPer();
	}
}