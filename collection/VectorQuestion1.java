// 

import java.util.*;
class Student
{
	int id;
	String name;
	int per;
	
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
	public void setPer(int per)
	{
		this.per=per;
	}
	public int getPer()
	{
		return per;
	}
}
public class VectorQuestion1
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		Vector <Student> v=new Vector<> ();
		System.out.println("Enter the size");
		int size=s.nextInt();
		Student stu[];
		stu=new Student[size];
		
	
		for(int i=0;i<stu.length;i++)
		{
			System.out.println("Enter the Id of Student");
			int id=s.nextInt();
			System.out.println("Enter the name of Student");
			s.nextLine();
			String name=s.nextLine();
			System.out.println("Enter the Per of Student");
			int per=s.nextInt();
			
			stu[i]=new Student();
			stu[i].setId(id);
			stu[i].setName(name);
			stu[i].setPer(per);
			v.add(stu[i]);
		}
		

		for(int i=0;i<v.size();i++)
		{
			for(int j=i+1;j<v.size();j++)
			{
				Student pre=v.get(i);
				Student next=v.get(j);

				if(pre.getId()>next.getId())
				{
					v.set(i,next);
					v.set(j,pre);
				}
			}
		}
		for(Student obj:v)
		{
			System.out.print(obj.getId()+"\t"+obj.getName()+"\t"+obj.getPer()+"\n");
		}
	}
}