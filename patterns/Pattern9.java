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
            int number_of_stars = 1+((n-row-1)*2);
            int number_of_spaces = row;
            for (int col = 0; col < number_of_spaces; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < number_of_stars; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

