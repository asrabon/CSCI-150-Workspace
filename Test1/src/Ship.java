
public class Ship {
	
	private String shipName;
	private int yearBuilt;
	
	public Ship(String s, int year) {
		setShipName(s);
		setYearBuilt(year);
	}

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String s) {
		shipName = s;
	}

	public int getYearBuilt() {
		return yearBuilt;
	}

	public void setYearBuilt(int year) {
		yearBuilt = year;
	}
	
	public String toString() {
		return("Ship Name: " + shipName + "\n" + "Year built: " + yearBuilt + "\n");
	}

}
