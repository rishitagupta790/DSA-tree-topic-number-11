package com.in.tree4;

public class DuplicateNumber {
	public static int findDuplicate(int[] nums) {
		int tortoise = nums[0];
		int hare = nums[0];

		// Phase 1: Find the intersection point of the two pointers
		do {
			tortoise = nums[tortoise];
			hare = nums[nums[hare]];
		} while (tortoise != hare);

		// Phase 2: Find the entrance of the cycle
		int ptr1 = nums[0];
		int ptr2 = tortoise;
		while (ptr1 != ptr2) {
			ptr1 = nums[ptr1];
			ptr2 = nums[ptr2];
		}

		return ptr1;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, 4, 2, 2 };
		int duplicateNumber = findDuplicate(nums);
		System.out.println("Duplicate number: " + duplicateNumber);
	}

}
