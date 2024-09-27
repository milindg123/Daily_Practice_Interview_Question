/* Question 6.	Input currency in Rupee's and output in USD.
 
 */

package BasicQuestion;

import java.util.Scanner;

public class InputRupeesConvertIntoOutputUSD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rupees amount : ");
		int INR = sc.nextInt();
		
		int Exchange_Rate = 83;
		
		double USD = (INR/Exchange_Rate);
		
		System.out.println("Rupees to USD Conversion is : " + USD);

	}

}
