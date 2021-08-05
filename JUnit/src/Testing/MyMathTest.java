package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	 public void testAdd() {
	  int result = calc.add(10, 20);
	  assertEquals(30, result, 0);
	 }

	 @Test
	 public void testSubtract() {
	  int result = calc.subtract(100, 90);
	  assertEquals(10, result, 0);
	 }

	 @Test
	 public void testMultiply() {
	  int result = calc.multiply(2, 100);
	  assertEquals(200, result, 0);
	 }

	 @Test
	 public void testDivide() {
	  int result = calc.divide(100, 10);
	  assertEquals(10, result, 0);
	  
	 }
	 
}



