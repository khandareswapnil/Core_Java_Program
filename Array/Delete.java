// delete the element

import java.util.*;
public class Delete
{
	public static void  main(String x[])
	{
		int a[],size,index,k;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the size of array");
		size =s.nextInt();
		a = new int[size];
		
		int len = a.length;
		System.out.printf("%d",len);
		System.out.println("Enter the values of array");
		for(int i=0;i<len;i++)
		{	
			a[i] = s.nextInt();	
		}
		
		System.out.println("The Array Values is");
		for(int i=0;i<len;i++)
		{
			System.out.printf("%d\t",a[i]);
		}

		System.out.println("\nEnter the Index Number");
		index = s.nextInt();
		int count=0;
		for(int i=0;i<len;i++)
		{
			if(i==index)
			{
				count++;
				for(k=i;k<len-1;k++)
				{
					a[k]=a[k+1];
				}
					
			}
		}
		
		System.out.println("After deleting thr Array Values is");
		for(int i=0;i<len-count;i++)
		{
			System.out.printf("%d",a[i]);;
		}
	}

}