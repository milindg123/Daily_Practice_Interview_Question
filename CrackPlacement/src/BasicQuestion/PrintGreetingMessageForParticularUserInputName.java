/*	2.	Take name as input and print a greeting message for that particular name.
 
 */
		

package BasicQuestion;

import java.util.Scanner;

public class PrintGreetingMessageForParticularUserInputName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name = sc.nextLine();
		
		System.out.println("Hello! " + name);

	}

}
