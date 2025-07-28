package com.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
            	char c=(char) ('A' + j - 1);
                System.out.print(c + " ");
            }
            for (int j = 1; j < i; j++) {
            	char c=(char) ('A' + j - 1);
                System.out.print(c+ " ");
            }

            System.out.println();
        }
    }
}
