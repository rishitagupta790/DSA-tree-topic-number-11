package com.in.tree1;

public class FindingSquare {

	public static void main(String[] args) {
		int x = 8;
		int result = mySqrt(x);
		System.out.println("Square root of " + x + ": " + result);
	}

	public static int mySqrt(int x) {
		if (x == 0) {
			return 0;
		}

		long sqrt = x;
		while (sqrt * sqrt > x) {
			sqrt = (sqrt + x / sqrt) / 2;
		}

		return (int) sqrt;
	}
}
