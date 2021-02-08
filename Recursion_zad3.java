package Recursion;

import java.util.Scanner;

public class Recursion_zad3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	   	 System.out.println("Recursive power of two:  " + powerOfTwo(n) + " Iterative power of two:  " + powerOfTwoIterative(n));
	}
	public static int powerOfTwo(int n) {
		//Every number ^0 (except 0) is 1
		//This is also our base case
		if(n == 0) return 1;
		
		//If we got a negative number for n, we have to divide 1 by the result
		if(n < 0) return 1 / powerOfTwo(n * -1);
		
		//The third case is when n > 0
		//For example, 2^6 will be 2 * powerOfTwo(5). powerOfTwo(5) is in turns 2 * powerOfTwo(4).
		//And so on until we reach 2 * powerOfTwo(0) (when n = 1). Then, 1 is returned and 2^1 = 2. 
		//From there we return the other results as well 
		return 2 * powerOfTwo(n - 1);
		 
	}
	public static int powerOfTwoIterative(int n) {
		int ans = 1;
		//We repeat the following process n times
		for(int i = 0; i < n; i++) {
			//We multiply the answer by 2
			ans *= 2;
		}
		//Then, if n < 0 we just divide 1 by the result 
		if(n < 0) return 1 / ans;
		return ans;
	}
}
