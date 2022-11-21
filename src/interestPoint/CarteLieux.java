package interestPoint;

import java.util.ArrayList;
import java.util.List;

public class CarteLieux {
	private Point topLeft;
	private Point bottomRight;
	private List<Lieu> points;
	private List<Lieu> lieuOfType;
	
	public CarteLieux(Point pointTopLeft, Point pointBottomRight) {
		topLeft = pointTopLeft;
		bottomRight = pointBottomRight;
		this.points = new ArrayList<>();
	}
	
	public CarteLieux(int top, int left, int bottom, int right) {
		this(new Point(top, left), new Point(bottom, right));
		// Ajoute les points (version plus longue :
		/*this.topLeft = new Point(top, left);
		this.bottomRight = new Point(bottom, right);*/
	}
	
	public boolean addNamedPoint(String name, int x, int y) {
		Lieu l = new Lieu(name, x, y);
		if(points.contains(l) || !pointInMap(l)) {
			return false;
		}
		
		return points.add(l);
	}
	
	public boolean pointInMap(Point p) {
		// Full condition : return ((p.getX() >= this.topLeft.getX() && p.getY() >= this.topLeft.getY()) && (p.getX() <= this.bottomRight.getX() && p.getY() >= this.bottomRight.getY()));
		return ((p.getX() >= this.topLeft.getX() && p.getY() >= this.topLeft.getY()) && (p.getX() <= this.bottomRight.getX() && p.getY() <= this.bottomRight.getY()));
	}

	public List<Lieu> getPoints() {
		return points;
	}

	public void setPoints(List<Lieu> points) {
		this.points = points;
	}
	
	public List<Lieu> searchPoints(String type) {
		/*for(Point point : points) {
			TypeLieu place = new TypeLieu(type, "", point.getX(), point.getY());
			if(place.getCaption() == type) {
				lieuOfType.add(place);
			}
		}*/
		return lieuOfType;
	}
}
