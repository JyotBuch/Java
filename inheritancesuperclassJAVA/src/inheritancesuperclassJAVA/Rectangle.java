package inheritancesuperclassJAVA;

public class Rectangle {
	double length;
	double breadth;
	
	public Rectangle(double l,double b) {
		length = l;
		breadth =b;
	}
	
	public void getArea() {
		System.out.println("Area is :"+(length*breadth));
	}
	
	public void getPerimeter() {
		System.out.println("Perimeter is:" +2*(length+breadth));
	}
}

