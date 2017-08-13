
public class Rectangle {
	
	/**
	 * 
	 * @className Rectangle
	 * @class CSCI 150L
	 * @programmer Anthony Rabon
	 * @lastRevised 9-28-16
	 *
	 */
	
	private int length;
	private int width;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public int getLength(){
		return length;
	}
	
	public int getWidth(){
		return width;
	}
	
	public int area(){
		return length*width;
	}

}
