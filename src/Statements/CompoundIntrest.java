package Statements;

public class CompoundIntrest {
    public static void main(String[]args){
        int p = 3000;
        int t = 2;
        double r = 1;
        int n = 13;

        double amount = p*Math.pow(1+(r/n),n*t);
        double intrest = amount-p;
        System.out.println("compound intrest after " + t + "years: " + amount);
        System.out.println("After amount " + t + "years: " + intrest);
    }

}
