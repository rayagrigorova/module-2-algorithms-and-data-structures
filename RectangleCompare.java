package Generics;

public class RectangleCompare <E> extends GeometricObjectCompare <E> {
	private double x, y;
	
	public RectangleCompare(){
		x = 1;
		y = 1;
	}
	public RectangleCompare(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getArea() {
		return x * y;
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	
	@Override
	 public String toString() {
		return " Area: " + this.getArea();
		 
	 }
	
}
