public class Fibonacci {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fibonacci(n));

    }

    static int fibonacci(int n) {
        // recursive relation
        // fibo(n) = fibo(n-1) + fibo(n-2)

        // base condition
        if (n==1 || n==0){
            return n;
        }

        return fibonacci(n-1)+fibonacci(n-2);
    }
}
