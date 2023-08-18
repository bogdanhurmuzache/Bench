package ro.deloitte.CodingBat_Array_1;

/*Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.

firstLast6([1, 2, 6]) → true
firstLast6([6, 1, 2, 3]) → true
firstLast6([13, 6, 1, 2, 3]) → false*/

import ro.deloitte.CodingBat_Logic_1.nearTen;

public class firstLast6 {
    public static boolean firstLast6(int[] nums) {
        if (nums[0] == 6) {
            return true;
        }
        if (nums[nums.length - 1] == 6) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 6};
        int[] nums2 = {6, 1, 2, 3};
        int[] nums3 = {13, 6, 1, 2, 3};

        System.out.println(firstLast6(nums1));  // Output: true
        System.out.println(firstLast6(nums2));  // Output: true
        System.out.println(firstLast6(nums3));  // Output: false
    }
}


