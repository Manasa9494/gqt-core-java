package com.gqt.corejava.patterns;
import java.util.Scanner;
public class pattern34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

           
            for (int j = 1; j <= (2 * i - 1); j++) {
            	char c=(char)('A' + 2 * i -j - 1) ;
                System.out.print(c+ " ");
            }

            System.out.println();
        }
    }
}

