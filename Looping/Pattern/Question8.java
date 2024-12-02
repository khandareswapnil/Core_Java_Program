//Question 8

public class Question8
{
	public static void main(String x[])
	{
		for(int i=1;i<=6;i++)
		{
			
			for(int j=1;j<=11;j++)
			{
				int count=1;
				if(j>=7-i && j<=5+i)
				{
					if((i%2==0 || j%2==0)&&(i%2==1 || j%2==1))
					{
						System.out.printf("%d",count);
						
					}
					else{
						count++;
						System.out.printf(" ");
					}
				}
				else
				{
					System.out.printf(" ");
				}
			}
			System.out.printf("\n");
		}
		
	}
}