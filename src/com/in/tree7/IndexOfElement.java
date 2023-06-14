package com.in.tree7;

public class IndexOfElement {
	public static int[] searchRange(int[] nums, int target) {
		int[] result = { -1, -1 };

		// Find the starting position of the target
		result[0] = binarySearch(nums, target, true);
		if (result[0] == -1) {
			// Target is not found
			return result;
		}

		// Find the ending position of the target
		result[1] = binarySearch(nums, target, false) - 1;

		return result;
	}

	// Binary search helper function
	private static int binarySearch(int[] nums, int target, boolean findStart) {
		int left = 0;
		int right = nums.length - 1;
		int position = -1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (nums[mid] < target) {
				left = mid + 1;
			} else if (nums[mid] > target) {
				right = mid - 1;
			} else {
				// Found the target
				position = mid;
				if (findStart) {
					// Search for the starting position
					right = mid - 1;
				} else {
					// Search for the ending position
					left = mid + 1;
				}
			}
		}

		return position;
	}

	public static void main(String[] args) {
		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int target = 8;
		int[] range = searchRange(nums, target);

		System.out.println("Starting position: " + range[0]);
		System.out.println("Ending position: " + range[1]);
	}

}
