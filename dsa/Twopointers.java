package com.dsa;

import java.util.Arrays;

public class Twopointers {

	public static void main(String[] args) {
		int []arr= {9,8,7,6,5,4,3};
		int temp=0;
		int left=0;
		int right=arr.length-1;
		while(left<right) {
			temp=arr[left];
			arr[left]=arr[right];
			left++;
			arr[right]=temp;
			
			right--;
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
