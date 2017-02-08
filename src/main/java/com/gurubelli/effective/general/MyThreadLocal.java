package com.gurubelli.effective.general;

public class MyThreadLocal {

	public static void main(String[] args) {
		ThreadLocal myTLocal = new ThreadLocal<>();
		myTLocal.set("surya");
		myTLocal.set("hasitha");
		;
	}
}
