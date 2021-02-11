package Recursion;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;
import java.util.Random;

import javax.swing.JPanel;

public class SierpinskiTrianglePanel extends JPanel {
		//The order is like the number of divisions 
		private int order = 0;	
		
		//Number of angles of a triangle
		private static int n = 3;
		private static Polygon p;
		private static int [] xArray;
		private static int [] yArray;
		private static Color randomColor;
		//The value added to the color when we change it 
		private static int dif = 5;

		/** Set a new order */
		public void setOrder(int order) {
			this.order = order;
			repaint();
		}
		public int getOrder() {
			return this.order;
		}

//		@Override
//		b) The method paintComponent(Graphics g) is overridden so we can draw our triangles. 
		protected void paintComponent(Graphics g) {
			
//			"Further, if you do not invoke super's
//			implementation you must honor the opaque property, that
//			is if this component is opaque,
//			you must completely fill in the background in an opaque color.
//			If you do not honor the opaque property you will likely see visual artifacts."
			
//			Basically, if we don't invoke super.paintComponent(g), we will see weird, unexpected things on the screen. Unless we fill the background.
			
			super.paintComponent(g);
			
//			 Select three points in proportion to the panel size
			
//			d) The starting points are the points of the biggest triangle possible (when order = 0)
			//Top point 
			Point p1 = new Point(getWidth() / 2, 10);
			//Left point 
			Point p2 = new Point(10, getHeight() - 10);
			//Right point 
			Point p3 = new Point(getWidth() - 10, getHeight() - 10);
			
			setRandomColor();
			
			displayTriangles(g, order, p1, p2, p3);
			
//			c) 
//			According to Oracle, "paint() invokes paintComponent()."
			
//			"To understand how AWT's painting API works, helps
//			to know what triggers a paint operation in a windowing environment.
//			In AWT, there are two kinds of painting operations: system-triggered 
//			painting, and application-triggered painting. 
		
//			In a system-triggered painting operation, the system requests a component to render its contents, usually for one of the following reasons:
//			-The component is first made visible on the screen.(...)In an application-triggered painting operation, the component decides it needs
//			to update its contents because its internal state has changed.(For example,. a button detects that a mouse button has been
//			pressed and determines that it needs to paint a "depressed" button visual)."
			
//			Basically, paint() invokes paintComponent() and paint() is triggered by the system when the component is
//			first made visible on the screen. Then, we have application-triggered painting in setOrder(int order) - repaint()

		}

		private static void displayTriangles(Graphics g, int order, Point p1, Point p2, Point p3) {
			
//			e) We start drawing once order = 0 
//			Top point - p1 
//			Left point - p2 
//			Right point - p3 

//			First, displayTriangles(g, order - 1, p1, p12, p31) (top triangle) is called. Then displayTriangles(g, order - 1, p12, p2, p23) (left)
//			and displayTriangles(g, order - 1, p31, p23, p3) (right). So, drawing is done top - left - right 
//			If the sub-triangle thing we have at the top needs to be divided as well, we draw top - left - right again.

//			The drawing is done once for order = 0, 3 times for order = 1 and 9 for order = 2. 
//			So, the formula is:
//			number of triangles = 3^(order) (3^0 = 1, 3^1 = 3, 3^2 = 9)
//			NOTE THAT WE DONT DRAW THE MIDDLE TRIANGLES they just happen when we draw the smaller ones 
			
			if (order == 0) {
				// Draw a triangle to connect three points
				g.drawLine(p1.x, p1.y, p2.x, p2.y);
				g.drawLine(p1.x, p1.y, p3.x, p3.y);
				g.drawLine(p2.x, p2.y, p3.x, p3.y);
				
				xArray = new int[]{p1.x, p2.x, p3.x};
				yArray = new int[]{p1.y, p2.y, p3.y};
				
				p = new Polygon (xArray, yArray, n);
				brighten();
				g.setColor(randomColor);
				g.fillPolygon(p);
				System.out.println("r: " + randomColor.getRed() + " g: " + randomColor.getGreen() + " b: " + randomColor.getBlue());
			} else {
				// Get the midpoint on each edge of the triangle
				Point p12 = midpoint(p1, p2);
				Point p23 = midpoint(p2, p3);
				Point p31 = midpoint(p3, p1);
				// Recursively display three triangles
				displayTriangles(g, order - 1, p1, p12, p31);
				displayTriangles(g, order - 1, p12, p2, p23);
				displayTriangles(g, order - 1, p31, p23, p3);
			}
		}

		private static Point midpoint(Point p1, Point p2) {
			return new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
		}
		
		public Color getRandomColor() {
			return randomColor;
		}
		public static void setRandomColor() {
			Random rand = new Random();
			
			int r = rand.nextInt(256);
			int g = rand.nextInt(256);
			int b = rand.nextInt(256);
			
			randomColor = new Color(r, g, b);
		}
		
		public static void brighten() {
			Random rand = new Random();
			//So it's easier to create a new color
			int r = randomColor.getRed(), g = randomColor.getGreen(), b = randomColor.getBlue();
			
			// If the main color is red, we can brighten it without changing the actual color by adding
			// numbers to green and blue
			if (r >= g && r >= b) {
				//If after adding dif the number for g is >= 255 , we choose a new color. Else, we add dif to g
				g = ((g + dif) >= 255) ?  g - rand.nextInt(20) : g + dif;
				b = ((b + dif) >= 255) ?  b - rand.nextInt(20) : b + dif;
			}
			else if (g >= b && g >= r) {
				r = ((r + dif) >= 255) ?  r - rand.nextInt(20) : r + dif;
				b = ((b + dif) >= 255) ? b - rand.nextInt(20) : b + dif;
			}
			else {
				g = ((g + dif) >= 255) ? g - rand.nextInt(20) : g + dif;
				r = ((r + dif) >= 255) ?  r - rand.nextInt(20) : r + dif;
			}
			//Otherwise it gets too pink
			if(r > 200 && g > 200 && b > 200) {
				setRandomColor();
				return;
			}
			
			randomColor = new Color (r, g, b);

		}

	}

