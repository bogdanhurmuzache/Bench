package ro.deloitte.ui;

import static org.apache.commons.lang3.StringUtils.indexOfIgnoreCase;

public class AboutString {

        public static void main(String[] args) {

            /*String courseName = "Learn Java for Beginners Crash Course";
            String message = "Welcome to ";

        // concatenate  courseName and message to create a new String
            String fullMessage = message + courseName;
            System.out.println(fullMessage);

        // use string format
            String fullMessage2 = String.format("%s%s", message, courseName);
            System.out.println(fullMessage2);

        // use printf
            System.out.printf("%s%s", message, courseName);*/



            /*String courseName = "Learn Java for Beginners Crash Course";
            String message = "Welcome to ";

            System.out.println(courseName.charAt(0));
            System.out.println(courseName.charAt(13));

            for (int i = 15; i > 23; i++){
                System.out.print(courseName.charAt(i));
            }
            System.out.println();*/





            /*String courseName = "Learn Java for Beginners Crash Course";
            String message = "Welcome to ";

            System.out.println(courseName.charAt(0));
            System.out.println(courseName.charAt(13));

            for (int i = 15; i < courseName.length(); i++){
                System.out.print(courseName.charAt(i));
            }
            System.out.println();
            System.out.println(courseName.length());*/






            /*String courseName = "Learn Java for Beginners Crash Course";

            int position;

            //position = courseName.indexOf(" j");
            position = indexOfIgnoreCase(courseName, "j");
            System.out.println(position);*/


                /*String first = "This is a String";
                //String second = new String("This is a String");
                String second = "THIS IS A STRING";

                System.out.println(first == second);
                System.out.println(second == first);
                System.out.println(first.equals(second));
                System.out.println(second.equals(first));*/



                /*int x = 5;
                int y = x;
                System.out.printf("x = %d. y = %d %n", x,y);
                System.out.printf("x is same as y: %s %n", x == y);

                String first = "This is a String";
                String second = first;

                System.out.printf("first: %s %n", first);
                System.out.printf("second: %s %n", second);
                System.out.printf("first is the same as second: %s %n", first == second);*/


                /*System.out.println(Math.max(1010,13)); // find the highest value
                System.out.println(Math.min(1010,13)); // find the lowest value
                System.out.println(Math.sqrt(35)); // return the square root
                System.out.println(Math.abs(-15)); // return the positive number
                System.out.println(Math.random()); // print random number*/

                /*int randomNum = (int)(Math.random() * 10);  // 0 to 10
                System.out.println(randomNum);*/


                                        // Upper case
                /*String txt = "Hello";
                System.out.println(txt.toUpperCase());*/

                                        // concatenate
                /*String firstName = "John ";
                String lastName = "Doe";
                System.out.println(firstName.concat(lastName));*/

                                        // indexOF
                /*String txt = "Hello Everybody";
                System.out.println(txt.indexOf("e"));*/

        }
}

