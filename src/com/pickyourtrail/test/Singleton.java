package com.pickyourtrail.test;

public class Singleton {

	private static Singleton singleton;
	private Singleton() {
		
	}
	public Singleton getInstance() {
		if(singleton==null) {
			synchronized (singleton) {
				if(singleton==null) {
					singleton=new Singleton();
				}
			}
		}
		return singleton;
	}
}
