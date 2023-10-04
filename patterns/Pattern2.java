public class Pattern2 {
    /*
      Pattern :  *
                 **
                 ***
                 ****
                 *****
    */
    public static void main(String[] args) {
        pattern2(5);
    }

    static void pattern2(int n) {
        // col = row+1
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row+1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
