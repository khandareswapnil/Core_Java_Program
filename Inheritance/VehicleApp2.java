// Question 6 Abstract

import java.util.*;
abstract class Vehicle
{
	abstract void startEngine();
	abstract void stopEngine();
	
}

class Car extends Vehicle
{
	void startEngine()
	{
		System.out.println("Car:Start Engine");
	}
	void stopEngine()
	{
		System.out.println("Car:Stop Engine");
	}
}
class MotorCycle extends Vehicle
{
	void startEngine()
	{
		System.out.println("MotorCycle:Start Engine");
	}
	void stopEngine()
	{
		System.out.println("MotorCycle:Stop Engine");
	}
}
public class VehicleApp2
{
	public static void main(String x[])
	{
		Car c=new Car();
		c.startEngine();
		c.stopEngine();
		
		MotorCycle m=new MotorCycle();
		m.startEngine();
		m.stopEngine();
	}
}