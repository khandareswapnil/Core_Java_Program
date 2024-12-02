// Question 7

public class Question7
{
	public static void main(String x[])
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=11;j++)
			{
				if(j<=12-i && j>=i)
				{
					if((i%2==0 || j%2==1) && (i%2==1 || j%2==0))
					{
						System.out.printf("*");
					}
					else
					{
						System.out.printf(" ");
					}
				}
				else{
					System.out.printf(" ");
				}
			}
			System.out.printf("\n");
		}
	}
}

