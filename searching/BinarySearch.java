public class BinarySearch {
    public static void main(String[] args) {
         //ascending
        int[] arr = {1,3,5,7,9,23,56,68,75};
        int target = 75;
        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(end>=start){
            int mid = start + ((end-start)/2);
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
        }
        return -1;
    }
}