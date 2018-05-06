package Corejava;

public class If_And_Else 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	int i=300;
	int j=200;
	int a=300;
	
	System.out.println(j);
	System.out.println(i);
	
	//Operators in Java=<,>,=,<=,>=,!
	
	if (i<j)// condition
	
	System.out.println("i is less then j");
	else
	System.out.println("i is not less then j");
	
	if (i<a)
		System.out.println("i is less then a");
	else
		System.out.println("i is not less then a");
	// if you are comparing two variable you need to put ==
	// if you are assigning a value to the variable you should use =
	if(i==a)
		System.out.println("value of i and a are the same");
	else
		System.out.println("value of i and a are not the same");
	
	//if(j>a)
		//System.out.println("J is greater then a");
	if(j<a)
	{
		System.out.println("j is greater then a");
	}
	else
		System.out.println("j is not greater then a");
	
	if(!(i==a))// not equal Condition example, ! sign for not equal to
	{
		System.out.println("value of i and a are not equal");
	}
	
	else
	{
		System.out.println("value of i and a are equal "+ "value of i is:" + i);
		
	}
	
			
	
		
	

	String name="John";
	String name1="Micheal";
	
	if(name==name1)
	{
		System.out.println("both of the names are the same");
	}
	else
	{
		System.out.println("both of the name are not the same");
	}
	
	
	int num = (int)(Math.random()*20);
	{
	System.out.println(num);
	}
	
	if(num>=10)
	{
		System.out.println(num + ": is Greater then 10");
	}
	else if (num<10 && num >5)
	{
		System.out.println(num+ ": the number is between 10 and 5");
	}
	else
	{
		System.out.println(num + ": is Less then 10");
	}
	
	
	
}
	
}	

