package com.nt.programs;

import java.util.Scanner;

public class SwappingOfTwoNumbers {
	public static void main(String[] args) {
		int x,y,temp;
		System.out.println( "Enter x and y values");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("Before swapping"+x +y);
		temp=x;
		x=y;
		y=temp;
		System.out.println("after swapping"+x +y);

	}

}
