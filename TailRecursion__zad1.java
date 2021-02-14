package Recursion;

public class TailRecursion__zad1 {
	//This program finds the GCD of two numbers using the euclidean algorithm
    public static int foo (int x, int y)
    {
    //GCD (0, 25) = 25
   	if (y == 0)
     	    return x;
   	//Let's take for example 234 and 126. 
   	// 234 = 1 * 126 + 108
   	// GCD (234, 126) = GCD (234, 108)
   	// 234 = 108 * 2 + 18
   	// GCD (234, 108) = GCD (234, 18)
   	// 234 = 18 * 13 + 0, the base case is met and the given answer is 18
   	
   	
   	else
     	    return foo(y, x % y);
    }
    
    public static void printGCD(int x, int y) {
    	System.out.println("GCD of " + x + " and " + y + " is " + foo(x, y));
    }

	public static void main(String [] args) {
		printGCD(5, 25);
		printGCD(0, 2325);
		printGCD(3235, 0);
		printGCD(23, 47);
		printGCD(234, 117);
		printGCD(234, 116);
		printGCD(234, 126);
		}

}
