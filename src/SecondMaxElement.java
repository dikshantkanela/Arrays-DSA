public class SecondMaxElement {
    public static void main(String[] args) {
       int[] arr =  {-2,31,52,11,23,21,0};
       int secondLargest = checkSecondLargest(arr);
        System.out.println(secondLargest);
    }

  static int checkSecondLargest(int [] arr){
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i]<largest && arr[i]>secondLargest) {
                secondLargest = arr[i];
            }

        }
      return secondLargest;
  }
}
