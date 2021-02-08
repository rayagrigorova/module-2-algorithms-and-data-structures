package Recursion;

public class Recursion_zad2 {
	public static void main(String[] args) {
	   	 xMethod(1234567);
	   	 System.out.println();
	   	 xMethodIterative(1234567);
	}

	//Let's take the number 1234567. The base case is 0. We first print 7 and then call xMethod(123456). This is repeated until we are left with 1. 
	//One is printed out, xMethod(0) is called and the method returns. 
	
	//The purpose of this program is to print out a number reversed. 
	public static void xMethod(int n) {
	   	 if (n > 0) {
	   		 System.out.print(n % 10);
	   		 xMethod(n / 10);
	   	 }
	 }
	public static void xMethodIterative(int n) {
		//For the number until we reach 0
		//We divide it by 10 each time we iterate
		for(int i = n; i > 0; i /= 10) {
			//We print the last digit
			System.out.print(i % 10);
		}
		System.out.println();
	 }


}
