// 11).WAP to create the class name as Product with a following properties 

import java.util.*;
class Product
{
	private int id;
	private String name;
	private int qut;
	private int rate;
	
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
	public void setQut(int qut)
	{
		this.qut=qut;
	}
	public int getQut()
	{	
		return qut;
	}
	public void setRate(int rate)
	{
		this.rate=rate;
	}
	public int getRate()
	{	
		return rate;
	}
}

class CalculateBill
{
	void calBill(Product p[])
	{
		int total=0;
		System.out.println("Id\tName\tQuentity\tRate\tTBill");
		for(int i=0;i<3;i++)
		{
			System.out.printf("%d\t",p[i].getId());
			System.out.printf("%s\t",p[i].getName());
			System.out.printf("%d\t\t",p[i].getQut());
			System.out.printf("%d\t",p[i].getRate());
			System.out.printf("%d",p[i].getRate()*p[i].getQut());
			total= total+p[i].getRate()*p[i].getQut();
			System.out.println("\n");
		}
		System.out.printf("\t\t\t\tTotal =%d",total);
	}
}

public class BillingApp
{
	public static void main(String x[])
	{

        	Product p[] = new Product[3];
		Scanner s = new Scanner(System.in);
		int id;
		String name;
		int qut;
		int rate;
           
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the Id");
			id=s.nextInt();
			s.nextLine();
			System.out.println("Enter the Name");
			name =s.nextLine();
			System.out.println("Enter the Quentity");
			qut=s.nextInt();
			System.out.println("Enter the Rate");
			rate=s.nextInt();

			p[i]=new Product();
			p[i].setId(id);
			p[i].setName(name);
			p[i].setQut(qut);	
			p[i].setRate(rate);
		}
		CalculateBill c = new CalculateBill();
		c.calBill(p);
	}
}