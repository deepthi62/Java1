package Statements;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintDigits {
    public static void main (String[]args){

        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        ArrayList <Integer> digitsList = new ArrayList<>();
         while(num>0){
            int unitdigit = num % 10;
            digitsList.add(0,unitdigit);
            num = num/10;
        }
        System.out.println("The digits of the given number : ");
            for(int digit : digitsList){
                System.out.println(digitsList);
            }
    }

}
