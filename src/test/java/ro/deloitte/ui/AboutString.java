package ro.deloitte.ui;

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


            String courseName = "Learn Java for Beginners Crash Course";
            String message = "Welcome to ";

            System.out.println(courseName.charAt(0));
            System.out.println(courseName.charAt(5));

            for (int i = 15; i > 23; i++){
                System.out.print(courseName.charAt(i));
            }
            System.out.println();
        }
}

