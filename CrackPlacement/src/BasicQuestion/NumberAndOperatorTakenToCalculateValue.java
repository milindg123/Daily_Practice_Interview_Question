/*Question 4.	Take in two numbers and an operator (+, -, *, /) and calculate the value.
 * 		 		(Use if conditions)
 * 
 */

package BasicQuestion;

import java.util.Scanner;

public class NumberAndOperatorTakenToCalculateValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of num1 :");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the value of num2 :");
		int num2 = sc.nextInt();
		
		System.out.println("Enter the value of the operator :");
		char opr = sc.next().charAt(0);
		
		
		if(opr == '+') {
			System.out.println(num1 + num2);
		}
		else if(opr == '-') {
			System.out.println(num1 - num2);
		}
		
		else if(opr == '*') {
			System.out.println(num1 * num2);
		}
		
		else if(opr == '/') {
			System.out.println(num1 / num2);
		}
		
		else {
			System.out.println("Wrong input Enter");
		}

	}

}
