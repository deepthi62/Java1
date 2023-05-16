package Functions;

public class EvenOddfun {
    public static boolean isEven(int x){
          boolean result = (x%2 == 0);
        return result;
    }

    public static void main(String[]args){
        boolean r = isEven(4);
        System.out.println(r);
    }


}
