package ro.deloitte.CodingBat_Array_1;


/*Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
        Both arrays will be length 1 or more.

        commonEnd([1, 2, 3], [7, 3]) → true
        commonEnd([1, 2, 3], [7, 3, 2]) → false
        commonEnd([1, 2, 3], [1, 3]) → true*/

public class commonEnd {
    public static boolean commonEnd(int[] a, int[] b) {
        int lenA = a.length;
        int lenB = b.length;

        return a[0] == b[0] || a[lenA - 1] == b[lenB - 1];
    }

    public static void main(String[] args) {
        int[] array_a1 = {1, 2, 3};
        int[] array_b1 = {7, 3};

        int[] array_a2 = {1, 2, 3};
        int[] array_b2 = {7, 3, 2};

        int[] array_a3 = {1, 2, 3};
        int[] array_b3 = {1, 3};

        System.out.println(commonEnd(array_a1, array_b1));  // Output: true
        System.out.println(commonEnd(array_a2, array_b2));  // Output: false
        System.out.println(commonEnd(array_a3, array_b3));  // Output: true

    }
}
