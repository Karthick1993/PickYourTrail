package com.pickyourtrail.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program1 {

	public static int getMinimumUniqueSum(List<Integer> arr) {
		int sum=0;
		Set<Integer> unique=new HashSet<Integer>();
		for(Integer element:arr) {
			if(unique.contains(element)) {
				for(int i=element+1;i<Integer.MAX_VALUE;i++) {
					if(!arr.contains(i)) {
						sum+=i;
						unique.add(element);
						break;
					}
				}
			}else {
			unique.add(element);
			sum+=element;
			}
			
		}
		return sum;
	}
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(2);
		list.add(7);
		System.out.println(Program1.getMinimumUniqueSum(list));
		
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(2);
		System.out.println(Program1.getMinimumUniqueSum(list1));
		
	}
}
