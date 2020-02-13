/* The calculation of the price of a product in CAD
*/

import java.util.Scanner;
import java.text.DecimalFormat;


public class Question2{
	public static void main ( String [] args ){

Scanner scan = new Scanner (System.in);
System.out.print ("What is the price in CAD dollars of the product that you bought in >");
double priceOfProduct = scan.nextDouble ();

DecimalFormat percentage  = new DecimalFormat ("0.0#%"); // I created a new format of percetage to show the taxes and tips in percentage 
double tPS = 0.05;
double tVQ = 0.0997;
double tip = 0.15;
System.out.println ("The sales tax in Quebec has two types" + " TPS which is " + percentage.format (tPS) +
	"\nand TVQ which is " + percentage.format(tVQ) + " of the final price of the product" +
	"\nwe also give tips which is additional " + percentage.format(tip)); // here the computer will output the taxes and tip in a percetage form

double totalAmount = priceOfProduct + (priceOfProduct * tPS) + (priceOfProduct *tVQ);
double totalAmountWithTip = totalAmount + (totalAmount * tip);
DecimalFormat price = new DecimalFormat ("$0.00"); // Here I created a new format which is called price to ouput the final answer with only 2 digits after decimal point

System.out.println ("The total price of the product that you bought is " + 
	price.format (totalAmountWithTip) + " CAD");



	}
}