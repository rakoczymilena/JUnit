package io.firstproject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyMathTest {

	@Test
	void testAdd() {
		int expected = 2;
		int actual = MyMath.MyAdd(1,1);
		assertEquals(expected, actual);
	}

	@Test
	public void testSubtract() {
	int a = 10; int b = 5; 
	int expectedResult = 5; 
	int result = MyMath.subtract(a, b);
	Assertions.assertEquals(expectedResult, result);
	}
	@Test
	public void testMultiply() {
	int a = 10; int b = 10;
	int expectedResult = 100;
	int result = MyMath.multiply(a, b);
	Assertions.assertEquals(expectedResult, result);
	}

	@Test
	public void testDivide() {
	int a = 50; int b = 10; 
	int expectedResult = 5; 
	int result = MyMath.divide(a, b);
	Assertions.assertEquals(expectedResult, result); 
	}




//20 Test cases 
	
	//1. add output expected: testAdd(demo.MathTest): expected:<8> but was:<3> false

	@Test 
	public void testAdd1() {
	int result = mathDemo.add(5,3);
	assertEquals(result,3);
	}
	
	//2. add
	@Test 
	void testAddingTwoPositives() {
		assertEquals(2, MyMath.add(1, 1), 
				"Add method should return the sum of two numbers");
	}
	
	//3. add
	@Test 
	void testAddingTwoNegatives() {
		assertEquals(-2, MyMath.add(-1, -1), 
				"Add method should return the sum of two numbers");
	}
	
	//4. add
	@Test
	void testAddingAPositiveAndANegative() {
		assertEquals(0, MyMath.add(-1, 1), 
				"Add method should return the sum of two numbers");
	}
 //5. multiply -4 tests
	@Test 
	void testMultiplyWithZero() {
		assertEquals(0, MyMath.multiply(1, 0),
				"Multiply method should return 0");
	}
	
	@Test 
	void testMultiplyPositiveAndNegative() {
		assertEquals(1, MyMath.multiply(-1, 1),
			"Multiply method should return -1");
	}
	@Test 
	void testMultiplyPossitiveInt() {
		assertEquals(6, MyMath.multiply(2, 3);
				"Multiply method should return the multiplication of two numbers");
	}

 //6.
	@Test
	void testDivideZero() {
	assertThrows(ArithmeticException.class, () -> MyMath.divide(1, 0), 
			"Divide should throw ArithmeticException when denominator is zero");
}

}
	





