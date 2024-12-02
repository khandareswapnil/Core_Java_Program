// Question 2
import java.util.*;

class Emp
{
	int id;
	String name;
	int sal;
	public Emp(){
	}
	
	public Emp(int id,String name,int sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	
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
	public void setSal(int sal)
	{
		this.sal=sal;
	}
	
	public int getSal()
	{
		return sal;
	}
}

public class ArrayList2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList al=new ArrayList();
		
		do
		{
			System.out.println("1. Add Elements");
			System.out.println("2. Display Element");
			System.out.println("3. Delete Elements");
			System.out.println("4. Insert Data At sepcific Index");
			System.out.println("5. Insert Element at First");
			System.out.println("6. update Element at Specific index");
			System.out.println("7. Exit");
			System.out.println("Enter the Choice");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				
						System.out.println("Enter the Id of Mmployee");
						int id=sc.nextInt();
						sc.nextLine();
						System.out.println("Entter the Name");
						String name=sc.nextLine();
						System.out.println("Enter the Salary of Employee");
						int sal=sc.nextInt();
						al.add(new Emp(id,name,sal));
					
				break;
				case 2:
					System.out.println("The Information Of Employee is");
					for(Object obj:al)
					{
						Emp e=(Emp)obj;
						System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
					}
				break;
				case 3:
				System.out.println("Enter the Id For Delete Emelmet");
				int did=sc.nextInt();
				boolean b=false;
					for(Object o:al)
					{
						Emp e=(Emp)o;
						int ID=e.getId();
						if(ID==did)
						{
							al.remove(e);
							b=true;
						}
					}
					if(b)
					{
						System.out.println("Data Deleted Sucessfully");
					}
					else
					{
						System.out.println("Please Correct the Correct ID");
					}
					
				break;
				case 4:
					System.out.println("Enter the Index Where To add Add");
					int index=sc.nextInt();
					System.out.println("Enter the Id of Mmployee");
						id=sc.nextInt();
						sc.nextLine();
						System.out.println("Entter the Name");
						name=sc.nextLine();
						System.out.println("Enter the Salary of Employee");
						sal=sc.nextInt();
						al.add(index,new Emp(id,name,sal));
						System.out.println("Data Added Sucessfully");
				
				break;
				case 5:
					LinkedList li=new LinkedList(al);
					System.out.println("Enter the Id of Mmployee");
						id=sc.nextInt();
						sc.nextLine();
						System.out.println("Entter the Name");
						name=sc.nextLine();
						System.out.println("Enter the Salary of Employee");
						sal=sc.nextInt();
						li.addFirst(new Emp(id,name,sal));
						al=new ArrayList(li);
				break;
				case 6:
				System.out.println("Enter the Id Where to update");
				index=sc.nextInt();
				sc.nextLine();
				b=false;
						for(Object o:al)
						{
							Emp e=(Emp)o;
							if(e.getId()==index)
							{
								System.out.println("Entter the Name");
								name=sc.nextLine();
								System.out.println("Enter the Salary of Employee");
								sal=sc.nextInt();
								e.setName(name);
								e.setSal(sal);
								b=true;
							}
						}
						if(b)
						{
							System.out.println("Data Update Sucessfully");
						}
						else{
							System.out.println("Id Not Found");
						}
				break;
				case 7:
				System.exit(0);
				break;
				default: 
				System.out.println("Wrong Choice");
			}
		}while(true);
		
		
	}
}
