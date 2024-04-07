public class Pattern12 {
    /*
     Pattern :      * * * * *
                     * * * *
                      * * *
                       * *
                        *
                        *
                       * *
                      * * *
                     * * * *
                    * * * * *
   */
//    at row 3 " " are till 3
//    col <= row ? " ": "* "
//    at row 5 " " are till 3rd col
    public static void main(String[] args) {
        pattern12(5);
    }

    static void pattern12(int n) {
        for (int row = 0; row < n*2; row++) {

            for (int col = 0; col < n; col++) {
                String colVal = "";
                if (row<n){
                    colVal = col<row? " ":"* ";
                }
                else{
                    colVal = col < (n*2)-row-1? " ": "* ";
                }
                System.out.print(colVal);
            }

            System.out.println();
        }
    }
}
