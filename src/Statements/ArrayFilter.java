package Statements;

public class ArrayFilter {

    public static boolean isDummyArray(int[]array){
         for(int i = 0;i< array.length;i++){
             if(array[i] !=0){
                 return false;
             }
         }

        return true;
    }
    public static int countNonzeros(int[]array){
        int count = 0;
        for(int i = 0;i< array.length;i++){
            if(array[i] !=0){
               count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {0,0,4,0,2,7};
        boolean result = isDummyArray(arr);
        System.out.println(result);
        int i = countNonzeros(arr);
        System.out.println(i);
    }
}
