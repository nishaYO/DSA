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
            int number_of_stars = n-row;
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
