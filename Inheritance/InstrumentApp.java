// Question 8 Abstraction 

abstract class Instrument
{
	abstract void play();
	abstract void tune();
}

class Glockenspile extends Instrument
{
	void play()
	{
		System.out.println("Hi I am play Glockenspile");
	}
	void tune()
	{
		System.out.println("Hi I am tune Glockenspile");	
	}
}

class Violin extends Instrument
{
	void play()
	{
		System.out.println("Hi I am play Violin");
	}
	void tune()
	{
		System.out.println("Hi I am tune Violin");
	}
}
public class InstrumentApp
{
	public static void main(String x[])
	{
		Glockenspile g=new Glockenspile();
		g.play();
		g.tune();
		Violin v=new Violin();
		v.play();
		v.tune();
	}
}