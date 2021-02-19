package Generics;

public abstract class GeometricObjectCompare <E> implements Comparable<E> {

	@Override
	public int compareTo(E o) {
		return(Double.compare(this.getArea(),((GeometricObjectCompare<E>) o).getArea()));
	}
	
	public abstract double getArea();
	
	public static GeometricObjectCompare max(GeometricObjectCompare x, GeometricObjectCompare y) {
		//if both are equal, then it returns the first one.
		if(x.compareTo(y) == 1 || x.compareTo(y) == 0) return x;	
		return y;
	}


//	Променете класа GeometricObject и имплементирайте
//	интерфейса Comparable, който да сравнява лицата на обектите.
//	Тествайте GenericSort с няколко обекта от класа Circle и  Rectangle.
//	Принтирайте сортирания масив. Обърнете внимание, че методът toString() трябва
//	да се overrifde-не в Circle и  Rectangle, за да работи методът printList()

}
