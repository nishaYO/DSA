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
            int number_of_spaces = n-row-1;
            int number_of_stars = row+1;
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
