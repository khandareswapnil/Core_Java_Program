public class mcq7
{ public void myMethod1()
{ static int num1=100;
final int num2=200;
System.out.println("The value of first variable is " + num1);
System.out.println("The value of second variable is " + num2);
}
public void myMethod2()
{ int arr[] = new int[2];
System.out.println(arr[arr.length-1]);
}
public static void main(String args[]) {
new mcq7().myMethod1();
new mcq7().myMethod2();
}
}
