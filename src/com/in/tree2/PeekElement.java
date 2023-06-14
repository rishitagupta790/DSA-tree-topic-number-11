package com.in.tree2;

public class PeekElement {
	public static int findPeakElement(int[] nums) {
		int left = 0;
		int right = nums.length - 1;

		while (left < right) {
			int mid = left + (right - left) / 2;

			if (nums[mid] < nums[mid + 1]) {
				// The peak element is on the right side
				left = mid + 1;
			} else {
				// The peak element is on the left side or at the current index
				right = mid;
			}
		}

		return left;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1 };
		int peakIndex = findPeakElement(nums);
		System.out.println("Peak element index: " + peakIndex);
	}

}
