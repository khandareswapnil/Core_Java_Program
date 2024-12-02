// inheritance Shape Area

import java.util.*;
class Vehicle
{
	String make;
	String model;
	int year;
	
	void setValues(String make, String model, int year)
	{
		this.make=make;
		this.model=model;
		this.year=year;
	}
	
	void displayDetails()
	{
		System.out.println("Make\t"+make);
		System.out.println("Model\t"+model);
		System.out.println("Year\t"+year);
	}
}

class Car extends Vehicle
{
	int numberOfDoors;
	void setCarValues(int numberOfDoors)
	{
		this.numberOfDoors=numberOfDoors;
	}
	
	void displayDetails()
	{
		/*System.out.println("Make\t"+make);
		System.out.println("Model\t"+model);
		System.out.println("Year\t"+year);*/
		super.displayDetails();
		System.out.println("Number Of Doors\t"+numberOfDoors);
	}
	
}
class Truck extends Vehicle
{
	double loadCapacity;
	void setTruckValue(double loadCapacity)
	{
		this.loadCapacity=loadCapacity;
	}
	
	void displayDetails()
	{
		/*System.out.println("Make\t"+make);
		System.out.println("Model\t"+model);
		System.out.println("Year\t"+year);*/
		super.displayDetails();
		System.out.println("Load Of Capacity\t"+loadCapacity);
	}
}

public class VehicleManagementSystem
{
	public static void main(String x[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Make of Car");
		String make=s.nextLine();
		System.out.println("Enter the Model of Car");
		String model=s.nextLine();
		System.out.println("Enter the Year of Model");
		int year = s.nextInt();
		System.out.println("Enter the Number of Doors");
		int numberOfDoors=s.nextInt();
		
		
		
		System.out.println("Enter the Make of Truck");
		s.nextLine();
		String tmake=s.nextLine();
		System.out.println("Enter the Model of Truck");
		String tmodel=s.nextLine();
		System.out.println("Enter the Year of Truck");
		int tyear = s.nextInt();
		System.out.println("Enter the Load Capacity of Truck");
		int loadCapacity=s.nextInt();
		
		Car c=new Car();
		c.setValues(make,model,year);
		c.setCarValues(numberOfDoors);
		c.displayDetails();
		
		Truck t=new Truck();
		t.setValues(tmake,tmodel,tyear);
		t.setTruckValue(loadCapacity);
		t.displayDetails();
		
	}
}