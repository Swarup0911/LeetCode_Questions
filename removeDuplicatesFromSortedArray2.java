package LeetCode_Questions;

public class removeDuplicatesFromSortedArray2 {
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i<nums.length-2 && nums[i] == nums[i+2]) {
                continue;
            }else{
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
        int[] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums));
    }
}
