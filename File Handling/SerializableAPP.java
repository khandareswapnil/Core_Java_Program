// Serializable 

import java.io.*;
class Player implements Serializable
{
	private int id;
	private String name;
	private int run;
	
	public void setID(int id)
	{
		this.id=id;
	}
	public int getID()
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
	public void setRun(int run)
	{
		this.run=run;
	}
	public int getRun()
	{
		return run;
	}
}

public class SerializableApp 
{
	public static void main(String x[])throws Exception
	{
		FileOutputStream fi=new FileOutputStream("D:\\java\\PROGRAM\\File Handling\\demo3\\second.txt");
		ObjectOutputStream fo=new ObjectOutputStream(fi);
		Player p=new Player();
		p.setID(2);
		p.setName("XYZ");
		p.setRun(2000);
		
		fo.writeObject(p);
		fo.close();
		fi.close();
		System.out.println("Data Save Sucess.........");
		
	}
}