package Functions;

import java.util.Scanner;
@SuppressWarnings("resource")

public class ReverseGivenNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


//        int reverse = 0;
        System.out.println();
    }

    private static int reverse(int n){
        int reverse = 0;
        while(n>0){
            int last_digit = n%10;
            reverse = reverse*10 + last_digit;
            n = n/10;
        }
        return reverse;

    }

}
