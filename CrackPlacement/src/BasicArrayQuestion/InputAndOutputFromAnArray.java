/* 2. Input and Output from an Array
	Write a program to take n integer inputs from the user (use a scanner) and store them in an array. Then, print those values.
 
 */

package BasicArrayQuestion;

import java.util.Scanner;

public class InputAndOutputFromAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
		
		// Array Creation
		int arr[] = new int[n];
		
		
		//for input purpose
		System.out.println("Enter the array Elements : ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt(); // Taking user input elements in the array
		}
		
		// For output purpose
		System.out.println("Array Elements Entered by you is : ");
		// for loop for printing the array elements
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
		
	

	

	}

}
