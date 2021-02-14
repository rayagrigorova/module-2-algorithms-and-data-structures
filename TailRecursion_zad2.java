package Recursion;

import java.util.Scanner;

public class TailRecursion_zad2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
	   	System.out.println("Sum is " + xMethod(x));
	}

	//Calculates sum 1 + 2 + 3 + 4 + ..... + n
	public static int xMethod(int n) {
		return xMethod(n, 0);
	}
	public static int xMethod(int n, int sum) {
		//After we add all numbers, we return the sum
	   	 if (n == 0)
	   		 return sum;
	   	 else
	   		 return xMethod(n - 1, sum + n);
	}

}
