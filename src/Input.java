import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        int [] arr = new int[5];
        Scanner in = new Scanner(System.in);
        for(int i = 0;i<5;i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

    }
}
