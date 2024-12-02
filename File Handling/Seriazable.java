// 

import java.io.*;
import java.io.FileOutputStream;
class A implements Serializable
{
	private int id;
	private String name;
	private int contact;
	
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
	
	public void setContact(int contact)
	{
		this.contact=contact;
	}
	public int getContact()
	{
		return contact;
	}
	
	
}

public class Seriazable
{ 
	public static void main(String x[]) throws Exception
	{
		FileOutputStream fin=new FileOutputStream("D:\\java\\PROGRAM\\File Handling\\demo\\third.docx");
		ObjectOutputStream out=new ObjectOutputStream(fin);
		A a=new A();
		a.setId(1);
		a.setName("ABC");
		a.setContact(78965);
		out.close();
		fin.close();
		System.out.println("Data Save Sucess......");
	}
}