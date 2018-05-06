package Corejava;

public class Learning_Functions {
	
	public static int a = 30;
	public static int b =20;
	
	
	public static void print() 
	{
		System.out.println("Learning Functions");
	}
	
	public static void addNumbers()
	{
		int c = a+b;
		System.out.println("Addition of two numbers are :"+c);
	}

	public static void addNum(int r, int s)
	{
		int add = r+s;
		System.out.println("Sum of two numbers are:"+add);
	}
	
	public static int addNumbers(int x, int y)
	{
		int add = x+y;
		return add;
	}
	
	public static void main(String[] args)
	{
		print();
		addNumbers();
		addNum(10,90);
		int res = addNumbers(50,40);
		System.out.println(res);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
