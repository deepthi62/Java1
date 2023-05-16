public class PrimeNumbers {

    public static boolean isPrime(int n){
        int count =0;
        for(int i=1;i<=n;i++){
            if(n%i==0) {
                count++;
            }
        }
        return count == 2;
    }

    public static int[] getPrime(int arr[]){
        int outputarr[] = new int[5];
        int i = 0;
        for(int index=0;index< arr.length;index++){
            int x = arr[index];
            boolean isPrime = isPrime(x);
            if(isPrime){
                outputarr[i]=x;
                i++;
            }

        }

        return outputarr;
    }


    public static void main(String[]args){
        boolean result = isPrime(12);
        System.out.println(result);
        int arr[] = {12,14,17,3,4};
        int[] result1 = getPrime(arr);
        for(int res:result1){
            System.out.println(res);
        }

    }
}
