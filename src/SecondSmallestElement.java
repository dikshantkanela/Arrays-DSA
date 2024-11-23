public class SecondSmallestElement {
    public static void main(String[] args) {
        int[] arr= {21,43,32,0,43,-10};
        int secondSmallest = checkSecondSmallest(arr);
        System.out.println(secondSmallest);
    }
    static int checkSecondSmallest(int[] arr){
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]<smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i]>smallest && arr[i]<secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }

}
