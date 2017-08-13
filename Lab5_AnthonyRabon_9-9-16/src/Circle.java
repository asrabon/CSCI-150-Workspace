
public class Circle {
	
	private double radius;
	
	public Circle(double r) {
		radius = r;
	}
	
	public Circle() {
		radius = 0.0;
	}
	
	public void setRadius(double r) {
		radius = r;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea () {
		return(Math.PI * (radius * radius));
	}
	
	public double getCircumference () {
		return (2.00 * Math.PI * radius);
	}

}
