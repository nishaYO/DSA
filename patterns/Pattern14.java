public class Pattern14 {
//    pattern: 14.  *********
//                   *     *
//                    *   *
//                     * *
//                      *

    public static void main(String[] args) {
        pattern12(5);
    }

    static void pattern12(int n) {
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col < n*2; col++) {
                String colVal = col==row?"*":" ";
                colVal = col == (n*2)-row?"*":colVal;
                colVal = row==1?"*":colVal;
                System.out.print(colVal);
            }

            System.out.println();
        }
    }
}
