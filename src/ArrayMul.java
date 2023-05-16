public class ArrayMul {

    public static int[] mulArray(int[]arr){
        int[] newArray = new int[arr.length];
        for(int index = 0; index< arr.length; index++){
            newArray[index] = arr[index]*2;
        }

        return newArray;
    }

    public static void main(String[] args) {

        int arr[] = {10,20,4};
        int output[] = mulArray(arr);
        for(int val : output){
            System.out.println(val);
        }

    }

}
