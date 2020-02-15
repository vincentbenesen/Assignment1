/* Sum of the 3 integer numbers that the user has chosed
*/

import java.util.Scanner;


public class Question3 {
	public static void main ( String [] args ){

Scanner scan = new Scanner (System.in);
System.out.print ("Write  numbers that has 3 digits that you want to add >");
String numberWith3Digits = scan.next(); // I made the scanner to scan a String so I can seperate the three numbers by using the string method
String number1 = numberWith3Digits.substring (0,1); // here I used substring method from String class so I can seperate the numbers 
String number2 = numberWith3Digits.substring (1,2);
String number3 = numberWith3Digits.substring (2);

int number1Integer = Integer.parseInt(number1); // here I convert each of the String objects by Using the Wrapper class 
int number2Integer = Integer.parseInt(number2);
int number3Integer = Integer.parseInt(number3);



int sum = number1Integer + number2Integer + number3Integer; // Because all the Strings are converted, I can now add them because they are all Integers



System.out.println ("The sum of all 3 numbers that you chose is " + sum ); // This statement prints the total sum of 3 numbers 



	}

}