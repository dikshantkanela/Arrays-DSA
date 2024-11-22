import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        // methods  :
        numbers.add(1);
        numbers.add(2);
        System.out.println(numbers.get(0));
        numbers.set(0,3);
        System.out.println(numbers.contains(1));
        System.out.println(numbers.size());

        // Iterate :
        for(int ele:numbers){
            System.out.println(ele + " ");
        }

        // input 5 elements
        System.out.println("Enter 5 elements");
        ArrayList<String> names = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        for(int i = 0 ; i<5; i++ ){
           names.add(in.next());
        }
        for(String ele : names){
            System.out.print(ele + " ");
        }

        // 2-d

      ArrayList<ArrayList<Integer>> myList = new ArrayList<>();
      // initialise the empty AL!
      myList.add(new ArrayList<Integer>());
      myList.add(new ArrayList<Integer>());

      for(int i = 0 ; i<2; i++){
          for(int j = 0; j<2;j++){
              myList.get(i).add(in.nextInt());
          }
      }
      for(int i = 0 ; i<myList.size(); i++){
          System.out.println(myList.get(i).toString());
      }

    }
}
