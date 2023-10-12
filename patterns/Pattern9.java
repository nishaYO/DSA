public class Pattern9 {
    /*
      Pattern :*********
                *******
                 *****
                  ***
                   *
    */
    public static void main(String[] args) {
        pattern9(5);
    }

    static void pattern9(int n) {
        for (int row = 0; row < n; row++) {
            int totalColsInRow = (n*2)-row-1;
            for (int col = 0; col < totalColsInRow; col++) {
                String colVal = col<row? " " : "*";
                System.out.print(colVal);
            }
            System.out.println();
        }
    }
}

