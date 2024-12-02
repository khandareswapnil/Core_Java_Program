		import java.util.*;	
		
		public class loop13
		{
		public static void main(String args[])
			{
			 	int no,i,count=0,fno=0,lno=0;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter number to swap the first and last digit of number");	
			no=sc.nextInt();
			int temp=no;
			
			lno=no%10;
			count=0;
			while(no!=0)
			{
			  if(no<10)
			   {
				fno=no;
				}
			count++;
				no=no/10;
			
			}
			System.out.println(count);
			
			temp=temp-lno;
			temp=temp+fno;
			no=temp;
			for(i=1;i<count;i++)
			  {
				lno=lno*10;
				fno=fno*10;
		
			  }	
			temp=temp-fno;
			temp=temp+lno;
			 
			System.out.println("first and last number are swaped"+temp);	
			
			
			}
		}