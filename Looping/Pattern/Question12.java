// Question 12

public class Question12
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			int k=i;
			for(int j=1;j<=9;j++)
			{
				
				if(j<=4+i && j>=6-i)
				{
					System.out.printf("*");
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
