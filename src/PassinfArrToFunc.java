import java.util.Arrays;

public class PassinfArrToFunc {
    public static void main(String[] args) {
      int[] numbers = {10,20,30,40,50};
      change(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    static void change(int [] arr){
        arr[0] = 69; //changes the original array
    }
}
