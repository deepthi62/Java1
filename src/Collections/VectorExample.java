package Collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector();
        v.add(10);
        v.add(20);
        v.add(40);
        for(Integer i : v){
            System.out.println(i);
        }

//        Iterator it = v.iterator();
//        while(it.hasNext()){
//           Integer i = (Integer) it.next();
//            System.out.println(i);
//        }

    }

}
