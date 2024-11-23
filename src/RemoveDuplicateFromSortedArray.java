import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {

        int[] nums = {1,1,2,2,3,3,4,6};
        int res = checkDuplicate(nums);
        System.out.println(res);
    }
    static int checkDuplicate(int[] nums){
        int i = 0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                nums[i+1] = nums[j];
                i++;

            }
        }
        return i+1;
    }
}
