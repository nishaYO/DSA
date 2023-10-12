public class Pattern11 {
    /*
      Pattern :     * * * * *
                     * * * *
                      * * *
                       * *
                        *
    */

//    whenever solving such patterns in which there are two col values(here " "  and "* " then create a col row matrix and come
//    up with a formula showing relation between row, column and n and decide col value like we did here)

    public static void main(String[] args) {
        pattern11(5);
    }

    static void pattern11(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                String colVal = col < row? " " : "* ";
                System.out.print(colVal);
            }
            System.out.println();
        }
    }
}
