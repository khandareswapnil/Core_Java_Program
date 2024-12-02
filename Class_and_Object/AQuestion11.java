// Q2. WAP to create class name as ExtractDigitAndCalSum with two functions 
import java.util.*;
class ExtractDigitAndCalSum
{
	char ch[];
 	void setCharArray(char ch[])
	{
		this.ch=ch;
	}

	void getSum()
	{
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='0' && ch[i]<='9')
			{
				sum=sum+ch[i]-48;
			}
		}
		System.out.printf("%d",sum);
	}
}


public class AQuestion11
{
	public static void main(String x[])
	{
		int size;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of String");
		size = s.nextInt();

		s.nextLine();
		char ch[] = new char[size];
		System.out.println("Enter the String");
		for(int i=0;i<ch.length;i++)
		{
			ch[i] = s.nextLine().charAt(0);
		}
		ExtractDigitAndCalSum e = new ExtractDigitAndCalSum();
		e.setCharArray(ch);
		e.getSum();
	
	}
}