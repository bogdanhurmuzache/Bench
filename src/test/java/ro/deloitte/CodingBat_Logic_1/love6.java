package ro.deloitte.CodingBat_Logic_1;

/*The number 6 is a truly great number.
        Given two int values, a and b, return true if either one is 6.
        Or if their sum or difference is 6.
        Note: the function Math.abs(num) computes the absolute value of a number.

        love6(6, 4) → true
        love6(4, 5) → false
        love6(1, 5) → true*/

public class love6 {
    public static boolean love6(int a, int b) {
        if ((a == 6) || (b == 6)){
            return true;
        }

        if (a + b == 6){
            return true;
        }
        else if ((a - b == 6) || (a + b == 6) || (b - a == 6)){
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        love6 calculation = new love6();
        boolean example1 = love6(6, 4);
        boolean example2 = love6(4, 5);
        boolean example3 = love6(1, 5);

        System.out.println("love6(6, 4): " + example1);  // Output: true
        System.out.println("love6(4, 5): " + example2);  // Output: false
        System.out.println("love6(1, 5): " + example3);   // Output: true
    }
}

