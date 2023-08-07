package ro.deloitte.ui;

public class Exercises {

        public static void main(String[] args) {
            Object obj1 = new Object();
            Object obj2 = obj1;
            if (obj1.equals(obj2)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
}