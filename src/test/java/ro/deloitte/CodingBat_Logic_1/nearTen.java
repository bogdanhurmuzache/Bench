package ro.deloitte.CodingBat_Logic_1;

/*
Given a non-negative number "num", return true if num is within 2 of a multiple of 10.
Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Modrrf

nearTen(12) → true
nearTen(17) → false
nearTen(19) → true*/

public class nearTen {
    public static boolean nearTen(int num) {
        if (num % 10 <= 2 || num % 10 >= 8)  {
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        nearTen calculation = new nearTen();

        boolean example_1 = nearTen(12);
        boolean example_2 = nearTen(17);
        boolean example_3 = nearTen(19);

        System.out.println("nearTen(12): " + example_1);  // Output: true
        System.out.println("nearTen(17): " + example_2);  // Output: false
        System.out.println("nearTen(19): " + example_3);   // Output: true
    }
}


