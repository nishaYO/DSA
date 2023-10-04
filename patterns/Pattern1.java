public class Pattern1 {
    /*
      Pattern :  *****
                 *****
                 *****
                 *****
                 *****
    */
    public static void main(String[] args) {

        pattern1(5);
    }

    static void pattern1(int n) {
        // same number of rows and columns: row = col = n
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}