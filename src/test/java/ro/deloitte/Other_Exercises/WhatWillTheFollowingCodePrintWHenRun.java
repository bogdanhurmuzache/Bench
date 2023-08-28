package ro.deloitte.Other_Exercises;


/*What will the following code print when run?
public class TestClass {
public static void main(String[] args) throws Exception { boolean flag = true;
switch (flag){
case true : System.out.println("true");
default: System.out.println("false"); }
} }*/



public class WhatWillTheFollowingCodePrintWHenRun {
        public static void main(String[] args) throws Exception {
            boolean flag = true;
            if (flag) {
                System.out.println("true");
            }
            System.out.println("false");
        }
}
