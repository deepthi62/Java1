package Loops;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        int a,b,x,y,t,hcf,lcm;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number : ");
        x = sc.nextInt();
        y = sc.nextInt();

        a = x;
        b = y;

        while(b!=0){
            t = b;
            b = a%b;
            a = t;
        }

        hcf = a;
        lcm = (x*y)/hcf;

        System.out.println("HCF = " + hcf);
        System.out.println("/nLCM = " + lcm);
    }
}
