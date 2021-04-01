package aggregationJAVA;

public class Circle {
	double pi=3.14;
	Operation op;
	
	double area(double radius) {
		op = new Operation();
		double rsq = op.Square(radius);
		return pi*rsq;
	}
}
