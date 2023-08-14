package ro.deloitte.Other_Exercises;



public class Exercise_5_Methods {

    public static int addOne(int x) {
        x = x + x;
        return x;
    }

    static void myMethod() {
        System.out.println("I just got executed!");
    }

    static void myMethod_1(String fname) {
        System.out.println(fname + " Petrescu");
    }

        public static void main(String[] args) {
            int y = 12;
            int z;

            z = addOne(y);

            System.out.printf("%d, %d %n", y, z );

            myMethod();
            myMethod_1("Dumitru");
            myMethod_1("Elena");
        }
}
