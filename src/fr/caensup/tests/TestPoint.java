package fr.caensup.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import interestPoint.Point;

class TestPoint {
	@BeforeEach
	void setup() throws Exception {
	}

	@Test
	void testDistance() {
		Point point1 = new Point(0, 0);
		assertEquals(0, point1.distance(new Point(0, 0)));
		assertEquals(1, point1.distance(new Point(1, 0)));
		assertEquals(1, point1.distance(new Point(0, 1)));
		// On convertit la racine de 2 en float
		assertEquals((float) Math.sqrt(2), point1.distance(new Point(1, 1)));
		assertEquals((float) Math.sqrt(8), point1.distance(new Point(2, 2)));
	}

	@Test
	void testGetNbPoints() {
		assertEquals(0, Point.getNbPoints());
		Point point1 = new Point(0,0);
		assertEquals(1, Point.getNbPoints());
		Point point2 = new Point(1,0);
		assertEquals(2, Point.getNbPoints());
		
		// Code que j'avais fait
		/*Point point1 = new Point(0,0);
		assertEquals(1, point1.getNbPoints());
		Point point2 = new Point(0,0);
		assertEquals(2, point2.getNbPoints());*/
	}

}
