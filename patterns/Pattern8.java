public class Pattern8 {
    /*
      Pattern :    *
                  ***
                 *****
                *******
               *********
    */
    public static void main(String[] args) {
        pattern8(5);
    }

    static void pattern8(int n) {
        for (int row = 0; row < n; row++) {
            int totalColsInRow = n+row;
            for (int col = 0; col < totalColsInRow; col++) {
                String colValue = col<n-row-1? " " : "*";
                System.out.print(colValue);
            }
            System.out.println();
        }
    }
}

