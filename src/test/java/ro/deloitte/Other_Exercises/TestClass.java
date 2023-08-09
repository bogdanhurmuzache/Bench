package ro.deloitte.Other_Exercises;

//What will the following code print when run?

public class TestClass {
public void switchString(String input){
switch(input){
case "a" : System.out.println( "apple" );
case "b" : System.out.println( "bat" );
break;
case "B" : System.out.println( "big bat" );
default : System.out.println( "none" );
}
}

    public static void main(String[] args) throws Exception {
TestClass tc = new TestClass();
tc.switchString("B");
            }
    }








