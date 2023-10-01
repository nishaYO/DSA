public class StringAlternateDatatype {
    public static void main(String[] args) {
//        string builder has O(n) complexity but if we used string than it would have O(n)^2 complexity
//        because every time new object would be created.
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
    }
}
