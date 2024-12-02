// Question 36
import java.util.*;
public class Question36
{
	public static void main(String x[])
	{
		int fib,f1=0,f2=1,no;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the limit of fibo");
		no = s.nextInt();
		
		System.out.printf("%d\t%d\t",f1,f2);
		for(int i=1;i<=no-2;i++)
		{
			fib=f1+f2;
			f1=f2;
			f2=fib;
			System.out.printf("%d\t",fib);
		}

	}
}