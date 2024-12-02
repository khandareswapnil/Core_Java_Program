// Assignment 

import java.util.*;
class Hotel
{
	private int id;
	private String name;
	private String type;
	
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
	public void setType(String type)
	{
		this.type=type;
	}
	public String getType()
	{
		return type;
	}
}

class Customer
{
	private int cid;
	private String name;
	private String review;
	public void setCid(int cid)
	{
		this.cid=cid;
	}
	public int getCid()
	{
		return cid;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setReview(String review)
	{
		this.review=review;
	}
	public String getReview()
	{
		return review;
	}
}

public class HotelReview
{
	public static void main(String x[])
	{
		Scanner s =new Scanner(System.in);
		Hotel h[] = new Hotel[5];
		Customer c[] = new Customer[5];
		int p=0;
	
		do
		{
			System.out.println("1 . Add New Hotel And New Customer in Hotel");
			System.out.println("2.Add Review");
			System.out.println("3. View all Hotel with his customer details");
			System.out.println("4. Search hotel by its Name");
			System.out.println("5. Show Hotel wise review");
			
			System.out.println("Enter the Choice ");
			int choice = s.nextInt();

			switch(choice)
			{
				case 1:
					System.out.println("Enter the Hotel Data");
					for(int i=0;i<2;i++)
					{
						System.out.println("Enter the ID of Hotel");
						int hid=s.nextInt();
						s.nextLine();
						System.out.println("Enter the Name of Hotel");
						String name = s.nextLine();
						System.out.println("Enter the Type of Hotel");
						String type=s.nextLine();
				
						h[i]=new Hotel();
						h[i].setId(hid);
						h[i].setName(name);	
						h[i].setType(type);
					}
					for(int j=0;j<2;j++)
						{
							System.out.println("Enter the Customer Id");
							int id= s.nextInt();
							s.nextLine();
							System.out.println("Enter the Name of Customer");
							String cname=s.nextLine();
							c[j]= new Customer();
							c[j].setCid(id);
							c[j].setName(cname);
						}
					break;

				case 2:
					s.nextLine();
					System.out.println("Enter the Hotel Name");
					String name = s.nextLine();
					for(int i=0;i<2;i++)
					{
						if((h[i].getName()).equals(name))
						{
						System.out.println("Enter the Customer Id");
						int id=s.nextInt();
						for(int j=0;j<2;j++)
							{
								
								
								if(c[j].getCid()==id)
								{
									System.out.println("Enter the Review");
									s.nextLine();
									String review=s.nextLine();
									c[j].setReview(review);
									break;	
								}
								
							}
						}
					}
					break;
				case 3:
					for(int i=0;i<2;i++)
					{	System.out.println("Hotel Info");
						System.out.printf("%d\t%s\t%s\n",h[i].getId(),h[i].getName(),h[i].getType());
						//System.out.println("Customer Info");
						
						//System.out.println("\n");
					}
						for(int j=0;j<2;j++)
						{
							System.out.printf("%d\t%s\n",c[j].getCid(),c[j].getName());
						}
					break;
				case 4:
					s.nextLine();
					System.out.println("Enter the Hotel Name");
					String hname=s.nextLine();
					int flag=0;
					for(int i=0;i<2;i++)
					{
						if((h[i].getName()).equals(hname))
						{
							System.out.printf("%d\t%s\t%s\n",h[i].getId(),h[i].getName(),h[i].getType());
							flag=1;
							break;
						}
					}
					if(flag==0)
					{
						System.out.println("No Hotel of Such Name Found Please Enter the Correct Name");
					}
					break;
				case 5:
					System.out.println("Hotel Info");
					for(int i=0;i<2;i++)
					{
						System.out.printf("%d\t%s\t%s\t%s\n",h[i].getId(),h[i].getName(),h[i].getType(),c[i].getReview());
					}
					break;
				default:
					System.out.println("Wrong Choice");
			}
		System.out.println("Press 0 for EXIT And Press 1 for CONTINUE");
		p=s.nextInt();
		}while(p!=0);
	}
}