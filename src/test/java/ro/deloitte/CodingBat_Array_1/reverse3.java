package ro.deloitte.CodingBat_Array_1;

/*Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.

reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]*/


import java.util.Arrays;

public class reverse3 {
        public static int[] reverse3(int[] nums) {
            int[] reverse = new int[3];
            reverse[0] = nums[2];
            reverse[1] = nums[1];
            reverse[2] = nums[0];

            return reverse;
        }


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {5, 11, 9};
        int[] nums3 = {7, 0, 0};

        int[] reversed1 = reverse3(nums1);
        int[] reversed2 = reverse3(nums2);
        int[] reversed3 = reverse3(nums3);

        System.out.println(Arrays.toString(reversed1));  // Output: [3, 2, 1]
        System.out.println(Arrays.toString(reversed2));  // Output: [9, 11, 5]
        System.out.println(Arrays.toString(reversed3));  // Output: [0, 0, 7]
    }
}
