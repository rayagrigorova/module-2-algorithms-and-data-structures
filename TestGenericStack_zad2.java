package Generics;

import java.util.Scanner;

public class TestGenericStack_zad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		GenericStack_zad2 <String> stack1 = new GenericStack_zad2<>();
		System.out.println("Please enter 5 strings of data: ");
		String temp;
		for(int i = 0; i < 5; i++) {
			temp = sc.next();
			stack1.push(temp);
		}
		stack1.printReverse();
	}

}
