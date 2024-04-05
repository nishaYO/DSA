public class Functions {
//    In java, primitives are passed by value inside functions while objects are passed by reference.
public static void main(String[] args) {
    StringBuilder s = new StringBuilder("Hello");
    System.out.println("Before: "+s);
    PassByReference(s);
    System.out.println("After: "+s);
    int x = 10;
    System.out.println("Before : " + x);
    PassByValue(x);
    System.out.println("After: " + x);
}

public static void PassByValue(int x){
    x++;
    System.out.println("Inside PassByValue func: " + x);
}

public static void PassByReference(StringBuilder s){
    s.append(" world!");
    System.out.println("Inside PassByReference func:" + s);
}
}
