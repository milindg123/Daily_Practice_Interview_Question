/* 1.	Write a program to print whether a number is even or odd, 
        also take input from the user.
 
 */

package BasicQuestion;

import java.util.Scanner;

public class EvenOrOddNumber {

	public static void main(String[] args) {
		//User input 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		if(n%2 == 0) {
			System.out.println("The number is Even Number");
		}
		else {
			System.out.println("THe number is Odd Number");
		}

	}

}
