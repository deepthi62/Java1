package Statements;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintDigits {
    public static void main (String[]args){

        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        ArrayList <Integer> digitsList = new ArrayList<>();

        while(num >0){  // 525 >0 , 52 >0 , 0.2>0
            int digit = num%10; //525%10 = 5 , 52%10 = 2, 5%10 = 5
            digitsList.add(0,digit); // (0,5) , (1,2) , (2,5)
            num = num/10;  // 525/10 , 52/10, 5/10
        }
        System.out.println("The digits of the given number : ");
            for(int digit : digitsList){
                System.out.println(digitsList);
            }
    }

}
