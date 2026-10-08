package com.dsa;

public class Min_maxvalues {

	//Find Min &max elements from given array..?
	public static void main(String[] args) {
		//String [] names={"srikanth","java","vcube","viswa"};
		int [] num= {1,2,3,4,5,66,7};
		int min=num[0];
		int max=num[0];
//		for(int i=0;i<num.length;i++) {
//			if(num[i]<min) {
//				min=num[i];
//			}
//			else if (num[i]>max) {
//				max=num[i];
//			}
//		}
		for(int n:num) {
			if(n<min) {
				min=n;
			}
			else if(n>max) {
				max=n;
			}
		}
		System.out.println(min);
		System.out.println(max);

	}

}
