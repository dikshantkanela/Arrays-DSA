import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; //swap until both start and end become equal
            end--; // increment start and decrement end by 1 in each iteration
        }
    }
}
