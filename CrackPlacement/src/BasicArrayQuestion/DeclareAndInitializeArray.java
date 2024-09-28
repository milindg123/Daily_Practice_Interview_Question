/* 	1. Array Declaration and Initialization
	Write a Java program to declare and initialize an array of 5 integers with values: 10, 20, 30, 40, 50. Print all the elements of the array.
 
 */

package BasicArrayQuestion;

public class DeclareAndInitializeArray {

	public static void main(String[] args) {
	
		int arr[] = {10, 20, 30, 40 ,50}; // Array declare & Initialize
		
		
		System.out.println("Elements of array is : ");
		//Loops for printing the array elements
		for(int i=0; i<=arr.length-1; i++) {
			System.out.println(arr[i]);
		}


	}

}
