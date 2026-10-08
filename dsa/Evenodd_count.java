package com.dsa;

import java.util.ArrayList;

public class Evenodd_count {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		list.add(30);
		list.add(35);
		list.add(40);
		list.add(45);
		list.add(50);
		list.add(55);
		int evenCount=0;
		int oddCount=0;
		for(int num:list) {
			if(num%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
		}
		System.out.println(evenCount);
		System.out.println(oddCount);
		System.out.println(10<5);

	}

}
