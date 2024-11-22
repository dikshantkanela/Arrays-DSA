public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {-1,-5,-2,100,20,0};
        int max =  maxItem(arr);
        System.out.println("Maximum element : " +max);

    }
    static int maxItem(int[] arr){
        int max = arr[0];
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
