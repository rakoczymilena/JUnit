package io.firstproject;

import java.util.Scanner;

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
		return a/b;
	}

Scanner in = new Scanner(System.in);

	public static int divInt(int a, int b) {
			if ( b == 0) {
			    throw new IllegalArgumentException("Number can not be divide by 0!");
			      }
			      	return a /  b;
			      	}

	
}
	







