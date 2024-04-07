public class Pattern13 {
    /*
     Pattern :    *
                 * *
                *   *
               *     *
              *********
   */
    public static void main(String[] args) {
        pattern12(5);
    }

    static void pattern12(int n) {
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col < n*2; col++) {
                String colVal = col==n-row+1?"*":" ";
                colVal = col == n+row-1?"*":colVal;
                colVal = row==5?"*":colVal;
                System.out.print(colVal);
            }

            System.out.println();
        }
    }
}
