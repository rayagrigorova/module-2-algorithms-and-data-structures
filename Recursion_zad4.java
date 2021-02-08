package Recursion;

public class Recursion_zad4 {
	public static double xn(double x, int n) {
		// According to the task, n must be > 0 
		if(n < 0 ) {System.out.println("n must be a positive integer");}
		//Base case 
		if(n == 0) {return 1;}
		return x * xn(x, n - 1);
	}
	
	public static double xnIterative(double x, int n) {
		if(n < 0 ) {System.out.println("n must be a positive integer");}
		if(n == 0) {return 1;}
		double ans = 1;
		//We multiply the answer by x n times 
		for(int i = 0; i < n; i++) {
			ans *= x;
		}
		return ans;
	}
	public static void main(String [] args) {
		System.out.println(xn(2,5));
		System.out.println(xnIterative(2.5,5));
		System.out.println(xn(-2,3));
		System.out.println(xn(-24,5));
	}
}
