// Avarage of all elements in Array
import java.util.*;
public class Avarage
{
	public static void main(String x[])
	{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the Limit of array");
			int size=s.nextInt();
			
			int a[]=new int[size];
			
			System.out.println("Enter the Values");
			for(int i=0;i<a.length;i++)
			{
				a[i]=s.nextInt();
			}
			int sum=0;
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				++count;
				sum=sum+a[i];
			}
			int avg=sum/count;
			System.out.println("Sum\t"+avg);
	}
}
