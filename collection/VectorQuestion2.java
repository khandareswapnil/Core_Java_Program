// Question 2

import java.util.*;
class Student
{
	int id;
	String name;
	int standard;
	float per;
	
	Student(int id,String name,int standard,float per)
	{
		this.id=id;
		this.name=name;
		this.standard=standard;
		this.per=per;
	}
}
public class VectorQuestion2
{
	public static void main(String x[])
	{
		Vector<Student>v=new Vector<Student>();
		Student s=new Student(1,"kkk",2,75);
		v.add(s);
		
			for(Student obj:v)
			System.out.println(obj.id);
		
		
	}
}