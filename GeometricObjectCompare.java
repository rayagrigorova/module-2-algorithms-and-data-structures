package Generics;

public abstract class GeometricObjectCompare implements Comparable<GeometricObjectCompare> {

	@Override
	public int compareTo(GeometricObjectCompare o) {
		if(this.getArea() > ((GeometricObjectCompare) o).getArea()) {
			return 1;
		}
		if(this.getArea() == ((GeometricObjectCompare) o).getArea()) {
			return 0;
		}
		return -1;
	}
	
	public abstract double getArea();
	
	public static GeometricObjectCompare max(GeometricObjectCompare x, GeometricObjectCompare y) {
		//if both are equal, then it returns the first one.
		if(x.compareTo(y) == 1 || x.compareTo(y) == 0) return x;	
		return y;
	}

}
