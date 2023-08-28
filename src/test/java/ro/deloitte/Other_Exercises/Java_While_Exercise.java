package ro.deloitte.Other_Exercises;

/*Consider the following code:
public class TestClass {
//define tester method here
public static void main(String[] args) throws Exception { TestClass tc = new TestClass();
while(tc.tester()){
System.out.println("running..."); } } }
Which of the following options would be a valid implementation of tester() method?*/


public class Java_While_Exercise {
    public static void main(String[] args) throws Exception { TestClass tc = new TestClass();
        while(tc.tester()){
            System.out.println("running...");
        }
    }
}


class TestClass{
    private static int counter = 0;
    public boolean tester() {

        counter++;
        return counter <= 13; // Rulează bucla de 13 ori
    }
}

