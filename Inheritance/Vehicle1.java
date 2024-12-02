// Question 1

import java.util.*;
class Vehicle1
{
	String brand;
	int year;
	void setValue(String brand, int year)
	{
		this.brand=brand;
		this.year=year;
	}
	
	void displayInfo()
	{
		System.out.println("Brand\t"+brand);
		System.out.println("Year\t"+year);
	}
}

class Car extends Vehicle1
{
	String model;
	void setCarValue(String model)
	{
		this.model=model;
	}
	void displayInfo()
	{
		System.out.println("Vehical Info");
		super.displayInfo();
		System.out.println("Model\t"+model);
	}
}

public class VehicleApp1
{
	public static void main(String x[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Brand And Year of Vehicle");
		String brand=s.nextLine();
		int year=s.nextInt();
		
		System.out.println("Enter the Model");
		s.nextLine();
		String model=s.nextLine();
		
		Car c=new Car();
		c.setValue(brand,year);
		c.setCarValue(model);
		c.displayInfo();
	}
}