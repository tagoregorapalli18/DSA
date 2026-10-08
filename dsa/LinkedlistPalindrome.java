package com.dsa;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedlistPalindrome {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
       LinkedList<Integer> list=new LinkedList<>();
       System.out.println("Enter the number :");
       int n=sc.nextInt();
       System.out.println("Enter the Elements :");
       for(int i=0;i<n;i++) {
    	   list.add(sc.nextInt());
       }
       
       boolean isPalindrome = true;
       
       int left=0;
       int right=list.size()-1;
       
       while(left < right) {
    	   if(!list.get(left).equals(list.get(right))) {
    		   isPalindrome=false;
    		   break;
    	   }
    	   left++;
    	   right--;
       }
       if(isPalindrome) {
    	   System.out.println("Palindrome");
       }
       else {
    	   System.out.println("Not Palindrome");
       }
       sc.close();
	}

}
