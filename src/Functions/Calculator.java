package Functions;

import java.util.Scanner;

public class Calculator {
    public static float sum(float a,float b){
        float s = a+b;
        return s;
    }
    public static float sub(float a, float b){
             float s = a-b;
        return s;
    }
    public static float mul(float a, float b){
        float s = a*b;
        return s;
    }
    public static float div(float a , float b){
        float s = a/b;
        return s;
    }
    public static float sqrt(float a){
        return (float)Math.sqrt(a);
    }

    public static void main(String[] args) {
        System.out.println("Enter the operation");
        System.out.println("1. SUM/n2. MINUS/n3 PRODUCT/n4 DIVISION/n5 SQUARE_ROOT/n");
        System.out.println("Nth under_root");
        System.out.println("Enter your choice");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        Calculator cc = new Calculator();
        switch(c){
            case 1:
                System.out.println("Enter the two numbers to be added");
                float a1 = sc.nextInt();
                float a2 = sc.nextInt();
                double ss = cc.sum(a1,a2);
                System.out.println(ss);
                break;

            case 2:
                System.out.println("Enter the two numbers to be substracted");
                float s1 = sc.nextFloat();
                float s2 = sc.nextInt();
                double su = cc.sub(s1,s2);
                System.out.println(su);
                break;

            case 3:
                System.out.println("Enter the two numbers to be Multiplied");
                float m1 = sc.nextFloat();
                float m2 = sc.nextInt();
                double mm = cc.mul(m1,m2);
                System.out.println(mm);
                break;

            case 4:
                System.out.println("Enter the two numbers to be Divided");
                float d1 = sc.nextFloat();
                float d2 = sc.nextInt();
                double div = cc.sum(d1,d2);
                System.out.println(div);
                break;

            case 5:
                System.out.println("Enter the number whose square root to be calculated");
                float r = sc.nextFloat();
                double sr = cc.sqrt(r);
                System.out.println(sr);
                break;

            default:
                System.out.println("Warning ! Enter correct choice");
                break;
        }

    }
}
