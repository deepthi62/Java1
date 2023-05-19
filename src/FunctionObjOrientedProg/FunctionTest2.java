package FunctionObjOrientedProg;

import java.util.function.Function;

public class FunctionTest2 {
    public static void main(String[] args) {
        Function<String,String> toUpper = (x)->x.toUpperCase();
        Function<Integer,Integer> mul = (x)->x*x;
        f1(toUpper,mul);
    }

    public static void f1(Function<String, String> toUpperfun, Function<Integer, Integer> mul){
        String s1 = toUpperfun.apply("deepthi");
        System.out.println(s1);
        Integer r1 = mul.apply(9);
        System.out.println(r1);

    }
}
