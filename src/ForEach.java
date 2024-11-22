import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        int [] arr = new int[5];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<5;i++){
            arr[i] = in.nextInt();

        }

        for(int ele:arr){
            System.out.print(ele + " "); //print element for each element
        }

    }
}
