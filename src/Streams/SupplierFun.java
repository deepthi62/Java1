package Streams;

import java.util.function.Supplier;

public class SupplierFun {
    public static void main(String[] args) {
       Supplier<String> supFun = ()->{

           return "deepthi";
       };
       f1(supFun);
    }
    public static void f1(Supplier<String>supFun){
        String s1 = supFun.get();
        System.out.println(s1);
    }
}
