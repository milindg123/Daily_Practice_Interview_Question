/*Question 8. To find out whether the given String is Palindrome or not.
 
 Pallindrome String : "MADAM"  if i reverse this string it will be same as "MADAM" is called pallindrome.
 */

package BasicQuestion;

import java.util.Scanner;

public class StringIsPallindromeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s1 = sc.nextLine();
		
		//Here i create a org_s1 variable and stored the original string in this variable
		String org_s1 = s1;
		
		// here another empty variable created to stored the reverse string
		String rev = "";
		
		// Logic for reverse the string 
		int len = s1.length();
		for(int i=len-1; i>=0; i--) {
			rev = rev+s1.charAt(i);
		}
		
		// Here compare the original string and reverse string is equal or not
		if(org_s1.equals(rev)) {
			System.out.println("The given String is Pallindrome String");
		}
		
		else {
			System.out.println("The given string is Not Pallindrome String");
		}

	}

}
