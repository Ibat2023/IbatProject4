package stubMaven;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyMathAdd {

	@Test
	public void testAdd1() {
		MyMath math = new MyMath();
		int result = math.myAdd(5, 5);
		assertEquals(10, result);
	}
	
	@Test
	public void testAdd2() {
		MyMath math = new MyMath();
		int result = math.myAdd(4, 4);
		assertEquals(8, result);
		
		
}
	
	@Test
	public void testAdd3() {
		MyMath math = new MyMath();
		int result = math.myAdd(3, 3);
		assertEquals(6, result);
		
		
}
	
	@Test
	public void testAdd4() {
		MyMath math = new MyMath();
		int result = math.myAdd(52, 5);
		assertEquals(57, result);
		
		
		
}
	
	@Test
	public void testAdd5() {
		MyMath math = new MyMath();
		int result = math.myAdd(16, 16);
		assertEquals(32, result);
}

	
	

}
