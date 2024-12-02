// 

import java.util.*;
class Interest
{
	protected int p;
	protected int r;
	protected int t;
	void setPRD(int p,int r,int t)
	{
		this.p=p;
		this.r=r;
		this.t=t;
	}
}

class cla extends Interest
{
	void cal()
	{
		int SI=(p*r*t)/100;
		System.out.printf("%d",SI);
	}
}

public class SI
{
	public static void main(String x[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Principle_amo, Rate_int,Time");
		int per=s.nextInt();
		int rate=s.nextInt();
		int time=s.nextInt();
		
		cla c= new cla();
		c.setPRD(per,rate,time);
		c.cal();
		
	}
}