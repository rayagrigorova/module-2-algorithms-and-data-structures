package Recursion;
import javax.swing.JFrame;

public class SierpinskiTestProgram {
// a) According to Wikipedia:
//The Sierpinski triangle may be constructed from an equilateral triangle by repeated removal of triangular subsets:

//Start with an equilateral triangle.
//Subdivide it into four smaller congruent equilateral triangles and remove the central triangle.
//Repeat step 2 with each of the remaining smaller triangles infinitely.

	public static void main(String[] args) {
		SierpinskiTriangleFrame frame = new SierpinskiTriangleFrame();
		frame.setSize(400, 400);
		frame.setTitle("TestFigurePanel");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
