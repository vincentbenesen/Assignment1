/* The use of this code is to determine wether an URL is valid and Secure
*/

import java.util.Scanner;

public class Question4{
	public static void main ( String [] args ){

Scanner scan = new Scanner (System.in);
System.out.print ("Write any URL u want to verify > ");
String url = scan.nextLine ();
	url = url.trim(); // I use the trim method from String class to remove any leading or trailing whitespace 
int urlCharacters = url.length(); // This lines calculate the length of the characters of the given URL 

char h = url.charAt(0); // in this line I created an object which can read the first 5 letters of the URL
char t = url.charAt(1);
char t2 =url.charAt(2);
char p = url.charAt(3);
char s = url.charAt (4);




System.out.println ("Verifying an URL with " + urlCharacters + " characters"); // here it output the numbers of the characters from the URL 
System.out.println ("If the URL starts with \"https://\" then the URL is valid"); // this only explain the condition which is if the url is starting with https then it is a valid one 
System.out.println ("Is this a valid and Secure URL " + Character.isLetter(h + t + t2 + p + s)); // here if the url starts with a letter the conditon will state true 



	}
}