package Corejava;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Scanner reader=new Scanner(System.in);
		System.out.println("What is your name");
		String name=reader.next();
		// for integer value
		Scanner reader1=new Scanner(System.in);
		System.out.println("What is your age");
		int age=reader1.nextInt();
		
		System.out.println("Your name is:" +name);
		System.out.println("Your age is:" +age);
		
		*/
		
		
		
		
		   
		     
			char us_dollar_sym = 36;
			char euro_sym = 8364;
	        
	        String us_dollar = "Dollars"; 
	        String euro = "Euros";
	        double rate = 0;


	        // Interface
	        System.out.println("Welcome to the Currency Converter");
	        System.out.println("Use the following codes to input your currency choices:  1 - US dollars 2 - Euros ");

	        // 
	        System.out.println("Please choose the input currency:");
	        Scanner in = new Scanner(System.in);
	        int choice = in.nextInt(); 

	       String inType = null;
	        switch(choice) {
	        case 1: inType = "US Dollars >> " + us_dollar_sym; 
	        break;
	        case 2: inType = "Euros >> " + euro_sym; 
	        break;
	       
	        default:
	        System.out.println("Please restart the program & enter a number from the list.");
	        return;
	      }

	        System.out.println("Please choose the output currency");
	        int output = in.nextInt();

	        System.out.printf("Now enter the input in " + inType);
	        double input = in.nextDouble(); 

	      if (choice == output) 
	        System.out.println("Same currency no need to convert");

	      if (choice == 1 && output == 2)
	        { 
	           double dollar_euro_rate = 0.78391;
	           rate = input * dollar_euro_rate;
	           System.out.printf( "%s" + input + " at a conversion rate of " + dollar_euro_rate + " Dollars to %s = %.2f\n", (char)us_dollar_sym, euro, rate);
	        }
	   
		
		
		
		
		
	}

}
