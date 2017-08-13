
public class Box extends Rectangle {
	
	/**
	 * 
	 * @className Box
	 * @class CSCI 150L
	 * @programmer Anthony Rabon
	 * @lastRevised 9-28-16
	 *
	 */

	private int height;
	
	public Box(int length, int width, int height) {
		super(length, width);
		this.height = height;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int area() {
		return((2 * super.getLength() * super.getWidth()) + (2 * super.getLength() * height) + (2 * super.getWidth() * height));
	}
	
	public int volume() {
		return (super.getLength() * super.getWidth() * height);
	}
	
}
