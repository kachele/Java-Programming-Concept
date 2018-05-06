package Corejava;

public class Loops_example {

	public static void main(String[] args) {
		
		
		int i=1;
		
	/*	do {
			
			
			System.out.println("Number is :" + i);
			i++;//here we increment the value of i=i+1;
		}
		
		while(i<=10);
		
		*/
		
		while(i<=10)
		{// the while loop with the do
			
			System.out.println("Number is : " + i);
			i=i+1;
		}
		
		System.out.println("*******************For Loop****************");
		
		
		for(int x =1; x<=10; x ++) {//counting ascending order
			
			System.out.println("Value of x is " + x);
			
		}
		
		System.out.println("************************Descending Order***************************");
		
		
			for(int y =10; y>= 1; y --) {// counting descending order
				
				System.out.println("Value of y is :" + y);
			}
			
			System.out.println("************************Even Numbers*************************");
			
			
			
			for (int z=2;z<=20; z = z+2)
			{
			
				System.out.println("Even Numbers are : " + z);
			}	
				
			
				System.out.println("**********************************Print the Table of Multiplication***************");
				
					
				
				
		System.out.println("****************Nested Loop*************************************");	
			for(int table=1; table<= 10; table++)
			{
			System.out.println("table of Multiplication:   " + table);	
			
								
				for(int x =1; x<=10;x++)
						
						
					{
						System.out.println(table + "*"  + x +" = "  +table*x);
						
					
						
								
						
					}
			
				if (table== 6) 
				{
					break;// Exit the loop
                 }  
		
			
			}		
	
		System.out.println("***************pre and post incremental operators******************************");
		int p = 1;
				{
			System.out.println(p++);
			System.out.println(p);
			
			
		int q =5;
		{
			System.out.println(++q);
			
		}
				}
		
	}
}



































