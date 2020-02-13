/* Calculation of the cost of a roadtrip
*/

import  java.util.Scanner;
import java.text.DecimalFormat;

public class Question1{
	public static void main ( String [] args){

Scanner scan = new Scanner (System.in);
System.out.print ("How many kilometers are you going to travel > "); //Here Im asking how many kilometers the user will travel
float kiloMeters = scan.nextFloat();

System.out.print("What is the average distance that your vehicle runs with 1 liter of gas> ");
float averageDistance = scan.nextFloat ();

float totalGas = kiloMeters/averageDistance; //Here I divided the kilometers and average to get the total amount of the gas that is need for the trip
float totalCost = totalGas * 1.16f; // to find the total cost i multiply the amount of gas that needed to the price of Canadian gas per liter 

DecimalFormat price = new DecimalFormat ("$0.00");
System.out.println ("The total cost of the trip is " + price.format (totalCost) + " CAD");





	


	}

}