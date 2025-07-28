package com.gqt.corejava.patterns;
import java.util.Scanner;
public class pattern19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter count:");
		int n= sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				
					System.out.print("- ");
				}
			for( int k=1;k<=n;k++) {
				System.out.print("@ ");
			}
			System.out.println();
		}

	}

}
