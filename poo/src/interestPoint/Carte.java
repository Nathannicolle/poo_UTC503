package interestPoint;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Carte {
	private Point topLeft;
	private Point bottomRight;
	private Map<String, Point> namedPoints; 
	private List<Lieu> lieuOfType;
	
	public Carte(Point pointTopLeft, Point pointBottomRight) {
		topLeft = pointTopLeft;
		bottomRight = pointBottomRight;
		this.namedPoints = new HashMap<>();
	}
	
	public Carte(int top, int left, int bottom, int right) {
		this(new Point(top, left), new Point(bottom, right));
		// Ajoute les points (version plus longue :
		/*this.topLeft = new Point(top, left);
		this.bottomRight = new Point(bottom, right);*/
	}
	
	public boolean addNamedPoint(String name, int x, int y) {
		if(!this.namedPoints.containsKey(name)) {
			namedPoints.put(name, new Point(x, y));
			return true;
		}
		return false;
	}
}
