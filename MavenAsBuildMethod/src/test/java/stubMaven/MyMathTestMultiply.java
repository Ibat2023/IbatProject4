package stubMaven;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyMathTestMultiply {

	@Test
	public void testMultiply1() {
		MyMath math = new MyMath();
		int result = math.myMultiply(5, 5);
		assertEquals(25, result);
		
	}

	@Test
	public void testMultiply2() {
		MyMath math = new MyMath();
		int result = math.myMultiply(10, 5);
		assertEquals(50, result);
	
		
	}
	
	@Test
	public void testMultiply3() {
		MyMath math = new MyMath();
		int result = math.myMultiply(100, 5);
		assertEquals(500, result);
		
	}
	
	@Test
	public void testMultiply4() {
		MyMath math = new MyMath();
		int result = math.myMultiply(21, 5);
		assertEquals(105, result);
		
	}
	
	@Test
	public void testMultiply5() {
		MyMath math = new MyMath();
		int result = math.myMultiply(1, 5);
		assertEquals(5, result);
		
	}
}
