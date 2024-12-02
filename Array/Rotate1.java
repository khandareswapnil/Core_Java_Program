// Rotate Array
import java.util.*;
public class Rotate1
{
	public static void main(String x[])
	{
		int a[],size;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		size = s.nextInt();
		a = new int[size];

		System.out.println("Enter the Values of Array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}

		System.out.println("Display the Array\n");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
			int ind;
			System.out.println("Enter the Index Where Rotate");
			ind = s.nextInt();
		
		for(int i=0;i<ind;i++)
		{
			int j,last;
			last=a[size-1];
		
		for(j=size-1;j>0;j--)
		{
			a[j]=a[j-1];	
		}
			a[0]=last;
		}

		System.out.printf("\nAfter the Rotation\n");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		
	}
}



























