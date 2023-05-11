package stubMaven;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyMathTestSubtract {

	@Test
	public void testSubtract1() {
		MyMath math = new MyMath();
		int result = math.mySubtract(10, 5);
		assertEquals(5, result);
	}
	
	@Test
	public void testSubtract2() {
		MyMath math = new MyMath();
		int result = math.mySubtract(15, 5);
		assertEquals(10, result);
		
	}
	
	@Test
	public void testSubtract3() {
		MyMath math = new MyMath();
		int result = math.mySubtract(20, 5);
		assertEquals(15, result);
	
	}
	
	@Test
	public void testSubtract4() {
		MyMath math = new MyMath();
		int result = math.mySubtract(80, 20);
		assertEquals(60, result);
		
	}
	
	@Test
	public void testSubtract5() {
		MyMath math = new MyMath();
		int result = math.mySubtract(66, 16);
		assertEquals(50, result);
		
	}

}
