// 

import java.util.*;
interface EMI
{
	void calEMI();
}
class HouseLoan implements EMI
{
	double rate;
	double noMon;
	double amount;
	double EMI;
	HouseLoan(double rate,double noMon,double amount)
	{
		this.rate=rate;
		this.noMon=noMon;
		this.amount=amount;
	}
	
	public void calEMI()
	{
		EMI=(amount*rate*Math.pow(1+rate,noMon))/(Math.pow(1+rate,noMon)-1);
		System.out.println("The HouseLoan EMI "+EMI);
	}
}

class VehicleLoan implements EMI
{
	double rate;
	double noMon;
	double amount;
	double EMI;
	VehicleLoan(double rate,double noMon,double amount)
	{
		this.rate=rate;
		this.noMon=noMon;
		this.amount=amount;	
	}
	
	public void calEMI()
	{
		EMI=(amount*rate*Math.pow(1+rate,noMon))/(Math.pow(1+rate,noMon)-1);
		System.out.println("The VehicleLoan EMI "+EMI);
	}
}

class GoldLoan
{
	double rate;
	double noMon;
	double amount;
	double EMI;
	GoldLoan(double rate,double noMon,double amount)
	{
		this.rate=rate;
		this.noMon=noMon;
		this.amount=amount;
	}
	
	public void calEMI()
	{
		EMI=(amount*rate*Math.pow(1+rate,noMon))/(Math.pow(1+rate,noMon)-1);
		System.out.println("The GoldLoan EMI "+EMI);
	}
	
}

public class EMIAPP
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the rate of interest");
		double rate=s.nextDouble();
		System.out.println("Enter the NoMon ");
		double noMon=s.nextDouble();
		System.out.println("Enter the Amount");
		double amount=s.nextDouble();
		
		rate = rate/(12*100);	
		noMon = noMon*12;
		
		HouseLoan h=new HouseLoan(rate,noMon,amount);
		h.calEMI();
		VehicleLoan v=new VehicleLoan(rate,noMon,amount);
		v.calEMI();
		GoldLoan g=new GoldLoan(rate,noMon,amount);
		g.calEMI();
		
	}
}