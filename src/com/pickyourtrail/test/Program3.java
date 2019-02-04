package com.pickyourtrail.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program3 {

	public static int countPairs(List<Integer> a,int k) {
		int count=0;
		Set<Integer> set=new HashSet<Integer>();
		set.addAll(a);
		a.addAll(set);
		for(int i=0;i<set.size();i++) {
			for(int j=0;j<set.size();j++) {
				if(a.get(i)<=a.get(j) && a.get(i)+k==a.get(j)) {
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(3);
		System.out.println(Program3.countPairs(list, 1));
	}
}
