// Library Management System

import java.util.*;

class LibraryItem
{
	String title;
	String author;
	int publicationYear;
	
	void setValue(String title,String author,int publicationYear)
	{
		this.title=title;
		this.author=author;
		this.publicationYear=publicationYear;
	}
	
	void displayInfo()
	{
		System.out.println("Title\t"+title);
		System.out.println("Author\t"+author);
		System.out.println("Publication Year\t"+publicationYear);
	}
}

class Magazine extends LibraryItem
{
	int issueNumber;
	void setIssuno(int issueNumber)
	{
		this.issueNumber=issueNumber;
	}
	
	void displayInfo()
	{
		System.out.println("Magazine");
		super.displayInfo();
		System.out.println("Issue Numebr\t"+issueNumber);
	}
}

class Book extends LibraryItem
{
	String isbn;
	void setIsbn(String isbn)
	{
		this.isbn=isbn;
	}
	void displayInfo()
	{
		System.out.println("Book Info");
		super.displayInfo();
		System.out.println("ISBN Number"+isbn);
	}
}

public class LibraryManagementSystem
{
	public static void main(String x[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Title of Magazine");
		String book=s.nextLine();
		System.out.println("Enter the Author Name");
		String author=s.nextLine();
		System.out.println("Enter the Publication Year");
		int publicationYear=s.nextInt();
		s.nextLine();
		System.out.println("Enter the Issue Number");
		int issueNumber=s.nextInt();
		
		
		s.nextLine();
		System.out.println("Enter the Title of Book");
		String bbook=s.nextLine();
		System.out.println("Enter the Author Name");
		String bauthor=s.nextLine();
		System.out.println("Enter the Publication Year");
		int bpublicationYear=s.nextInt();
		s.nextLine();
		System.out.println("Enter the ISBN Number");
		String isbn=s.nextLine();
		
		Magazine m=new Magazine();
		m.setValue(book,author,publicationYear);
		m.setIssuno(issueNumber);
		m.displayInfo();
		
		Book b=new Book();
		b.setValue(bbook,bauthor,bpublicationYear);
		b.setIsbn(isbn);
		b.displayInfo();
		
	}
}