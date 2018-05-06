package Corejava;

public class DoubleArray {

	public static void main(String[] args) {
		
		
		
		//int rows = 4;
		//int cols = 4;
		
		
		String flights[][] = new String [4][4];
		
		
		flights[0][0]= "Dallas";
		flights [0][1]="Harrisburg";
		flights[0][2]="Miami  ";
		flights[0][3]="Austin ";
		
		
		flights[1][0]= "N Mexico";
		flights [1][1]="SanDiago";
		flights[1][2]="DC       ";
		flights[1][3]="Chicago  ";
		
		flights[2][0]= "Orleans";
		flights [2][1]="NYC    ";
		flights[2][2]="Kansas  ";
		flights[2][3]="Toronto ";
		
		flights[3][0]= "Denver ";
		flights [3][1]="Honolulu";
		flights[3][2]="NYC     ";
		flights[3][3]="Houston" ;
		

		
		
		
		System.out.println(flights[3][3]);
		
		/*
		int rows=flights.length;
		int cols=flights[0].length;
		
		
		for (int rownum=0;rownum<rows;rownum++)
		{
			for(int colnum=0;colnum<cols;colnum++)
			{
				System.out.print("   " + flights[rownum][colnum]);
			}System.out.println("    ");
		}
	
		System.out.println("*****************************************");
		
	/*	for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print( "  |  "  + flights[i][j]);
				
				
		}System.out.println("   |  ");
		System.out.println("--------------------------------------------------");
	}

	*/	
		
		
		
		
		
		String city[][]= new String [2][2];
				
					// first row
					city[0][0]="Dallas";
					city[0][1]="Austin";
					
					city[1][0]="Huoston";
					city[1][1]="NYC";
				
					
					System.out.println(city[0][0]);
					System.out.println(city[0][1]);
					System.out.println(city[1][0]);
					System.out.println(city[1][1]);
					
				
		
				
				
		System.out.println("************************************************************************************************************************");
		
		int rows=city.length;
		int cols=city[0].length;
		System.out.println(city.length);
		System.out.println(city[0].length);
		
		
		 for (int rownum=0;rownum<rows;rownum++)
		 {
			 for(int colnum=0;colnum<cols;colnum++ )
			 {
			 System.out.print("     "+city[rownum][colnum]);
		 
			 }System.out.println("            ");
			 
		
		 }
		
		for (int x=0;x<rows;x++)
		{
			for (int y=0;y<cols;y++)
				System.out.println(city[x][y]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}