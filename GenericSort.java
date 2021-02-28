package Generics;

import java.util.ArrayList;
import java.util.Random;

public class GenericSort {
	public static void main(String[] args) {

// Create an Integer array
		Integer[] intArray = { new Integer(2), new Integer(4), new Integer(3) };
// Create a Double array
		Double[] doubleArray = { new Double(3.4), new Double(1.3), new Double(-22.1) };
// Create a Character array
		Character[] charArray = { new Character('a'), new Character('J'), new Character('r') };
// Create a String array
		String[] stringArray = { "Tom", "Susan", "Kim" };
		
//Create a geometric object array
		GeometricObjectCompare[] geometricArray = {new CircleCompare(34), new CircleCompare(2), new CircleCompare(44), new CircleCompare(10), new CircleCompare(1),
				new RectangleCompare(10, 5), new RectangleCompare(2, 6), new RectangleCompare(73, 3), new RectangleCompare(12, 3)
		};

//Sort the arrays
		sort(intArray);
		sort(doubleArray);
		sort(charArray);
		sort(stringArray);
		
		sort(geometricArray);
// Display the sorted arrays
		System.out.print("Sorted Integer objects: ");
		printList(intArray);
		System.out.print("Sorted Double objects: ");
		printList(doubleArray);
		System.out.print("Sorted Character objects: ");
		printList(charArray);
		System.out.print("Sorted String objects: ");
		printList(stringArray);
		
		System.out.print("Sorted geometric objects: ");
		printList(geometricArray);

		
//Problem 2
		System.out.print("\n\n");
		ArrayList<GeometricObjectCompare> geometricArrayList = new ArrayList <GeometricObjectCompare>();
		geometricArrayList.add(new CircleCompare(2));
		geometricArrayList.add(new CircleCompare(37));
		geometricArrayList.add(new CircleCompare(84));
		geometricArrayList.add(new CircleCompare(12));
		geometricArrayList.add(new CircleCompare(1));
		geometricArrayList.add(new CircleCompare(25));
		System.out.println(geometricArrayList.toString());
		shuffle(geometricArrayList);
		System.out.println("Shuffled: " + geometricArrayList.toString());
		sort(geometricArrayList);
		System.out.println("Sorted:" + geometricArrayList.toString());
		System.out.println("Min: " + min(geometricArrayList));
		
		System.out.print("\n\n");
		geometricArrayList.add(new RectangleCompare(3, 6));
		geometricArrayList.add(new RectangleCompare(31, 1));
		geometricArrayList.add(new RectangleCompare(23, 5));
		geometricArrayList.add(new RectangleCompare(82, 45));
		geometricArrayList.add(new RectangleCompare(1, 5));
		geometricArrayList.add(new RectangleCompare(25, 2));
		geometricArrayList.add(new RectangleCompare(24, 23));
		System.out.println(geometricArrayList.toString());
		shuffle(geometricArrayList);
		System.out.println("Shuffled: " + geometricArrayList.toString());
		sort(geometricArrayList);
		System.out.println("Sorted:" + geometricArrayList.toString());
		System.out.println("Min: " + min(geometricArrayList));
		
	}
	
	
	public static <E extends Comparable<E>> void sort(E[] list) {
		E currentMin;
		int currentMinIndex;

		for (int i = 0; i < list.length - 1; i++) {
			currentMin = list[i];
			currentMinIndex = i;
			for (int j = i + 1; j < list.length; j++) {
				if (currentMin.compareTo(list[j]) > 0) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}

// Swap list[i] with list[currentMinIndex] if necessary;
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}

	/** Print an array of objects */
	public static void printList(Object[] list) {
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
		System.out.println();
	}


	public static <E> void shuffle(ArrayList<E> list) {
		Random r = new Random();
		int newIndex; 
		E temp;
		for(int i = 0; i < list.size(); i++) {
			//Chooses a random number from 0 to list.size() - 1
			newIndex = r.nextInt(list.size());
			
			//We remember the element at i
			temp = list.get(i);
			//We set the element at i to the one at newIndex
			list.set(i, list.get(newIndex));
			//We set the element at newIndex to temp that stores the value of the old i
			list.set(newIndex, temp);

		}
		
	}
	public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
		E temp;
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - i - 1; j++) {
				//If the previous is smaller 
				if(list.get(j).compareTo(list.get(j + 1)) > 0) {
					temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}
		
	}

	public static <E extends Comparable<E>> E min(ArrayList<E> list) {
		E min = list.get(0);
		for(int i = 1; i < list.size(); i++) {
			//This returns > 0 if s1 > s2
			if(min.compareTo(list.get(i)) > 0) {
				min = list.get(i);
			}
		}
		return min;
		
	}
}
