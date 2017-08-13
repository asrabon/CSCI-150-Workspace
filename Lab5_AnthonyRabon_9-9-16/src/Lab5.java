
public class Lab5 {

	public static void main (String[] args) {
		Circle circle1 = new Circle();
		System.out.println("Circle 1 radius: " + circle1.getRadius());
		circle1.setRadius(2.0);
		System.out.println("Circle 1 area: " + circle1.getArea());
		Circle circle2 = new Circle(10.0);
		System.out.println("Circle 2 circumference: " + circle2.getCircumference());
	}
	
}
