package Java8;

import java.util.function.Function;

public class FunctionTest4 {
    public static void main(String[] args) {
        Function<Integer, Boolean> isEven = (x) -> x % 2 == 0;
        f1(isEven);
    }

    public static void f1(Function<Integer, Boolean> even) {
        boolean result = even.apply(10);
        System.out.println(result);

    }
}

