package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
        Set<Integer> mylist = new HashSet<>();
        mylist.add(80);
        mylist.add(40);
        mylist.add(70);
        mylist.add(40);
        mylist.add(20);
//        for(Integer i : mylist){
//            System.out.println(i);
//        }
        Iterator it = mylist.iterator();
        while(it.hasNext()){
            Integer i = (Integer)it.next();
            System.out.println(i);
        }
    }
}
