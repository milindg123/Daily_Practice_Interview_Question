/* 5.	Take 2 numbers as input and print the largest number.
 
 */

package BasicQuestion;

import java.util.Scanner;

public class PrintTheLargestNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of A :");
		int A = sc.nextInt();
		
		System.out.println("Enter the value of B :");
		int B = sc.nextInt();
		
		
		if(A>B) {
			System.out.println("Largest Number is : "+ A);
		}
		
		else {
			System.out.println("Largest Number is : "+ B);
		}

	}

}
