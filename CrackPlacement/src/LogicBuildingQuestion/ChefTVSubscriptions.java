/* Program to demonstrate the Chef-TV Subscriptions

Subscriptions
A new TV streaming service was recently started in Chefland called the Chef-TV.

A group of N friends in Chefland want to buy Chef-TV subscriptions. We know that 6 people can share one Chef-TV subscription.
Also, the cost of one Chef-TV subscription is X rupees. Determine the minimum total cost that the group of N friends
will incur so that everyone in the group is able to use Chef-TV.

       Input Format
The first line contains a single integer T — the number of test cases. Then the test cases follow.
The first and only line of each test case contains two integers N and X — the size of the group of friends and
the cost of one subscription.

       Output Format
For each test case, output the minimum total cost that the group will incur so that everyone in the group is able to use Chef-TV.



Sample 1:
Input :
       3
       1 100
       12 250
       16 135

Output:
       100
       500
       405
 */


package LogicBuildingQuestion;

import java.util.Scanner;

public class ChefTVSubscriptions {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Test cases : ");
		int T = sc.nextInt();
		
		
		for(int i=0; i<T; i++) {
			System.out.println("Enter the size of the group of friends : ");
			int N = sc.nextInt();
			
			System.out.println("Enter the cost of the one subscription : ");
			int X = sc.nextInt();
			
			int Subscription = (N +5)/6;  // It is equivalent to ceil(N/6)
			
			int Total_Cost = Subscription * X;
			
			System.out.println("Total Subscription Cost is : " + Total_Cost);
			
			
		}

	}



}
