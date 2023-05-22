package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class list {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

//        Function<Integer,Integer> mul = x->{
//            int z = x*x;
//            System.out.println(z);
//            return z;
//        };

        list.stream().forEach(x->{
            int z = x*x;
            System.out.println(z);
        });


        System.out.println("Even numbers");
        IntStream.range(1,10).filter(x->x%2==0).forEach(x-> System.out.println(x));

        list.stream().map(x->x*x).filter(x->x>150).forEach(x->{
            System.out.println(x);
        });

        int arr[] = {10,20,30,40};
        IntStream.range(0,arr.length).filter(index->arr[index]%2==0).forEach(x-> System.out.println(arr[x]));
    }
}
