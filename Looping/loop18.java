		import java.util.*;
		public class loop18
		{

		   public static void main(String args[])
			{
				Scanner sc=new Scanner(System.in);
			
				int no,count=0,temp,size=0;
				
				System.out.println("Enter number to find frequency of each digit in number");
			no=sc.nextInt();
				size=0;
				temp=no;
				while(no!=0)
				{
					size++;
					no=no/10;
	

				}
				
			no=temp;
			int a[];
				a=new int[size];
			int i=0,temp2=0,j=0;
					i=0;
				while(no!=0)
				{
					temp2=no%10;
					a[i]=temp2;
					i++;
					no=no/10;
						
				}
					
				for(i=0;i<(size);i++)
				{		count=1;
				  	for(j=i+1;j<size;j++)
					{
						if(a[i]==a[j]&&a[j]!='#')
						{	count++;
							a[j]='#';
							
						}
						
					}
					if(a[i]!='#')
					System.out.println("Frequency of "+a[i] +"is"+count);
				}
		
				
			
			
			}
		}