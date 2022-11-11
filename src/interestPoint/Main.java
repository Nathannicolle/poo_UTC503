package interestPoint;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Point p = new Point(2, 5);
		System.out.println(p);
		System.out.println(p.distance(new Point(9, 2)));
		
		Lieu l = new Lieu("Caensup", 1, 2);
		System.out.println(l);
		System.out.println(l.equals(new Lieu("Caensup", 0, 0)));
		
		TypeLieu t = new TypeLieu("Gare", "Gare de Caen", 0, 0);
		System.out.println(t);
		
		CarteLieux c = new CarteLieux(0, 0, 50, 100);
		System.out.println(c.pointInMap(new Point(0, 0)));
		/*c.addNamedPoint("Gare de Caen", 0, 0);
		System.out.println(c.getPoints());
		List<Lieu> myList = new ArrayList<Lieu>();
		myList.add(new Lieu("Gare", 0, 0));
		myList.add(new Lieu("Port", 5, 5));
		c.setPoints(myList);
		System.out.println(c.getPoints());*/
		// System.out.println(c.searchPoints("gare"));
	}

}
