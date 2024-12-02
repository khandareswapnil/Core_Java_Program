

import java.util.*;
class Library
{
	int id;
	String title;
	int price;
	String author;
	public void setAccNumber(int id)
	{
		this.id=id;
	}
	public void setId(int id)
	{
		this.id=id;
	}

	public int getId()
	{
		return id;
	}
	public void setTitle(String title)
	{
		this.title=title;
	}
	public String getTitle()
	{
		return title;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
	
	
	public void setAuthor(String author)
	{
		this.author=author;
	}
	public String getAuthor()
	{
		return author;
	}
}

class Menu
{		
		Scanner s = new Scanner(System.in);
		void show(Library lib[])
		{
			System.out.println("ID\tTitle\tPrice\tAuthor");
			for(int i=0;i<3;i++)
			{
				System.out.printf("%d\t%s\t%d\t%s \n",lib[i].getId(),lib[i].getTitle(),lib[i].getPrice(),lib[i].getAuthor());
			}
		}
		void displayAuthor(String author_name,Library lib[])
		{
			for(int i=0;i<3;i++)
			{
				if((author_name.compareTo(lib[i].getAuthor()))==0)
				{
					System.out.printf("%d\t%s\t%d\t%s \n",lib[i].getId(),lib[i].getTitle(),lib[i].getPrice(),lib[i].getAuthor());
				}
			}
		}
		void dispalyByTitle(String title_name,Library lib[])
		{
			
			for(int i=0;i<3;i++)
			{
				if(title_name.compareTo(lib[i].getTitle())==0)
				{
					System.out.printf("%d\t%s\t%d\t%s \n",lib[i].getId(),lib[i].getTitle(),lib[i].getPrice(),lib[i].getAuthor());
				}
			}
		}
		void countBook(Library lib[])
		{
			int count=0;
			for(int i=0;i<3;i++)
			{
				count++;
			}
			System.out.println(count);
		}
		void acendingOrder(Library lib[])
		{
			for(int i=0;i<3;i++)
			{
				for(int j=i+1;j<3;j++)
				{
					int pid=lib[i].getId();
					int nid=lib[j].getId();
					if(pid>nid)
					{
						Library temp=lib[i];
						lib[i]=lib[j];
						lib[j]=temp;
					}
				}
			}
	
		for(int i=0;i<3;i++)
			{
				System.out.printf("%d\t%s\t%d\t%s \n",lib[i].getId(),lib[i].getTitle(),lib[i].getPrice(),lib[i].getAuthor());
			}
		}

	void updateBook(int sid,Library lib[])
	{
		int flag=0;
		for(int i=0;i<3;i++)
		{
			if(sid==lib[i].getId());
			{
				
					System.out.println("Enter the New Price");
					int nprice = s.nextInt();
					lib[i].setPrice(nprice);
					flag=1;
					break;
			}	
		}
		if(flag==1)
			{
				System.out.println("Update Sucessfully");
			}
			else
			{
				System.out.println("Please Enter the Proper Id THis Id is Not Match id Data");
			}
	}

	void deleteBook(int sid,Library lib[])
	{
		for(int i=0;i<3;i++)
		{
			if(sid==lib[i].getId())
			{
				for(int k=i;k<3;k++)
				{
					lib[k]=lib[k+1];
					--3;
				}
			}
		}
	}
}
public class LibraryApp
{
	public static void main(String x[])
	{	
		int choice=0;
		int id;
		String title;
		int price;
		String author;
		Scanner s = new Scanner(System.in);
		Library lib[] = new Library[3];
		Menu m = new Menu();
		
		do
		{
			System.out.println("1 for Add Book Details");
			System.out.println("2 forDisplay All Books");
			System.out.println("3 for Display List of Book of given Author");
			System.out.println("4 for Display list the book title of Specified Book");
			System.out.println("5 for Display list count of book in the Library");
			System.out.println("6 for Display list the books in the ascending order of accession number");
			System.out.println("7 for Update book details by title of book");
			System.out.println("8 for Delete book details by price");
			System.out.println("0 for the Exit");
			System.out.println("Enter the Choice");
			choice = s.nextInt();
			switch(choice)
			{
				case 1:
					for(int i=0;i<3;i++)
				{
					System.out.println("Enter the Id Of Book");
					id=s.nextInt();
					s.nextLine();
					System.out.println("Enter the Title Of Book");
					title=s.nextLine();
					System.out.println("Enter the Price Of Book");
					price=s.nextInt();
					s.nextLine();
					System.out.println("Enter the Author Of Book");
					author=s.nextLine();

					
					lib[i] = new Library();
					lib[i].setId(id);
					lib[i].setTitle(title);
					lib[i].setPrice(price);
					lib[i].setAuthor(author);				
				}
					break;
				case 2:
					m.show(lib);
					break;
				case 3:
					s.nextLine();
					String author_name;
					System.out.println("Enter the Author Name");
					author_name = s.nextLine();
					m.displayAuthor(author_name,lib);
					break;
				case 4:
					s.nextLine();
					String title_name;
					System.out.println("Enter the Title of Book");
					title_name = s.nextLine();
					m.dispalyByTitle(title_name,lib);
					break;
				case 5:
					m.countBook(lib);
					break;
				case 6:
					m.acendingOrder(lib);
					break;
				case 7:
					System.out.println("Enter the Search Id");
					int sid = s.nextInt();
					m.updateBook(sid,lib);
					break;
				case 8:
					System.out.println("Enter the Search Id");
					int sid = s.nextInt();
					m.updateBook(sid,lib);
					break;	
			}
		
		}while(choice!=0);
	}
}