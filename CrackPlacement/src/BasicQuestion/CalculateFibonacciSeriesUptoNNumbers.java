/* Question 7.	To calculate Fibonacci Series up to n numbers.
 
 
 	What is Fibonacci Series ?
 	The Fibonacci series is a sequence of numbers where each number is the sum of the previous two numbers,
 	starting from 0 and 1. 
 	
 	for Ex. 0,1,1,2,3,5,8,13,21......
 	
 --> 
 */

package BasicQuestion;

import java.util.Scanner;

public class CalculateFibonacciSeriesUptoNNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range : ");
		int n = sc.nextInt();
		
		int num1 = 0;
		int num2 = 1;

		System.out.println("Fibonacci Series upto n terms: "+ n);
		
		for(int i=1; i<=n; i++) {
			System.out.println(num1+" ");
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			
		}

	}

}
