import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JComponent;


/**
 * 
 * @className RectangleComponent
 * @class CSCI 150
 * @programmer Anthony Rabon
 * @lastRevised 10-10-16
 *
 *This class is used to create the car object that can be moved around
 */

	public class RectangleComponent extends JComponent {
	
	//final integer values that will be used to set the size of the car
	private static final int RECTANGLE_WIDTH = 200;
	private static final int RECTANGLE_HEIGHT = 75;
	
	//creates variables that will be used in the car object
	private int xLeft;
	private int yTop;
	
	/**
	 * 
	 * @param xPos x coordinate the car object will be placed at
	 * @param yPos y coordiante the car object will be placed at
	 * 
	 * Constructor that sets the position the car object will be painted at
	 */
	public RectangleComponent(int xPos, int yPos) {
		xLeft = xPos;
		yTop = yPos;
	}
	
	/**
	 * paints the car object out on the GUI Frame
	 */
	public void paintComponent(Graphics g) {
		//sets the color of the car body to red and paints the car body
		g.setColor(Color.RED);
		g.fillRect(xLeft, yTop, RECTANGLE_WIDTH, RECTANGLE_HEIGHT);
		//sets the color of the tires of the car to black and paints two tires on the car
		g.setColor(Color.BLACK);
		g.fillOval(RECTANGLE_WIDTH + xLeft - 60, yTop + RECTANGLE_HEIGHT - 20, 50, 50);
		g.fillOval(xLeft + 20, yTop + RECTANGLE_HEIGHT - 20 , 50, 50);
		//creates a polygon object which represents the top of the car and paints it on the car
		Polygon p = new Polygon();
		p.addPoint(xLeft + 25, yTop);
		p.addPoint(xLeft + 50, yTop - 40);
		p.addPoint(xLeft + 150, yTop - 40);
		p.addPoint(xLeft + 175, yTop);
		g.fillPolygon(p);
		//sets the color of the rims of the car to gray and paints the two rims on the car's tires
		g.setColor(Color.GRAY);
		g.fillOval(RECTANGLE_WIDTH + xLeft - 55, yTop + RECTANGLE_HEIGHT - 15, 40, 40);
		g.fillOval(xLeft + 25, yTop + RECTANGLE_HEIGHT - 15 , 40, 40);
	}
	
	/**
	Moves the car by a given amount.
	@param dx the amount to move in the x-direction
	@param dy the amount to move in the y-direction
	*/
	public void moveRectangleBy(int dx, int dy) {
	xLeft = xLeft + dx;
	yTop = yTop + dy;
	repaint();//calls the paintComponent method again to repaint the car with the new x and y coordinates
	}
	
	/**
	 * return the x coordiante that the car is currently located at to see if the car is at the end of the window
	 */
	public int getX() {
		return xLeft;
	}
	
	/**
	 * return the y coordiante that the car is currently located at to see if the car is at the end of the window
	 */
	public int getY() {
		return yTop;
	}
	
}
