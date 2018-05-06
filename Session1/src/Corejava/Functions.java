package Corejava;

public class Functions {

	
	public static void city()
	{
		System.out.println("I am from Dallas");
	}
	public static void main(String[] args) 
	{
		
	/*country();	
	state();
	city();
	age();
    addition(9,10);
    */
    massaddition(10,55,78,60);
    
    numbers();

	}

	public static void country()
	{
		System.out.println("I am from Mars");
	}
	
	public static void state()
	{
		System.out.println("I am from Texas");
	}
	
	
	public static void age()
	{
		int x=9;
		System.out.println(x);
	}
	
	public static void addition(int a,int b)
	
	{
		int add = a+b;
		System.out.println(add);
	}
	
	public static void massaddition(int a,int b,int c,int d)
	{
		int add= a+b+c+d;
		System.out.println(add);
	}
	public static void numbers()
	{
		int num = (int)(Math.random()*100);
		System.out.println(num);	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
