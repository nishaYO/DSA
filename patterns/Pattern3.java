public class Pattern3 {
    /*
      Pattern :  *****
                 ****
                 ***
                 **
                 *
    */
    public static void main(String[] args) {
        pattern3(5);
    }

    static void pattern3(int n) {
        // col = n - row
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n-row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
