package Corejava;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*Write a program that converts Euro to US dollar.
		Requirement:-
		Program will ask for the Euro amount and it will
		covert to US dollar
	*/
		
		
		 
		 
		
		 
	
		     
		      /*  Scanner in = new Scanner(System.in);
		        String Converter;
		        String Quantity;
		        int total;
		        System.out.println("Enter a conversion factor.");
		        Converter = in.next();
		        System.out.println("Enter a quantity to convert from Euro's to dollars or enter a quantity less than or equal to 0 to exit the program..");
		       // total = (int) (Converter * Quantity)
		*/
		
		
		
		
		Scanner input = new Scanner(System.in);
        double value1 = 0.00, value2 = 0.00;
        String currency;
        double rate = 0.7800;
        double us_dollar = 0.7800;
        double euro = 1.36077;
        
        System.out.print("Enter a value: ");
        value1 = input.nextDouble();
        System.out.print("USD or EUR: ");
        currency = input.nextLine();


        if(currency.equals("USD")){
            value2 = value1 * 0.734878047;
            rate = input.nextDouble() * us_dollar;
            System.out.println(value1 + "USD = " + value2 + " EUR. (Conversion rate: 1 USD = 0.734878047 EUR)");
        } else if (currency.equals("EUR")) {
            value2 = value1 * 1.36077;
            System.out.println(value1 + "EUR = " + value2 + " USD. (Conversion rate: 1 EUR = 1.36077 USD)");
        } else {
            System.out.println("Conversion rate: 1 USD = 0.734878047 EUR"
            + "\nConversion rate: 1 EUR = 1.36077 USD");
            System.out.printf( "%s" + input + " at a conversion rate of " + us_dollar + " Dollars to %s = %.2f\n", (double)us_dollar, euro, rate);
        }

        input.close();

		
		//%,.2f`  - format float with 2 decimal places with comma.
		
		
		
		
		
	}

}
