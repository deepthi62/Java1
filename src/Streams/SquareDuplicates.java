package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SquareDuplicates {
    public static void main(String[] args) {

        List<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(6);

        List<Integer> newlist = new ArrayList<>();

        list.stream().map(x->x*x).filter(x->{
            if(!newlist.contains(x)){
                newlist.add(x);
                return true;
            }
            return false;
        }).collect(Collectors.toList()) ;
        System.out.println(newlist);

    }

}
