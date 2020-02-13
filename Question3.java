/* Sum of the 3 integer numbers that the user has chosed
*/

import java.util.Scanner;

public class Question3 {
	public static void main ( String [] args ){

Scanner scan = new Scanner (System.in);
System.out.print ("Write 3 integer numbers that you want to add >");
int number1 = scan.nextInt(); // this will scan the first number 
int number2 = scan.nextInt(); // this will scan the second number 
int number3 = scan.nextInt(); // this will scan the third number 

int totalSum = number1 + number2 + number3; // here I added all the numbers and called it totalSum
System.out.println ("The sum of all 3 numbers that you chose is " + totalSum); // this statement prints the total sum of 3 numbers 



	}

}