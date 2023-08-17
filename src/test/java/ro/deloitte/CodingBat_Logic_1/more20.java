package ro.deloitte.CodingBat_Logic_1;

/*Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also: Introduction to Mod

more20(20) → false
more20(21) → true
more20(22) → true*/


public class more20 {
    public static boolean more20(int n) {
        if((n % 20 == 1) || (n % 20 == 2))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        more20 calculation = new more20();

        boolean example_1 = more20(20);
        boolean example_2 = more20(21);
        boolean example_3 = more20(22);

        System.out.println("more20(20): " + example_1);  // Output: false
        System.out.println("more20(21): " + example_2);  // Output: true
        System.out.println("more20(22): " + example_3);   // Output: true
    }
}


