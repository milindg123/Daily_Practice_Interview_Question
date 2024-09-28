/*	3. Calculate the Sum of Array Elements
	Write a program to calculate and print the sum of all elements in an integer array. Use a for-loop to iterate through the array.
 
 */

package BasicArrayQuestion;

import java.util.Scanner;

public class CalculateTheSumOfArrayElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		//user input elements 
		System.out.println("Enter the array elements : ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		//for array output
		System.out.println("You Entered the array elements are : ");
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
		
		//for sum of array elements
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum = sum + i;
			sum++;
		}
		System.out.println("Sum of array elements is : "+ sum);

	}

}
