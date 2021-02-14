package Recursion;

import java.util.Scanner;

public class TailRecursion_zad4 {
//	Ќапишете опашен рекурсивен метод, който да пресм€та средно аритметично на масив от цели числа 
	public static void main(String[] args) {
		double[] x = new double[] {54, 23, 46, 20, 9, -334, 324, 4};
		
	   	 System.out.println("Array size:" + x.length + "\nAverage of array x is " + avrg(x));
	}
	
	public static double avrg(double[] x) {
		return avrg(x, x.length - 1, 0);
	}
	public static double avrg(double[] x, int pos, double sum) {
		if(pos < 0) {
			System.out.println("SUM: " + sum);
			return sum / x.length;
		}
		else {
			return avrg(x, pos - 1, sum + x[pos]);
		}
	}

}
