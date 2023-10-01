import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {7, -3, 5, 0, 8, -2, 4, 1};
        int[] sorted_nums = arr_sorter(nums);
        System.out.println(Arrays.toString(sorted_nums));
    }

    static int find_max(int[] arr, int end){
        int max_index = 0;
        for (int i = 0; i < end; i++) {

            if (arr[i]>arr[max_index]){
                max_index = i;
            }
        }
        return max_index;
    }

    static int[] swap_elements(int[] arr, int first_element_index, int second_element_index){
        int temp = arr[first_element_index];
        arr[first_element_index] = arr[second_element_index];
        arr[second_element_index] = temp;
        return arr;
    }

    static int[] arr_sorter(int[] nums) {
        int len = nums.length;
        for (int i = len-1; i >0; i--) {
            int max = find_max(nums, i);
            nums = swap_elements(nums, max, i);
        }
        return nums;
    }

}
