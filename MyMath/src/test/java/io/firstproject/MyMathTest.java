package io.firstproject;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyMathTest {

	@Test
	public void testAddPass() {
		int expected = 2;
		int actual = MyMath.MyAdd(1,1);
		assertEquals(expected, actual);
	}

	@Test
	public void testSubtractPass() {
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
	
	//1. 

	@Test 
	public void testAddErrorFail() {
	assertEquals(4, MyMath.MyAdd(1,2),
	"Error in add");
	}
	
	//2. add
	@Test 
	void testAddingTwoPositivesPass() {
		assertEquals(2, MyMath.MyAdd(1, 1), 
				"Add method should return the sum of two numbers");
	}
	
	//3. add
	@Test 
	void testAddingTwoNegativesPass() {
		assertEquals(-2, MyMath.MyAdd(-1, -1), 
				"Add method should return the sum of two numbers");
	}
	
	public void testAddErrorTwoNegativesInt() {
		assertEquals(-4, MyMath.MyAdd(-1,-2),
		"Error in add");
		}
	//4. add
	@Test
	void testAddingAPositiveAndANegativePass() {
		assertEquals(0, MyMath.MyAdd(-1, 1), 
				"Add method should return the sum of two numbers");
		
	}
	//5.add
	
	@Test
	void testAddingAPositiveAndAZeroPass() {
		assertEquals(1, MyMath.MyAdd(1, 0), 
				"Add method should return the sum of two numbers");
	}
 //6. multiply 
	
	@Test 
	public void testMultiplyErrorFail() {
	assertEquals(6, MyMath.multiply(2,2),
	"Error in multiply");
	}
	
	//7. multiply
	@Test 
	void testMultiplyWithZeroPass() {
		assertEquals(0, MyMath.multiply(1, 0),
				"Multiply method should return 0");
	}
	
	//8. multiply
	@Test 
	void testMultiplyPositiveAndNegativePass() {
		assertEquals(-1, MyMath.multiply(-1, 1),
			"Multiply method should return -1");
	}
	
	//9. multiply
	@Test 
	public void testMultiplyErrorPositiveAndNegatiVeIntFAil() {
	assertEquals(6, MyMath.multiply(2,-2),
	"Error in multiply");
		}
	
	//10. multiply
	@Test 
	void testMultiplyPossitiveIntPass() {
		assertEquals(6, MyMath.multiply(2, 3),
				"Multiply method should return the multiplication of two numbers");
	}

	//11.  multiply
   static void InvalidOperationMultyply(String[] args) throws Exception
    {
        int result = MyMath.multiply(6, 6);

        if (result != 31)
            throw new Exception();
    }
	
	//12 divide
	@Test 
	public void testDivideTwoPossitiveIntErrorFail() {
	assertEquals(6, MyMath.divide(6,2),
	"Error in divide");
		}
	//13 divide
	@Test 
	public void testDivideErrorFail() {
	assertEquals(3, MyMath.divide(2,2),
	"Error in subtract");
	}
	
	//14
	@Test
	   public void testDivideIntPass() {
	      assertEquals("error in divInt()", 3, MyMath.divInt(9, 3));
	      assertEquals("error in divInt()", 0, MyMath.divInt(1, 9));
	   }


	//15 divide
	@Test 
	void testDivideTwoPositivesPass() {
		assertEquals(2, MyMath.divide(10, 5), 
				"Subtract method should return possitive number");
	}
	
	//16 divide
	@Test 
	void testDivideTwoNegativesPass() {
		assertEquals(2, MyMath.divide(-10, -5), 
				"Subtract method should return possitive number");
	}
	
	//17 subtract
	
	@Test 
	public void testSubtractTwoPossitiveIntErrorFail() {
	assertEquals(6, MyMath.subtract(6,2),
	"Error in subtract");
	}
	
	//18 subtract
	@Test 
	void testSubtractTwoPositivesPass() {
		assertEquals(2, MyMath.subtract(3, 1), 
				"Subtract method should return 2");
	}
	
	//19 subtract
	@Test 
	void testSubtractTwoNegativesFail() {
		assertEquals(2, MyMath.subtract(-1, -1), 
				"Subtract method should return the subtract of two negative numbers");
	}
	
	//20 subtract
	@Test
	void testSubtractAPositiveAndANegativePass() {
		assertEquals(2, MyMath.subtract(1, -1), 
				"Subtract method should return the subtract of two numbers");
		
	}
	//21 subtract
	
	@Test
	void testSubtractAPositiveAndAZeroPass() {
		assertEquals(2, MyMath.subtract(2, 0), 
				"Add method should return the sum of two numbers");
}
}	





