public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,7,12,30,55};
        int num = 1;
        System.out.println(binarySearchRecursion(arr, num, 0, arr.length-1));
    }

    static int binarySearchRecursion(int[] arr, int n, int s, int e){
        int m = s + (e-s)/2;
        if (arr[m]==n){
            return m;
        }
        if (s>=e){
            return -1;
        }
        if (arr[m]>n){
            return binarySearchRecursion(arr, n, s,m-1);
        }
        return binarySearchRecursion(arr, n, m+1, e);
    }
}
