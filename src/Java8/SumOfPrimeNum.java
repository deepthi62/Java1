package Java8;

import java.util.function.Function;

public class SumOfPrimeNum {
    public static int sum(int arr[], Function<Integer,Integer> fun){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum = sum+fun.apply(arr[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,6,8,9,12,17,20};
        Function<Integer,Integer> prime = (x)->{
            int count =0;
            for(int i=1;i<=x;i++){
                if(x%i==0){
                    count++;
                }
            }
            if(count==2){
                return x;
            }
            return 0;
        };

        Integer r1 = sum(arr,prime);
        System.out.println(r1);

    }

}
