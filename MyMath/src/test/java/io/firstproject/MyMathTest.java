package io.firstproject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyMathTest {

	@Test
	public void testAdd() {
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
	
	//1. 

	@Test 
	public void testAddError() {
	assertEquals(4, MyMath.MyAdd(1,2),
	"Error in add");
	}
	
	//2. add
	@Test 
	void testAddingTwoPositives() {
		assertEquals(2, MyMath.MyAdd(1, 1), 
				"Add method should return the sum of two numbers");
	}
	
	//3. add
	@Test 
	void testAddingTwoNegatives() {
		assertEquals(-2, MyMath.MyAdd(-1, -1), 
				"Add method should return the sum of two numbers");
	}
	
	public void testAddErrorTwoNegativesInt() {
		assertEquals(-4, MyMath.MyAdd(-1,-2),
		"Error in add");
		}
	//4. add
	@Test
	void testAddingAPositiveAndANegative() {
		assertEquals(0, MyMath.MyAdd(-1, 1), 
				"Add method should return the sum of two numbers");
		
	}
	//5.add
	
	@Test
	void testAddingAPositiveAndAZero() {
		assertEquals(1, MyMath.MyAdd(1, 0), 
				"Add method should return the sum of two numbers");
	}
 //6. multiply 
	
	@Test 
	public void testMultiplyError() {
	assertEquals(6, MyMath.multiply(2,2),
	"Error in multiply");
	}
	
	//7. multiply
	@Test 
	void testMultiplyWithZero() {
		assertEquals(0, MyMath.multiply(1, 0),
				"Multiply method should return 0");
	}
	
	//8. multiply
	@Test 
	void testMultiplyPositiveAndNegative() {
		assertEquals(1, MyMath.multiply(-1, 1),
			"Multiply method should return -1");
	}
	
	//9. multiply
	@Test 
	public void testMultiplyErrorPositiveAndNegatiVeInt() {
	assertEquals(6, MyMath.multiply(2,-2),
	"Error in multiply");
		}
	
	//10. multiply
	@Test 
	void testMultiplyPossitiveInt() {
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
	public void testDivideTwoPossitiveInt() {
	assertEquals(6, MyMath.divide(6,2),
	"Error in divide");
		}
	//13 divide
	@Test 
	public void testDivideError() {
	assertEquals(3, MyMath.divide(2,2),
	"Error in subtract");
	}
	//14 divide
	@Test 
	void testDivideTwoPositives() {
		assertEquals(2, MyMath.divide(10, 5), 
				"Subtract method should return possitive number");
	}
	
	//15 divide
	@Test 
	void testDivideTwoNegatives() {
		assertEquals(2, MyMath.divide(10, 5), 
				"Subtract method should return possitive number");
	}
	
	//16 subtract
	
	@Test 
	public void testSubtractTwoPossitiveInt() {
	assertEquals(6, MyMath.subtract(6,2),
	"Error in subtract");
	}
	
	//17 subtract
	@Test 
	void testSubtractTwoPositives() {
		assertEquals(2, MyMath.subtract(3, 1), 
				"Subtract method should return 2");
	}
	
	//18. subtract
	@Test 
	void testSubtractTwoNegatives() {
		assertEquals(2, MyMath.subtract(-1, -1), 
				"Subtract method should return the subtract of two negative numbers");
	}
	
	//19. subtract
	@Test
	void testSubtractAPositiveAndANegative() {
		assertEquals(0, MyMath.subtract(1, -1), 
				"Subtract method should return the subtract of two numbers");
		
	}
	//20.subtract
	
	@Test
	void testSubtractAPositiveAndAZero() {
		assertEquals(2, MyMath.subtract(2, 0), 
				"Add method should return the sum of two numbers");
}
}	





