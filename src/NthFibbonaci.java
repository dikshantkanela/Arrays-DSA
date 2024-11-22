import java.util.Scanner;

public class NthFibbonaci {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = in.nextInt();
        if(n==1){
            System.out.println("Nth Fibonacci number is : " + num1);
        }
        else{
            for(int i = 0; i<n-2;i++){ //n=5
                int next = num1+num2; //(0 1) (1 1) (1 2) (2 3)
                num1 = num2; //(1) (1) (2) (3)
                num2 = next; //(1) (2) (3) (5)   // 0 1 1 2 3 5 8


            }
            System.out.println(num2);
        }


    }
}
