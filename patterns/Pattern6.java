public class Pattern6 {
    /*
      Pattern :    *
                  **
                 ***
                ****
               *****
    */
    public static void main(String[] args) {
        pattern6(5);
    }

    static void pattern6(int n) {
        for (int row = 0; row < n; row++) {

            for (int col = 0; col < n; col++) {
                String colVal = col<n-row-1 ? " " : "*";
                System.out.print(colVal);
            }

            System.out.println();
        }
    }
}
