/**
 *   
 *   
 *   
 *   
 *   
 */
package com.gqt.corejava.patterns;
import java.util.Scanner;
/**
 * @author
 * @categort patterns
 * @description this is an example for conditional patterns
 */
public class pattern38 {

	/**
	 * @param args
	 * @description this contain source code for the patterns
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter count:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=n-i;j++) {
			
				System.out.print("- ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("$ ");
			}
			System.out.println();
		}

	}

}
