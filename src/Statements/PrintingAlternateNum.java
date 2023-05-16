package Statements;

import java.util.Scanner;

public class PrintingAlternateNum {
    private static int[] createArr() {
        int i, count;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length:");
        count = sc.nextInt();
        int a[] = new int[count];
        for (i = 0; i < count; i++) {
            System.out.println("Enter the number " + (i + 1) + ":");
            a[i] = sc.nextInt();
        }

        System.out.println("Original array:");
        for (i = 0; i < count; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
        return a;
    }

    public static void printArr(int arr[]) {
        System.out.println("Alternate array:");
        for (int i = 0; i < arr.length; i = i + 2) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = createArr();
        printArr(arr);
    }
}
