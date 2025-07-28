package com.gqt.corejava.patterns;
import java.util.Scanner;
public class pattern_c_3{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value:");
        int n=sc.nextInt();
        System.out.println("enter the m value:");
        int m=sc.nextInt();
        for(int i=1;i<=n;i++) {
        	for(int j=1;j<=m;j++) {
        		int rem=(i+j)%2;
        		if(rem==0) {
        			System.out.print("1");
        		}
        		 if(rem==1) {
        			System.out.print("0");
        		}
        }
       System.out.println();
	}
  }
}
