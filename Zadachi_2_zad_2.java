package Recursion;

import java.util.Scanner;

public class Zadachi_2_zad_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("Binay:" + dec2Bin(x));
	}
	public static String dec2Bin (int value) {
		//Let's take for example the integer 12. We dive it by 2 until we are left with 0. 12 : 2 = 6 + 0; 6 : 2 = 3 + 0
		// 3 : 2 = 1 + 1. 1 : 2 = 0 + 1. We have got the numbers 0011. Now, we have to reverse the number. We are 
		//left with 1100. 
		
		//Base case that should return 0 if the decimal number given is 0 
		//Otherwise, when we add it to the String, it is parsed to 0 and the result of 
		//Integer.parseInt(dec2Bin (value / 2)) * 10) = 0
		if(value == 0) {return "0";}
		//By multiplying by 10, the next number will stay before the current and we won't have to reverse the String
		return Integer.toString(value % 2 + Integer.parseInt(dec2Bin (value / 2)) * 10);
	}
}
