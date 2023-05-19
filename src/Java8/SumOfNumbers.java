package Java8;

import java.util.function.Function;

public class SumOfNumbers {

    public static int sum(int arr[], Function<Integer,Integer> fun){
                int sum = 0;
        for(int i = 0; i<arr.length; i++){
                sum = sum+fun.apply(arr[i]);
                }

        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {5,20,10,30,70};

        Function<Integer,Integer> f1 = (x)->x;
        Integer r1 = sum(arr,f1);
        System.out.println(r1);

        Function<Integer,Integer> f2 = x->
                                      {
                                       if(x%2==0){
                                           return x;
                                       }
                                          return 0;
                                      };

        Integer r2 = sum(arr,f2);
        System.out.println(r2);
    }

}
