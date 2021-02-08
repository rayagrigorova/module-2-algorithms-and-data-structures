package Recursion;

import java.util.Scanner;

public class Recursion_zad1 {
	// First, xMethod (5) is called. We try to calculate 5 + xMethod(4). Then, we try 4 + xMethod(3). Thereafter, 
	// 3 + xMethod(2) and 2 + xMethod(1). The base case is 1. After we reach 1, 1 is returned. Then we go back in the recursion. 
	// 2 + 1 is calculated (3). Then follow 3 + 3 (6), 4 + 6 (10) and lastly 5 + 10 (15). So, our answer is 15. 
		
	//The purpose of this program is to calculate the sum of all numbers from n to 1. 
	
	public static int xMethod(int n) {
	   	 if (n == 1)
	   		 return 1;
	   	 else
	   		 return n + xMethod(n - 1);
	}
	
	public static int xMethodIterative(int n) {
		//The sum is initially 0
		int sum = 0;
		//Then for the numbers from 1 to n 
		for(int i = 1; i <= n; i++) {
			//We add each to the sum
			sum += i;
			
		}
		//Finally, we return the sum 
	   	return sum;
	}
	
	
	public static void main(String[] args) {
			int x;
			Scanner sc = new Scanner(System.in);
			x = sc.nextInt();
			
			System.out.println("Sum is " + xMethod(x));
			System.out.println("Sum is " + xMethodIterative(x));
	}
}
