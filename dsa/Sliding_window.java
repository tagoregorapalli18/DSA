package com.dsa;

public class Sliding_window {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 5, 3, 2 ,18};
		int k = 3;
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		int temp = sum;
		for (int j = k; j < arr.length; j++) {
			sum = sum - arr[j - k] + arr[j];
			if (sum > temp) {
				temp = sum;
			}
		}
		System.out.println(temp);
	}

}
 