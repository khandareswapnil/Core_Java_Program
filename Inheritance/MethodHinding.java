class A
{  static void show()
   { System.out.println("I am show in parent class");
   }
}
class B extends A
{  static void show()
   {    
     System.out.println("I am show from B class");
   }
}
class C extends A
{  static void show(){
	 System.out.println("I am show From C class");  
   } 
}

public class OverridingApp
{  public static void main(String x[])
   {    A a1 = new B();
	    a1.show();
		a1 = new C();
		a1.show();
   }
}
