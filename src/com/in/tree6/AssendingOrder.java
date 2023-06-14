package com.in.tree6;

public class AssendingOrder {
	public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[right]) {
                // The minimum element is in the left half
                right = mid;
            } else {
                // The minimum element is in the right half
                left = mid + 1;
            }
        }

        // left pointer will be pointing to the minimum element
        return nums[left];
    }


	public static void main(String[] args) {
		int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int minElement = findMin(nums);
        System.out.println("Minimum element: " + minElement);
	}

}
