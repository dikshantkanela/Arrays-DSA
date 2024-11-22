import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfStr {
    public static void main(String[] args) {
        String[] cars = new String[5];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<cars.length;i++){
            cars[i] = in.next();
        }
        cars[2] = "volvo";
        System.out.println(Arrays.toString(cars));
    }
}
