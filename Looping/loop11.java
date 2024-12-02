		import java.util.*;
	
		public class loop11
		{
		
		public static void main(String args[])
			
			{
				Scanner sc=new Scanner(System.in);
				int no,i,ldigi,fdigi=0;
				
				System.out.println("Enter digit to get first and last digit of that number");
			
				no=sc.nextInt();
				ldigi=no%10;
			
				while(no!=0)
				{

					if(no<10)
					{
						fdigi=no;
					}
					no=no/10;
				

				}
			System.out.println("first digit of number is "+fdigi);
			System.out.println("Last digit of number is "+ldigi);
			
			}


		}