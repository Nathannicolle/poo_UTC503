package interestPoint;

public class Point {
	private int x;
	private int y;
	private static int nbPoints;
	
	// Constructeur
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		nbPoints++;
	}

	// Getters and Setters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public float distance(Point autrePoint) {
		float distance = (float) Math.sqrt(Math.pow(x - autrePoint.getX(), 2) + Math.pow(y - autrePoint.getY(), 2)); 
		return distance;
	}
	
	public static int getNbPoints() {
		return nbPoints;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Coordonnées : (" + x + "," + y + ")";
	}
}
