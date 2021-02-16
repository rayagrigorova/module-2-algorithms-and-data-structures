package Generics;

import java.util.Scanner;

public class TestGenericStack_zad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericStack_zad1<String> stack = new GenericStack_zad1<>();
		Scanner sc = new Scanner (System.in);
		String temp;
		
		System.out.println("Please enter 5 strings of data");
		for(int i = 0; i < 5; i++) {
			temp = sc.next();
			stack.push(temp);
		}
		stack.printArrayInReverse();

	}

}
