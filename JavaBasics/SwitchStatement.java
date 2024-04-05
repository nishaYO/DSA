public class SwitchStatement {
    public static void main(String[] args) {
        int day = 4;

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Working day");
                break;
            case 6:
            case 7:
                System.out.println("Holiday");
                break;
            default:
                System.out.println("Unknown");
                break;
        }
    }
}
