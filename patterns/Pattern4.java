public class Pattern4 {
    /*
      Pattern :  1
                 1 2
                 1 2 3
                 1 2 3 4
                 1 2 3 4 5
    */
    public static void main(String[] args) {
        pattern4(5);
    }

    static void pattern4(int n) {
        // col_no = row+1
        // col_val = col+1
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row+1; col++) {
                System.out.print(col+1 + " ");
            }
            System.out.println();
        }
    }
}
