import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] nums = {7, 3, 2, 5, 6, 4, 1};
        int[] sorted_nums = arr_sorter(nums);
        System.out.println(Arrays.toString(sorted_nums));
    }

    static int[] arr_sorter(int[] nums) {
        for (int i = 0; i < nums.length; i++) {

            while (nums[i]!=i+1){
                nums = swapper(nums, i, nums[i]-1);
            }
        }
        return nums;
    }

    static int[] swapper(int[] arr, int first_element_index, int second_element_index){
        int temp = arr[first_element_index];
        arr[first_element_index] = arr[second_element_index];
        arr[second_element_index] = temp;
        return arr;
    }
}
