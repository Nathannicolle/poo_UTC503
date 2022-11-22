package fr.caensup.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import interestPoint.CarteLieux;
import interestPoint.Point;

class TestCartLieux {
	private CarteLieux carte;
	
	@BeforeEach
	void setup() throws Exception {
		carte = new CarteLieux(0, 0, 100, 50);
	}
	
	@Test
	void testPointInMap() {
		assertFalse(carte.pointInMap(new Point(105, 10)));
		assertTrue(carte.pointInMap(new Point(99, 10)));
		assertTrue(carte.pointInMap(new Point(100, 50)));
		assertTrue(carte.pointInMap(new Point(0, 0)));
	}
	
	@Test
	void testAddNamedPoint() {
		assertEquals(0, carte.getPoints().size());
		carte.addNamedPoint("Le port", 0, 0);
		assertEquals(1, carte.getPoints().size());
		carte.addNamedPoint("Le port", 10, 10);
		assertEquals(1, carte.getPoints().size());
		assertFalse(carte.addNamedPoint("Le port", 10, 10));
		assertFalse(carte.addNamedPoint("Tour Leroy", 105, 10));
		assertTrue(carte.addNamedPoint("Tour Leroy", 98, 10));
		assertFalse(carte.addNamedPoint("Tour Leroy", 10, 10));
	}

}
