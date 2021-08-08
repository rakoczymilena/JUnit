package io.firstproject;

import org.junit.jupiter.api.Test;

public class MyMath {

	public static int MyAdd(int a, int b) {
		return a+b;
	}

	public static int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;

	}

	public static int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	public static int divide(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}


	public static int divInt(int a, int b) {
			if ( b == 0) {
			    throw new IllegalArgumentException("Cannot divide by 0!");
			      }
			      	return a /  b;
			   }
}






