package io.firstproject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	@Test
	void test() {
	@SuppressWarnings("unused")
	MyMathTest mymathtest = new MyMathTest();
	int expected = 2;
	int actual = MyMath.MyAdd(1,1);
	assertEquals(expected, actual);
	}

	@SuppressWarnings("unused")
	private int MyAdd(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
