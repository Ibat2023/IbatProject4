package stubMaven;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyMathTestDivide {

	@Test
	public void testDivide() {
		MyMath math = new MyMath();
		int result = math.myDivide(10, 5);
		assertEquals(2, result);
		
	}

}
