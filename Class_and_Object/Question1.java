// Calss And Object

import java.util.*;
class Arithmetic
{
	int n1,n2,add,sub,mul,mod,div;
	void setValue(int n1, int n2)
	{
		this.n1=n1;
		this.n2=n2;
	}
	void perform()
	{
		add=n1+n2;
		sub=n1-n2;
		mul=n1*n2;
		mod=n1%n2;
		div=n1/n2;		
	}
	
	void showValue()
	{
		System.out.printf("Sum = %d\n",add);	
		System.out.printf("Sub = %d\n",sub);	
		System.out.printf("Mul = %d\n",mul);	
		System.out.printf("Mod = %d\n",mod);	
		System.out.printf("Div = %d\n",div);	
	}
}
public class Question1
{
	public static void main(String x[])
	{
		int n1,n2;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the N1 and N2");
		n1=s.nextInt();
		n2=s.nextInt();
		Arithmetic op =new Arithmetic();
		op.setValue(n1,n2);
		op.perform();
		op.showValue();
	}
}