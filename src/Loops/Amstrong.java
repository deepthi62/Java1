package Loops;

import java.util.Scanner;

public class Amstrong {
    public static  void main(String[]args){
//        int n,r,c,arm=0;
//        System.out.println("enter any number");
//        Scanner sc=new Scanner(System.in);
//        n=sc.nextInt();
//        c=n;
//        while(n>0) {
//            r = n % 10;
//            arm = (r*r*r) + arm;
//            n = n/10;
//        }
//        if (c == arm)
//            System.out.println("armstrong number");
//
//        else
//            System.out.println("not armstrong number");
//
        int number , originalNumber=371,remainder,result=0;
        number = originalNumber;
        while(number!=0){
            remainder = number%10;
            result += Math.pow(remainder,3);
            number = number/10;
        }
        if(result==originalNumber){
            System.out.println("Armstrong number");

        }else{
            System.out.println("not Armstrong number");
        }

    }
}
