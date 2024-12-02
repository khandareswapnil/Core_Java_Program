// Question 4

import java.util.*;
interface Logger
{
	void log(String message);
	void error(String message);
}
class FileLogger implements Logger
{
	public void log(String message)
	{
		System.out.println("Hi Am "+message);
	}
	public void error(String message)
	{
		
	}
}
public class FileLoggerApp
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Message");
		String message=s.nextLine();
		FileLogger f=new FileLogger();
		f.log(message);
		
	}
}