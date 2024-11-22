public class Basics {
    public static void main(String[] args) {
       // 1 declaration :
        int[] myArray;

       // 2 Initialisation :
       myArray = new int[5];
       // 3 both :
       int [] newArray = new int[5];

      // initialise with values :
       int[] rNos = {1,2,3,4,5};

       //indexing
        int [] marks = new int[3];
        marks = new int []{1,2,3}; // new keyword allocates memory for an array via DMA
        System.out.println(marks[0]); // o/p : 1 but 0 by default if array has nothing
    }
}