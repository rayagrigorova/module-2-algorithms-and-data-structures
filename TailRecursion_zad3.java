package Recursion;

import java.util.Scanner;

public class TailRecursion_zad3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
	   	 System.out.println("x^n is " + powRecursive(x, n));
	}

    public static int powRecursive(int x, int n) {
      	 return powRecursive(x, n, 1);
    }
    
    public static int powRecursive(int x, int n, int ans) {
     	 if (n == 0) {
     		 return ans;
     	 }
     	 
     	 return powRecursive(x, n - 1, ans * x);
   }
}
