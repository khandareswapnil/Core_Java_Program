// 

import java.util.*;
public class VectorQuestion2_2
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		Vector  v=new Vector();
		for(int i=0;i<6;i++)
		{
			System.out.println("Enter the Values");
			int values=s.nextInt();
			v.add(values);
		}
		
		for(int i=0;i<v.size();i++)
		{
			for(int j=i+1;j<v.size();j++)
			{
				Object pre=v.get(i);
				Object next=v.get(j);
				if((int)pre>(int)next)
				{
					v.set(i,next);
					v.set(j,pre);
				}
			}
		}
		
		for(Object obj:v)
		{
			System.out.println(obj+"\t");
		}
		
		int count=0;
		int flag=0;
		for(int i=0;i<v.size()-1;i++)
		{
			Object pre=v.get(i);
			Object next=v.get(i+1);
			if((int)pre==(int)next)
			{
				
				count++;
				flag=1;
			}
			else if(count>1)
			{
				System.out.println((int)pre);
				count=0;
			}		
		}
		if(flag==0)
		{
			System.out.println("No duplicate Data found");
		}
	}
}