import java.util.Arrays;
import java.util.Scanner;

public class TwoDArr {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner in = new Scanner(System.in);

        //input
        for(int row = 0 ; row<matrix.length; row++){
            for(int col = 0; col<matrix[row].length; col++ ){
                matrix[row][col] = in.nextInt();
            }

        }

        //output
        // basic
        for(int row = 0 ; row< matrix.length; row++){
            for(int col = 0 ; col<matrix[row].length;col++){
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
       // toString
        for(int row = 0 ; row< matrix.length; row++){
            System.out.println(Arrays.toString(matrix[row]));

        }
       // for-each

       for(int[] row : matrix){
           System.out.println(Arrays.toString(row));
       }
    }
}
