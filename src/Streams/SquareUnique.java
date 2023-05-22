package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SquareUnique {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(5);

        List<Integer> unique = list.stream().map(x->x*x).filter(x ->checkDuplicates(list,x)).collect(Collectors.toList());
        System.out.println(unique);
    }

    private static boolean checkDuplicates(List<Integer> list, Integer x) {

        int count = 0;
        for(int y : list){
            if(x==y*y){
                count ++;
            }
        }
        return count==1;
    }

}
