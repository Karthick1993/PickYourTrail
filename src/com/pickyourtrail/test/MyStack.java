package com.pickyourtrail.test;

public class MyStack {
	private int top=-1;
	private Integer[] stack;
	private int MAX_SIZE;
	
	
	public MyStack(int maxSize) {
		stack=new Integer[maxSize];
		this.MAX_SIZE=maxSize;
	}


	public void push(Integer element) {
		if(top>=MAX_SIZE) {
			System.out.println("Stack Overflow");
		}else {
			top++;
			stack[top]=element;
			print();
		}
	}
	public void pop() {
		if(top>0) {
			top--;
			print();
		}else {
		System.out.println("Empty");
		}
	}
	public void inc(int n,int increment) {
		if(n<top) {
		for(int i=0;i<n;i++) {
			stack[i]+=increment;
		}
		print();
		}else {
			System.out.println("Index not found");
		}
	}
private void print() {
	if(top<0) {
		System.out.println("EMPTY");
	}else {
	System.out.println(stack[top]);
	}
}

	public static void main(String[] args) {
		MyStack myStack=new MyStack(12);
		myStack.push(5);
		myStack.pop();
		myStack.push(3);
		myStack.push(2);
		myStack.push(1);
	}
}
