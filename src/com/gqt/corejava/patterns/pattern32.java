package com.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter count: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            char c = (char) ('A' + i - 1);
            for (int j = 1; j < i; j++) {
                System.out.print(c + " ");
                c--; 
            }

            System.out.print("A ");
            c = 'A'; 
            for (int j = 1; j < i; j++) {
                System.out.print(c + " ");
                c++;
            }

            System.out.println();
        }
    }
}
