package Statements;

public class SmallestNumber {
    public static void main (String[]args) {
        int a = 10;
        int b = 9;
        int c = 25;

        if (a / b == 0 && a / c == 0) {
            System.out.println("a is the smallest");
        }
        else if(b / a == 0 && b / c == 0) {
            System.out.println("b is the smallest");
        }else{
            System.out.println("c is the smallest");
        }

    }
}
