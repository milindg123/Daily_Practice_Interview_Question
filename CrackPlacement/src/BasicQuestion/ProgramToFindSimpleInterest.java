/*Question No. 3.	Write a program to input principal, time, and rate (P, T, R) 
  					from the user and find Simple Interest.
 
 */


package BasicQuestion;

import java.util.Scanner;

public class ProgramToFindSimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of Principle : ");
		int p = sc.nextInt();
		
		System.out.println("Enter the value of rate : ");
		int r = sc.nextInt();
		
		System.out.println("Enter the value of time :  ");
		int t = sc.nextInt();
		
	
		double Simple_Interest = (p* r* t)/100;
		
		System.out.println("Simple Interest is : " + Simple_Interest);

	}

}
