package ro.deloitte.ui;

public class Arrays {
    public static void main(String[] args) {

                        //Array Variable Declaration
        //int[] integerArray;
        //String[] nameList;
        //String courseList[];

                        //Array Creation
        //int [integerArray] = new int[10];

                        //Object Creation
        //StringBuilder sb = new StringBuilder();


        /*int[] myIntArray = new int[10];
        myIntArray[0] = 45;
        myIntArray[1] = 1;
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("length of array = " + arrayLength);
        System.out.println("last = " + firstTen[arrayLength-1]);*/

        /*int[] newArray;
        newArray = new int[] {5, 4, 3, 2, 1};
        for (int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }*/

        int[] newArray;
        newArray = new int[5];
        System.out.println("newArray.length is: " + newArray.length);
        for (int i = 0; i < newArray.length; i++){
            newArray[i] = newArray.length - 1;
        }
        for (int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }

        System.out.println();
        for (int element : newArray) {
            System.out.print(element + " " );
        }


                                //Enhanced For Loop
       /*for (declaration : collection){
            //block of statements
        }*/

                                //Basic For Loop
        /*for (init; expression; increment){
            //block of statements
        }*/

        /*System.out.println();
        for (int element : newArray) {
            System.out.print(element + " " );
        }*/


        /*int[] newArray;
        newArray = new int[5];
        System.out.println("newArray.length is: " + newArray.length);

        for (int i = 0; i < newArray.length; i++){
            newArray[i] = newArray.length - i;
        }

        for (int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }

        System.out.println();

        for (int element : newArray) {
            System.out.print(element + " " );
        }*/
    }
}
