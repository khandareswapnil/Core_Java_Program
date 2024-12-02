
import java.util.*;
class Occurence
{
	int a[];
	void setArray(int a[])
	{
		this.a=a;
	}
	
	void getOccurence()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int count=1;
		int end=a.length;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==end)
			{
				System.out.printf("%d==========>%d",a[i],count);
			}
			else if(a[i]==a[i+1])
			{
				count++;	
			}
			else
			{
				System.out.printf("%d==========>%d\n",a[i],count);
				count=1;
			}
		}
	}
}
public class Aquestion10
{
	public static void main(String x[])
	{
		int size;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Array Size");
		size = s.nextInt();

		int a[] = new int[size];
		
		System.out.println("Enter the Value Of Array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}

		Occurence o = new Occurence(); 
		o.setArray(a);
		o.getOccurence();
	}
}