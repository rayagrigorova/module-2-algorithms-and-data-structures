package Generics;

public class CircleCompare extends GeometricObjectCompare{
	private double radius;
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	CircleCompare(){
		radius = 1;
	}
	
	CircleCompare(double radius){
		this.radius = radius;
	}
	
	public double getArea() {
		return (Math.round(Math.PI * radius * radius * 100.0) / 100.0);
	}

	@Override
	 public String toString() {
		return " Area: " + this.getArea();
		 
	 }

}
