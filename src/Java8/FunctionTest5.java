package Java8;

import java.util.ArrayList;
import java.util.List;

public class FunctionTest5 {

    public static void main(String[] args) {
        List<Integer> Mylist = new ArrayList();
        Mylist.add(80);
        Mylist.add(30);

        Mylist.stream().forEach((x)->{
            System.out.println(x);
        });

    }

}
