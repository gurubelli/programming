package com.gurubelli.effective.generics;

import java.util.Arrays;
import java.util.EmptyStackException;

public class GenericStack<E> {

	private E[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	// Set<?> set = new HashSet();

	@SuppressWarnings("unchecked")
	public GenericStack() {
		elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY]; // new
																// E[DEFAULT_INITIAL_CAPACITY];
																// Can not
																// create
																// generic type
																// for Array
	}

	public void push(E e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public E pop() {
		if (size == 0)
			throw new EmptyStackException();
		return elements[--size];
	}

	/**
	 * Ensure space for at least one more element, roughly doubling the capacity
	 * each time the array needs to grow.
	 */
	private void ensureCapacity() {
		if (elements.length == size)
			elements = Arrays.copyOf(elements, 2 * size + 1);
	}
}

class GeneicStackSecondWay<E> {

	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	// Set<?> set = new HashSet();

	@SuppressWarnings("unchecked")
	public GeneicStackSecondWay() {
		elements = new Object[DEFAULT_INITIAL_CAPACITY]; // new
															// E[DEFAULT_INITIAL_CAPACITY];
															// Can not
															// create
															// generic type
															// for Array
	}

	public void push(E e) {
		ensureCapacity();
		elements[size++] = e;
	}

	// @SuppressWarnings("unchecked") --> Try to minimize the suppress warning
	// to some level
	public E pop() {
		if (size == 0)
			throw new EmptyStackException();
		@SuppressWarnings("unchecked")
		E result = (E) elements[--size];
		return result;
	}

	/**
	 * Ensure space for at least one more element, roughly doubling the capacity
	 * each time the array needs to grow.
	 */
	private void ensureCapacity() {
		if (elements.length == size)
			elements = Arrays.copyOf(elements, 2 * size + 1);
	}

}
