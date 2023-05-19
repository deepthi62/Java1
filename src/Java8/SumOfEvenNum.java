package Java8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class SumOfEvenNum {
    public static int sum(int arr[], Function<Integer,Integer> fun){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum = sum+fun.apply(arr[i]);
        }

        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {13,4,5,6,7,9,10,12,14};
        Function<Integer,Integer> even = (x)->{
            if(x%2==0){
                return x;
            }
            return 0;
        };
        Integer r1 = sum(arr,even);
        System.out.println(r1);
    }

}
