/* Doing mathematical operations with random numbers such as;
powers of 2 and 3, square root, natural logarithm
and base 10 logarithm */

import java.util.Scanner;
import java.util.Random;

public class Question5{
	public static void main ( String [] args ){

Random random = new Random();
int randomNumbers = random.nextInt (101); // Here I wrote 101 in the argument to get randomly distributed number from 0 and 100
System.out.println ("The random number is " + randomNumbers);

double operation1 = Math.pow (randomNumbers, 2);
System.out.println (randomNumbers + " to the power of 2 is " + operation1);

double operation2 = Math.pow (randomNumbers, 3);
System.out.println (randomNumbers + " to the power of 3 is " + operation2);

double operation3 = Math.sqrt(randomNumbers);
System.out.println ("The square root of " + randomNumbers +" is " + operation3);

double operation4 = Math.log(randomNumbers);
System.out.println ("The natural logarithm of " + randomNumbers + " is " + operation4);

double operation5 = Math.log10(randomNumbers);
System.out.println ("The base 10 logarithm of " + randomNumbers + " is " + operation5);


	}
}