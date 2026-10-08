package com.dsa;

import java.util.Scanner;

public class Scanner_prime {

	//Read the element from the Scanner and Represent the same.?
	//print the prime numbers from given array..?
	
	
	
	public static boolean status =true;
	
	//still there
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
		System.out.println("Enter the element :");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("representing the elements:");
		for(int a:arr) {
			if(isprime(a)) {
				System.out.println(a);
			}
		}
		

	}

}
