// deserializalbe
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

public class c
{
	public static void main(String x[]) throws Exception
	{
		FileInputStream fin=new FileInputStream("D:\\java\\PROGRAM\\File Handling\\demo3\\second.txt");
	ObjectInputStream oin=new ObjectInputStream(fin);
	
	Object obj=oin.readObject();
	
	
	if(obj!=null)
	{
		Player p=(Player)obj;
	System.out.println(p.getID()+"\t"+p.getName()+"\t"+p.getRun());
	}
	else
	{
		System.out.println("No Date Found");
	}
	oin.close();
	fin.close();
	}
}

