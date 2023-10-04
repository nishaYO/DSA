public class Pattern5 {
    /*
      Pattern :  *
                 **
                 ***
                 ****
                 *****
                 ****
                 ***
                 **
                 *
    */
    public static void main(String[] args) {
        pattern5(5);
    }

    static void pattern5(int n) {

        for (int row = 0; row < (2*n)-1; row++) {
            int number_of_columns = row>=n?(2*n)-row-1:row+1;
            for (int col = 0; col < number_of_columns; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
