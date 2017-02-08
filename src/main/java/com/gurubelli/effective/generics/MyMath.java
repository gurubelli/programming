package com.gurubelli.effective.generics;

public class MyMath {
	public static <T extends MyTask> void add(T first, T second) {
		System.out.println(" I am in myTask");
	}

	public static void main(String[] args) {

	}

}

class MyTask {

}
