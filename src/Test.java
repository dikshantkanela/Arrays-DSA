import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 1;
        System.out.println("Enter the Number : ");
        int n = in.nextInt();
        for(int i = 1;i<=n;i++){
         int next = num1+num2; // (0 1) (1 1) (1 2) (2 3)
         System.out.print(next + " ");//(1) (2) (3) (5)
         num1 = num2; // (1) (1) (2) (2)
         num2 = next; // (1) (2) (3) (5)
        }
// 0 1 1 2 3 5 8    1 2
    }
}
