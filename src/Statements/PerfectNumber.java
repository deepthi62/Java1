package Statements;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive Integer");
        int num = Integer.parseInt(sc.nextLine().trim());

        if(isPerfectNumber(num)){
            System.out.println("Given number: " +num+ " is Perfect Number");
        }else{
            System.out.println("Given number: " +num+ " is not perfect Number");
        }
    }

    public static boolean isPerfectNumber(int num) {
        int tempNum = num;
        int sum = 0;
        for(int i=1;i<=num/2;i++){
                  if(num % i == 0){
                      sum += i;

                      if(tempNum == sum)
                          return true;

                  }
        }
        return false;
    }

}
