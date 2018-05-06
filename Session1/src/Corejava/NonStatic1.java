package Corejava;

public class NonStatic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	NonStatic1 x = new NonStatic1();
	
	
	x.car();
	x.flower();
	x.go();
	x.go1();
	x.go2();
	x.massaddition(10, 20, 30, 40);
	}

	
	public void car()
	{
		System.out.println("Toyota");
	}
	public void flower()
	{
		System.out.println("I like rose");
	}
	
	public void go() 
	{	
		
		System.out.println("Inside Go Method");
	}
	
	public void go1()
	{	
		
		System.out.println("Inside Go1 Method");
	}
	public void go2()
	{	
	
	System.out.println("Inside Go2 Method");
	
	}
	public  void massaddition(int a,int b,int c,int d)
	{
		int add= a+b+c+d;
		System.out.println(add);
	}
}
