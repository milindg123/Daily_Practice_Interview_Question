/*	4. Find the Maximum and Minimum Element in an Array
	Write a Java program to find and print the maximum and minimum elements in an array of integers.
  
 */

package BasicArrayQuestion;

public class FindTheMaximumAndMinimumElementInAnArray {

	public static void main(String[] args) {

		int arr[] = { 10, 30, 2, 5, 1, 45 };

		// sorting logic
		for (int j = 0; j<arr.length-1; j++) {
			for (int i = 0; i < arr.length-1; i++) {
				if (arr[i] > arr[i + 1]) {
					//Swap
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		
		for(int Arr : arr) {
			System.out.println(Arr);
		}

		
		//For the Maximum Array Elements
		System.out.println("The Maximum Elements of the array is : ");
		System.out.println(arr[arr.length-1]);
		
		//For the Minimum Array Elements
		System.out.println("The Minimum Elements of an array is : ");
		System.out.println(arr[0]);
	}

}
