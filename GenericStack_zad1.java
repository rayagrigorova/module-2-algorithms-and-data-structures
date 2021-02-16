package Generics;

import java.util.Arrays;

public class GenericStack_zad1 <E> {
	private E[] array;
	private int numberOfElements;

// "Generics are also called non-reified (“non-concretized”). They don’t have a “concrete”, known type during runtime"
// At execution time, a List<String> and a List<Date> are exactly the same; the extra type information has been erased by the compiler.
	
// "Java's arrays (unlike generics) contain, at runtime, information about its component type.
// So you must know the component type when you create the array. Since you don't know what T is at runtime, you can't create the array."
	

	
//	"By creating an array Object[] manually (...) and casting
//	it to the generic field type T[], you “give a promise” 
//	to the compiler that you’re aware of what’s going on with this array..."
	
// Basically, generics don't have a concrete, known type during runtime and arrays must know the component type when they are created. 
// So we create an array of Objects and then cast them to E[] because arrays need a specific type to be created
	
	public GenericStack_zad1() {
		//Starting size of 3
		array =  (E[]) new Object[3];
		numberOfElements = 0;
		
	}
	
	public int getSize() {
		return array.length;
	}

	public E peek() {
		return array[numberOfElements - 1];
	}

	public void push(E o) {
		// If for example three elements can fit in the array, then the number of elements must be < 3 so we can add another one 
		if(getSize() <= numberOfElements) {
			//New array twice the size of old one 
			E[] newArray = (E[]) new Object[getSize() * 2];
			//Copy contents
			for(int i = 0; i < getSize(); i++) {
				newArray[i] = array[i];
			}
			//Now, array points to the new, bigger array
			array = newArray;
		}

		array[numberOfElements] = o;
		numberOfElements++;
	}

	public E pop() {
		E o = array[numberOfElements - 1];
		remove(numberOfElements- 1);
		return o;
	}

	public boolean isEmpty() {
		return this.numberOfElements == 0;
	}

	@Override
	public String toString() {
		return "stack: " + array.toString();
	}
	
	public void remove(int ind) {
		// If there aren't any elements or the index is invalid 
		if(numberOfElements <= 0 || ind >= numberOfElements || ind < 0) return;
		
		//Let's take the array 123. To remove 2, ind = 1, size = 3. The
		//loop is executed once and we are left with 1 3 3. So we must delete the last element 
		//by resizing the array
		
		//This loop won't work with the last element
		for(int i = ind; i < this.numberOfElements - 1; i++) {
				this.array[i] = this.array[i + 1];
		}
		
		array = Arrays.copyOf(array, numberOfElements - 1);
		numberOfElements--;
		
	}
	public void printArray() {
		System.out.print("All elements: ");
		for(int i = 0; i < numberOfElements; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public void printArrayInReverse() {
		System.out.print("All elements (reverse): ");
		for(int i = numberOfElements - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}