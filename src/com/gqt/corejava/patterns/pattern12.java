package com.gqt.corejava.patterns;
import java.util.Scanner;
public class pattern12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the count:");
        int n=sc.nextInt();
        int a=n*n;
        for(int i=1;i<=n;i++) {
        	for(int j=1;j<=n;j++) {
        	System.out.print(a+" ");
        	a=a-1;
        }
       System.out.println();
	}
  }
}
