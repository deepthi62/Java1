package FunctionObjOrientedProg;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest3 {

    public static void main(String[] args) {
       BiFunction<Integer,Integer,Integer> fun = f1();

        Integer r =  fun.apply(3,3);
        System.out.println(r);

    }
   public static BiFunction<Integer, Integer,Integer> f1(){
        BiFunction<Integer,Integer,Integer> mul = (x,y)->x*y;

       return mul;
   }
}
