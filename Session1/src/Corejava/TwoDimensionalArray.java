package Corejava;

public class TwoDimensionalArray {

	

	public static void main(String[] args) {
		
		
		
	int rows = 2;
	int cols = 7;
	
	String table[][] = new String [rows][cols];
	
	int table1[][] = new int[rows][cols];

	
	// assign the values in first row
	
	table[0][0]="Mon";
	table[0][1]="Tue";
	table[0][2]="Wed";
	table[0][3]="Thu";
	table[0][4]="Fri";
	table[0][5]="Sat";
	table[0][6]="Sun";
	
	table1[1][0]=10;
	table1[1][1]=20;
	table1[1][2]=30;
	table1[1][3]=40;
	table1[1][4]=50;
	table1[1][5]=60;
	table1[1][6]=70;
	
	
	//row length
	System.out.println(table.length);
	
	//col lenght
	System.out.println(table[0].length);
	
	
	
	//System.out.println(table1[1][0]);
	
	
	
	
	System.out.print(table[0][0]+"   "+ table1[1][0]);
	
	System.out.print(table[0][1]+"   "+ table1[1][1]);
	
	System.out.print(table[0][2]+"   " + table1[1][2]);
	System.out.print(table[0][3]+"   " + table1[1][3]);
	System.out.print(table[0][4]+"   " + table1[1][4]);
	System.out.print(table[0][5]+"   " + table1[1][5]);
	System.out.print(table[0][6]+"   " + table1[1][6]);
	
	
	System.out.println("      ");
	
	
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<cols;j++)
		{
			System.out.print( "    "  + table[i][j]);
		
			System.out.print( "    " + table1[i][j]);
	}System.out.println("      ");
	
	
	

	}
	
	

	}

}
