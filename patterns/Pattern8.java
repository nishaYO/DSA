public class Pattern8 {
    /*
      Pattern :     *
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
            int number_of_stars = 1+(row*2);
            int number_of_spaces = n-row-1;
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

