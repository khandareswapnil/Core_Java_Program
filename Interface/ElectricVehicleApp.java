// Question 5

interface Vehicle
{
	void start();
	void stop();
}
interface ElectricVehicle extends Vehicle
{
	void charge();
}
class Tesla implements ElectricVehicle
{
	public void start()
	{
		System.out.println("Hi am Starting Point");
	}
	public void stop()
	{
		System.out.println("Hi am Stoping Point");
	}
	
	public void charge()
	{
		System.out.println("Hi Am Charging Method");
	}
}
public class ElectricVehicleApp
{
	public static void main(String x[])
	{
		Tesla t=new Tesla();
		t.start();
		t.stop();
		t.charge();
	}
}