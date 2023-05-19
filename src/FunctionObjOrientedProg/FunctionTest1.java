package FunctionObjOrientedProg;

import java.util.function.Function;

public class FunctionTest1 {

    public static void main(String[] args) {

        Function<Integer,Integer> mul = (x)->x*x;

//        Function<Integer,Integer> mul =(x)-> {
//            System.out.println("Input  value " + x);
//            int z= x*x;
//            return z;
//        };
        f1(mul);
    }

    public static void f1(Function<Integer, Integer> fun){
        int r1 = fun.apply(3);
        System.out.println(r1);
        int r2 = fun.apply(4);
        System.out.println(r2);
    }
}
