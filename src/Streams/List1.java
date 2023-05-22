package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class List1 {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(6);
        li.add(8);
        li.add(9);

//            Function<Integer,Boolean> fun = Student:: isEven;
        List<Integer> l1 = li.stream().filter(List1 :: isEven).collect(Collectors.toList());
        System.out.println(l1);

    }

    public static boolean isEven(int x){
          if(x%2==0){
              return true;
          }
        return false;
    }
}
