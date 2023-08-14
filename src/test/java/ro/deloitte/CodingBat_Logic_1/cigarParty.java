package ro.deloitte.CodingBat_Logic_1;

/*When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of
        cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the
        number of cigars. Return true if the party with the given values is successful, or false otherwise.

        cigarParty(30, false) → false
        cigarParty(50, false) → true
        cigarParty(70, true) → true*/

public class cigarParty {

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend == true){
            return cigars >= 40;
        }
        else{
            return ((cigars >= 40) && (cigars <= 60));
        }
    }


    public static void main(String[] args) {
        boolean party1 = cigarParty(30, false);
        boolean party2 = cigarParty(50, false);
        boolean party3 = cigarParty(70, true);

        System.out.println("cigarParty(30, false): " + party1);
        System.out.println("cigarParty(50, false): " + party2);
        System.out.println("cigarParty(70, true) " + party3);
    }
}

    /*Our Solution:

public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
        return (cigars >= 40);
        // A longer way to write the above line:
        // if (cigars >= 40) {
        //   return true;
        // } else {
        //   return false;
        // }
        } else {
        return (cigars >= 40 && cigars <= 60);
        }
        }*/