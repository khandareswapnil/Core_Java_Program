		import java.util.*;
		
		public class loop21
		{
			public static void main(String args[])
			{
				Scanner sc=new Scanner(System.in);
			
				System.out.println("Enter Number and power of that number");
				int no,i,p;
				no=sc.nextInt();
				i=sc.nextInt();
					p=no;
				for(int j=1;j<i;j++)
					{
					p=p*no;
					}
				System.out.println("power of "+no+" is"+p);
			
			}
		}