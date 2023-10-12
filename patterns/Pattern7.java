public class Pattern7 {
    /*
      Pattern :*****
                ****
                 ***
                  **
                   *
    */
    public static void main(String[] args) {
        pattern7(5);
    }

    static void pattern7(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                String colVal = col<row? " ": "*";
                System.out.print(colVal);
            }
            System.out.println();
        }
    }
}
