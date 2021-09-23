/*4.a create arrays of the following type and assign it at least 3
 different values:
    - Integer array
    - String array
    - boolean array*/
    public class Task4{
      public static void main(String[] args) {
        //initialisér int-arrayet
        int[] arrayOfInts = new int[3];
        for (int i = 0; i < 3; i++) {
          arrayOfInts[i]=i;
        }

        String [] arrayOfStrings = new String[3];
        arrayOfStrings[0] = "Hej";
        arrayOfStrings[1] = "Farvel";
        arrayOfStrings[2] = "Auf Wiedersehen!";

        boolean [] arrayOfBooleans = {true, false, false};

        //4.b Write a function that takes in an array of strings as
        // parameter and prints each string.
        String[] arrayOfStrings3 = new String[3];
        arrayOfStrings3[0] = "Hej";
        arrayOfStrings3[1] = "Farvel";
        arrayOfStrings3[2] = "Auf Wiedersehen!";

        printMyString(arrayOfStrings3);

        //4.c Write a function that receives an integer array as a parameter and returns the sum of all elements in the array.
        int[] arrayOfInts2 = {5, 2, 4};
        int total = 0;
        for (int i = 0; i < arrayOfInts2.length; i++) {
          total = total + arrayOfInts2[i];
        //4.d Write a function that receives an integer array as a parameter and returns the average value.
        }System.out.println("Her er summen: " +total);
        System.out.println("Her er gennemsnittet: " +total/arrayOfInts2.length);

      }
      public static void printMyString (String[] arrayOfStrings){
        for (int i = 0; i <arrayOfStrings.length; i++) {
          System.out.println(arrayOfStrings[i]);

        }

      }


    }
