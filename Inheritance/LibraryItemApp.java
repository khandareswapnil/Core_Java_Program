// Library Item

import java.util.*;
abstract class LibraryItem
{
	int id;
	String title;
	int year;
	
	void setValue(int id,String title,int year)
	{
		this.id=id;
		this.title=title;
		this.year=year;
	}
	
	abstract void displayInfo();
	
}

class Book extends LibraryItem
{
	String author;
	int numPages;
	void setBookValue(String author,int numPages)
	{
		this.author=author;
		this.numPages=numPages;
	}
	void displayInfo()
	{
		System.out.println("ID\t"+id);
		System.out.println("Title\t"+title);
		System.out.println("Year\t"+year);
		System.out.println("Author+t"+author);
		System.out.println("NumOfPages\t"+numPages);
	}
}

class Magazine extends LibraryItem
{
	int issun;
	int pmonth;
	void setMagazineValue(int issun,int pmonth)
	{
		this.issun=issun;
		this.pmonth=pmonth;
	}
	void displayInfo()
	{
		System.out.println("ID\t"+id);
		System.out.println("Title\t"+title);
		System.out.println("Year\t"+year);
		System.out.println("ISSU Number"+issun);
		System.out.println("Published Month\t"+pmonth);
	}
}
class LibraryItemApp
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the id of Book");
		int id=s.nextInt();
		System.out.println("Enter Title of Book");
		s.nextLine();
		String title=s.nextLine();
		System.out.println("Enter the Year");
		int year=s.nextInt();
		System.out.println("Enter the Author Name");
		s.nextLine();
		String author=s.nextLine();
		System.out.println("Enter the Number of pages");
		int numPages=s.nextInt();
		
		Book b=new Book();
		b.setValue(id,title,year);
		b.setBookValue(author,numPages);
		b.displayInfo();
		
		System.out.println("Enter the id of Book");
		int mid=s.nextInt();
		System.out.println("Enter Title of Book");
		s.nextLine();
		String mtitle=s.nextLine();
		System.out.println("Enter the Year");
		int myear=s.nextInt();
		System.out.println("Enter the ISSU Number");
		int issun=s.nextInt();
		System.out.println("Enter the Month ");
		int pmonth=s.nextInt();;
		
		Magazine m=new Magazine();
		m.setValue(mid,mtitle,myear);
		m.setMagazineValue(issun,pmonth);
		m.displayInfo();
	}
}