package Streams;

import java.util.function.Consumer;
public class ConsumerFun {
    public static void main(String[] args){
        Consumer<String> dumyFun = x-> System.out.println(x);
          f1(dumyFun);

    }
    public static void f1(Consumer<String> dumyFun){
        dumyFun.accept("deepthi");

    }
}
