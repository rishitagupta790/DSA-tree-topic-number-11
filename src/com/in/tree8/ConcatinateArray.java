package com.in.tree8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConcatinateArray {
	public static int[] intersect(int[] nums1, int[] nums2) {
		// Use a hash map to count the frequency of elements in nums1
		Map<Integer, Integer> countMap = new HashMap<>();
		for (int num : nums1) {
			countMap.put(num, countMap.getOrDefault(num, 0) + 1);
		}

		List<Integer> intersection = new ArrayList<>();

		// Iterate through nums2 and find common elements
		for (int num : nums2) {
			if (countMap.containsKey(num) && countMap.get(num) > 0) {
				intersection.add(num);
				countMap.put(num, countMap.get(num) - 1);
			}
		}

		// Convert the list to an array
		int[] result = new int[intersection.size()];
		for (int i = 0; i < intersection.size(); i++) {
			result[i] = intersection.get(i);
		}

		return result;
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };
		int[] intersection = intersect(nums1, nums2);

		System.out.println("Intersection: " + Arrays.toString(intersection));
	}

}
