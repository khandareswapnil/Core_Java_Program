import java.util.*;
class FindEvenNo
{
	int a[];
	void setArray(int a[])
	{
		this.a=a;
	}	
	void maxArray()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("The Minimum Even Number in this Array is \t");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==1)
			{
				System.out.printf("%d",a[i]);
				break;
			}
		}
		
	}
	void minArray()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("\nThe Maximum Even Number in this Array is \t");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==1)
			{
				System.out.printf("%d",a[i]);
				break;
			}
		}
	}
}
public class Aquestion8
{
	public static void main(String x[])
	{
		int size;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Array Size");
		size = s.nextInt();

		int a[] = new int[size];
		int b[] = new int[size];
		System.out.println("Enter the Value Of Array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}

		 FindEvenNo fi = new  FindEvenNo();
		fi.setArray(a);
		fi.minArray();
		fi.maxArray();
	}
}