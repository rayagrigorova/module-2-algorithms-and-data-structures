package Recursion;

import java.util.Scanner;

public class Zadachi_2_zad_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		System.out.println("The number " + x + " is " + ( (even(x) == true)? "even" : "odd" ) );

	}

	//Let's take for example the numbers 6 and 11. All even numbers are 2*n, n >= 0. So 6 = 2 + 2 + 2 = 2*3. 
	// But 11 = 2 + 2 + 2 + 2 + 2 + 1 = 2*5 + 1. So, we will have to subtract 2 until we are left
	//with either 1 or 0. If we are left with 1 the number is odd. Otherwise if = 0 -> even. 
	public static boolean even (int x) {
		//Base cases
		if(x == 1) {
			//If we are left with 1, the number is odd
			return false;
		}
		if(x == 0) {
			//If we are left with 0, the number is even
			return true;
		}
		return even(x - 2);
	}
	
	public static boolean odd(int x) {
		//Base cases
		if(x == 1) {
			//If we are left with 1, the number is odd
			return true;
		}
		if(x == 0) {
			//If we are left with 0, the number is even
			return false;
		}
		return even(x - 2);	
	}

}
