// billing application

import java.util.*;
class Product
{
	private int id;
	private String name;
	private int quantity;
	private int price;

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
	public void setQuantity(int quantity)	
	{
		this.quantity=quantity;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
}

class Customer
{
	private int id;
	private String name;
	private long contact;

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
} 

class GenerateBill
{
	void show(int size, Customer c, Product p[])
	{
		int total=0;
		System.out.printf("%d\t%s\t%d\n",c.getId(),c.getName(),c.getContact());
		System.out.println("Product Name\tQuantity\tPrice\tTotal");
		for(int i=0;i<size;i++)
		{
			System.out.printf("%d\t%s\t%d\t\t%d\t%d\n",p[i].getId(),p[i].getName(),p[i].getQuantity(),p[i].getPrice(),p[i].getQuantity()*p[i].getPrice());
			total=total+p[i].getQuantity()*p[i].getPrice();
		}
		System.out.printf("\t\t\t\tTotal : %d",total);
	}
}
public class BillingApp1
{
	public static void main(String x[])
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the Customer ID");
		int id = s.nextInt();
		s.nextLine();
		System.out.println("Enter teh Customer Name");
		String name = s.nextLine();
		System.out.println("Enter the Customer Contact");
		long contact = s.nextLong();
		
		Customer c = new  Customer();
		c.setId(id);
		c.setName(name);
		c.setContact(contact);
		
		System.out.println("Enter the total number of Product");
		int size = s.nextInt();
		Product p[] = new Product[size];

		for(int i=0;i<size;i++)
		{
			System.out.printf("Enter the Id of %d Product\n",i+1);
			int pid=s.nextInt();
			 s.nextLine();
			System.out.printf("Enter the Name of %d Product\n",i+1);
			String pname = s.nextLine();
			System.out.printf("Enter the Quantity of %d Product\n",i+1);
			int quantity = s.nextInt();
			System.out.printf("Enter the Price of %d Product\n",i+1);
			int price = s.nextInt();
	
			p[i] = new Product();
			p[i].setId(pid);
			p[i].setName(pname);
			p[i].setQuantity(quantity);
			p[i].setPrice(price);
		}

		
		GenerateBill g = new GenerateBill();
		
		g.show(size,c,p);
		

	}
}