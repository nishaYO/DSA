import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {7, -3, 5, 0, 2, 4, 1};
        int[] sorted_nums = arr_sorter(nums);
        System.out.println(Arrays.toString(sorted_nums));
    }
    static int[] arr_sorter(int[] nums) {
        int len = nums.length;

        for (int i = 0; i < len-1; i++) {
            boolean swapped = false;
            for (int j = 0 ; j < len-1-i; j++) {
                if (nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                return nums;
            }
        }


       return nums;
    }
}
