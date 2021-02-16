package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericStack_zad2 <E> extends ArrayList {
	
	public int getSize() {
		return size();
	}

	public E peek() {
		return (E) get(getSize() - 1);
	}

	public void push(E o) {
		add(o);
	}

	public E pop() {
		E o = (E) get(getSize() - 1);
		remove(getSize()- 1);
		return o;
	}

	public boolean isEmpty() {
		return getSize() == 0;
	}

	public void print() {
		System.out.println ("All elements: " + toString());
	}
	
	
	public void printReverse() {
		System.out.print("All elements (reverse): ");
		for(int i = size() - 1; i >= 0; i--) {
			System.out.print(this.get(i) + " ");
		}
		System.out.println();
	}
	

}
