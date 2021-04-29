import static org.junit.Assert.*;

import org.junit.Test;

public class PointTest {

	private static final int CONST_X = 7;

	@Test
	public void testPoint() {
		Point p = new Point();
		int expected = 0;
		int actual = p.getX();
		assertEquals(expected, actual);
	}

	@Test
	public void testPointIntInt() {
		Point p = new Point(CONST_X, 0);
		int expected = CONST_X;
		int actual = p.getX();
		assertEquals(expected, actual);
	}

	@Test
	public void testPointPoint() {
		Point p = new Point(CONST_X, 0);
		Point x = new Point(p);
		int expected = CONST_X;
		int actual = x.getX();
		assertEquals(expected, actual);
	}

}
