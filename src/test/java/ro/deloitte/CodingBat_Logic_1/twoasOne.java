package ro.deloitte.CodingBat_Logic_1;

/*Given three ints, a b c, return true if it is possible to add two of the ints to get the third.

twoAsOne(1, 2, 3) → true
twoAsOne(3, 1, 2) → true
twoAsOne(3, 2, 2) → false*/

public class twoasOne {
    public static boolean twoAsOne(int a, int b, int c) {
        if(((a + b) == c) || ((a + c) == b) || ((b + c) == a)){
            return true;
        }
        else{
            return false;
        }
    }


    public static void main(String[] args) {
        twoasOne oneIn2 = new twoasOne();

        boolean example_1 = twoAsOne(1, 2, 3);
        boolean example_2 = twoAsOne(3, 1, 2);
        boolean example_3 = twoAsOne(3, 2, 2);

        System.out.println("twoAsOne(1, 2, 3): " + example_1);  // Output: true
        System.out.println("twoAsOne(3, 1, 2): " + example_2);  // Output: true
        System.out.println("twoAsOne(3, 2, 2): " + example_3);   // Output: false

    }
}
