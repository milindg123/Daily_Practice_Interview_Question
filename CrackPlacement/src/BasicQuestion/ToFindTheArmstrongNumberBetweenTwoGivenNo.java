/*	Question 9. To find Armstrong Number between two given number.
 
 
 Armstrong Number : 
 An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits in the number.

For example:

153 is an Armstrong number because:



 */

package BasicQuestion;

import java.util.Scanner;

public class ToFindTheArmstrongNumberBetweenTwoGivenNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		
		System.out.println("Is Armstrong number : " + isArmstrong(n));
		
		
		
		
//	************************************ Approach 1 ****************************************
//		int temp = n;
//		int lastNumber;
//		int sum=0;
		
		//1) Here basic logic
//		while(n>0) {
//			lastNumber = n%10;  //for finding last digit
//			n = n/10;  // it help to remove the last digit as like 153 --> first go to 3 -->then 5--> then 1
//			
//			sum = sum + lastNumber*lastNumber*lastNumber;
//		}
		
//		if(temp == sum) {
//			System.out.println("The given Number is an Armstrong Number");
//		}
//		else {
//			System.out.println("The given number is Not an Armstrong Number");
//		}
		
	}
	
//	************************************* Approach 2 ***********************************************
	static boolean isArmstrong(int n) {
		int digits = 0;
		int temp;
		int sum = 0;
		temp = n;
		while(temp > 0) {
			temp = temp/ 10;
			digits++;
		}
		System.out.println("Number of digits : " + digits);
		
		temp = n;
		while(temp > 0) {
			int lastDigit = temp% 10;
			sum = (int) (sum + Math.pow(lastDigit, digits));
			temp = temp/ 10;
			
		}
		
		System.out.println("Sum is : " + sum);
		
		if(sum == n) {
			return true;
		}

		return false;
	
		
	}
	

}
