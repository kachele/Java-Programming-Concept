package Corejava;

public class SingleArray {

	public static void main(String[] args)
	{
		
		
		
		//int emp10 = 1000;
				
		//int[] salary;
		
		//salary = new int[10];
		
		String month[]= {"Jan","Feb","March"};
		
		System.out.println(month[0]);
		System.out.println(month[1]);
		System.out.println(month[2]);
		
		
		System.out.println(month.length);
		
		for(int i =0; i<month.length; i++)
		{
			System.out.println(month[i]);
		}
		
		
		//String Rainbow [] = new String [7];
		String Rainbow[]= {"red","orange","green","yellow","indigo","purple","blue"};
		
		/*Rainbow[0]="red";
		Rainbow[1]= "orange";
		Rainbow[2]="green";
		Rainbow[3]= "yellow";
		Rainbow[4]="indigo";
		Rainbow[5]= "purple";
		Rainbow[6]="blue";
		*/
		System.out.println(Rainbow.length);
		//System.out.println(Rainbow[0]);
		//System.out.println(Rainbow[1]);
		
		for(int x = 0; x< Rainbow.length; x++)
		{
			System.out.println(Rainbow [x]);
		}
		
		System.out.println("*********HomeWork***********************");
		
		//1) make a list of 10 high income cities of Texas
		
		String High_Income_Cities[]= {"Dallas","Plano","Frisco","Addision","Irving","Arlington","Fort Worth","Austin","San Antonio","Houston"};
			System.out.println(High_Income_Cities.length);
			
			for(int y= 0; y< High_Income_Cities.length; y++)
			{
				System.out.println(High_Income_Cities[y]);
			}
		
		
		
		//2)2) Make a list for next week's temperature in Dallas
			// (use integer array)
			String Days_Temp[]= {"Mon: 80","Tue : 85","Wedn: 90","Thur: 88","Fri:  90","Sat:  85","Sun:  87"};
			System.out.println(Days_Temp.length);
			
			for(int y= 0; y< Days_Temp.length; y++)
			{
				System.out.println(Days_Temp[y]);
			}
		
		
		
		
		
		
		
		
		
		

	}

}
