package Oops;

import java.util.Scanner;

public class Testhuman {
    public static void main(String[] args) {
        Human h = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the gender");
        String gender = sc.next();
        if(gender.equalsIgnoreCase("Male")){
            h=new Male();
            h.welcome();
        }else{
            h=new Female();
            h.welcome();
        }
    }
}
