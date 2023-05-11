package stubMaven;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyMathTestDivide {

	@Test
	public void testDivide1() {
		MyMath math = new MyMath();
		int result = math.myDivide(10, 5);
		assertEquals(2, result);
		
	}
	
	public void testDivide2() {
		MyMath math = new MyMath();
		int result = math.myDivide(20, 2);
		assertEquals(10, result);
		
	}

	public void testDivide3() {
		MyMath math = new MyMath();
		int result = math.myDivide(100, 5);
		assertEquals(20, result);
		
	}

	public void testDivide4() {
		MyMath math = new MyMath();
		int result = math.myDivide(50, 10);
		assertEquals(5, result);
		
	}

	public void testDivide5() {
		MyMath math = new MyMath();
		int result = math.myDivide(14, 2);
		assertEquals(7, result);
		
	}


}
