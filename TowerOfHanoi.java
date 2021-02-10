package RecursionDemo;
import java.util.Scanner;

public class TowerOfHanoi {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of disks: ");
		int n = input.nextInt();
		// Find the solution recursively
		System.out.println("The moves are:");
		System.out.println("The number of moves is " + moveDisks(n, 'A', 'B', 'C'));
	}

	/**
	 * The method for finding the solution to move n disks from fromTower to toTower
	 * with auxTower
	 */
	public static int moveDisks(int n, char fromTower, char toTower, char auxTower) {
		if (n == 1) { // Stopping condition
			System.out.println("Move disk " + n + " from "+ fromTower + " to " + toTower);
			return 1;
		}
		//The turns needed to move n + 1 discs is n * 2 + 1. For example, if the discs are 3, we will need 7 moves. For 4 discs,
		//we will need 7 * 2 + 1 moves = 15. 
	    moveDisks(n - 1, fromTower, auxTower, toTower);
		System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
		moveDisks(n - 1, auxTower, toTower, fromTower);
		return moveDisks(n - 1, fromTower, toTower, auxTower) * 2 + 1;
	}
}
