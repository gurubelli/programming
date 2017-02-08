package com.gurubelli.effective.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class GenericDemo {

	public static void main(String[] args) {

		// Do not do this //raw type.
		// Item 23 : Do not use raw type in new code.
		List myList = new ArrayList();

		Set set = new HashSet<>();
		Map<Integer, Integer> map = new ConcurrentHashMap<>();
		// Collections.synchronizedMap(m)
		set.add("Hello");
		// You must use raw types in class literals.

		// Item 24: Eliminate unchecked warnings
		// Item 25: Prefer Lists to arrays -->
		Object[] oArray = new Long[1];
		oArray[0] = "I don't fit in"; // Throws ArrayStoreException

		// List<Object> ol = new ArrayList<Long>(); // Incompatible types
		// ol.add("I do not fit in");

		// Item 26: Favor generic types

	}

	void contains(Set<?> s1, Set<?> s2) {

	}

	class MyList<E> extends ArrayList<E> {

		@Override
		public boolean add(E e) {

			return super.add(e);
		}

		@Override
		public <T> T[] toArray(T[] a) {
			return super.toArray(a);
		}
	}

	class MyMap<K, V> extends HashMap<K, V> {

		/**
		 *
		 */
		private static final long serialVersionUID = 1L;

	}

}
