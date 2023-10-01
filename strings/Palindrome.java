public class Palindrome {
    public static void main(String[] args) {
        String my_str = "ffsdf";
        System.out.println(check_palindrome(my_str));
    }

    static boolean check_palindrome(String str){
        boolean palindrome = true;
        int len = str.length();
        for (int i = 0; i < len; i++) {
            int start = i;
            int end = len-1-i;
            if (str.charAt(start)!=str.charAt(end)){
                palindrome = false;
            }
            if (start>end){
                return palindrome;
            }
        }
        return  palindrome;
    }
}
