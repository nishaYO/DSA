import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {7, -3, 5, 0, 8, -2, 4, 1};
        int[] sorted_nums = arr_sorter(nums);
        System.out.println(Arrays.toString(sorted_nums));
    }
    static int[] swapper(int[] arr, int first_element_index, int second_element_index){
        int temp = arr[first_element_index];
        arr[first_element_index] = arr[second_element_index];
        arr[second_element_index] = temp;
        return arr;
    }
    static int[] insert_last_element(int[] nums, int end) {
        for (int i = end-1; i >= 0; i--) {
           if (nums[end]<nums[i]){
               nums = swapper(nums, i, end);
               end = i; // becoz end index element is now swapped with the ith element
           }
           else {
               break;
           }
        }
        return nums;
    }

    static int[] arr_sorter(int[] nums) {
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            nums = insert_last_element(nums, i);
        }
        return nums;
    }
}
