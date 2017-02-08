package com.gurubelli.effective.generics;

public class Item28BoundedWildcard {

	// Use bounded wildcards to increase API flexibility
	public static void main(String[] args) {

		Stack<Number> numberStack = new Stack<Number>();
	}

	static class Stack<E> {
		public Stack() {

		}

		public void push(E e) {

		}

		public E pop() {
			return null;
		}

		public boolean isEmpty() {
			return false;
		}
	}
}
