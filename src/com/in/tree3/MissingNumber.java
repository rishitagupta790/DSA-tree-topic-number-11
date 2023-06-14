package com.in.tree3;

public class MissingNumber {
	public static int findMissingNumber(int[] nums) {
		int missingNumber = nums.length;

		for (int i = 0; i < nums.length; i++) {
			missingNumber ^= i ^ nums[i];
		}

		return missingNumber;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 0, 1 };
		int missingNumber = findMissingNumber(nums);
		System.out.println("Missing number: " + missingNumber);
	}

}
