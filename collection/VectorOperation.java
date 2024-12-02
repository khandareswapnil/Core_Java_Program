// perform operation on vector

import java.util.*;
public class VectorOperation
{
	public static void main(String x[])
	{
		Vector v = new  Vector();
		Scanner s=new Scanner(System.in);
		do
		{
			System.out.println("1.Add New Data");
			System.out.println("2.View All Elements");
			System.out.println("3.Search Element using Contains");
			System.out.println("4.Search Element using Indes");
			System.out.println("5.Delete Element");
			System.out.println("6.Create Sub Vector Or SubList of Vector");
			System.out.println("7.See Thr Total number element present in vector");
			System.out.println("8.see the remains space in space in vector");
			System.out.println("9. Exits");
			
			System.out.println("Enter the Choice");
			int ch=s.nextInt();
			
			switch(ch)
			{
				case 1:
					System.out.println("Enter the Element");
					int value=s.nextInt();
					boolean b=v.add(value);
					if(b)
					{
						System.out.println("Element added Sucessfully");
					}
					else
					{
						System.out.println("Element not add Sucessfully");
					}	
				break;
				case 2:
				if(v.size()>0)
				{
					System.out.println(v);
				}
				else
				{
					System.out.println("The Vector Are Empty");
				}
				break;
				case 3:
				System.out.println("Enter the search Element");
				int skey=s.nextInt();
				b=v.contains(skey);
				if(b)
				{
					System.out.println("Element Found");
				}
				else
				{
					System.out.println("Element Not Found");
				}
				break;
				case 4:
				System.out.println("Enter the Index for searching");
				int ind=s.nextInt();
				int index=v.indexOf(ind);
				if(index!=1)
				{
					System.out.println("Element Found");
				}
				else
				{
					System.out.println("Element not Found");
				}
				break;
				case 5:
					System.out.println("Enter the element for search");
					skey=s.nextInt();
					 index=v.indexOf(skey);
					if(index!=-1)
					{
						v.remove(index);
					}
					else
					{
						System.out.println("Search key Not Found");
					}	
				break;
				case 6:
				System.out.println("Enter the Start and end Index");
				int startIndex=s.nextInt();
				int endIndex=s.nextInt();
				
				if(startIndex!=-1&&endIndex!=-1)
				{
					List subList=v.subList(startIndex,endIndex);
					System.out.println(subList);
				}
				break;
				case 7:
				System.out.println("Total Number of Element Present in Vector" +v.size());
				break;
				case 8: 
				System.out.println("Total Remain Space Present in vector" +(v.capacity()-v.size()));
				break;
				case 9:
				System.exit(0);
				break;
				default:
				System.out.println("Enter the Wrong Input");
			}
			
		}while(true);//Infinite loop
	}
}