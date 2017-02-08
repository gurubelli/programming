package com.gurubelli.effective.generics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Item27FavorGenericMethod {

	public static Set union(Set s1, Set s2) {
		Set result = new HashSet();
		result.addAll(s2);
		return result;

	}

	public static <E> Set<E> union2(Set<E> s1, Set<E> s2) {
		Set<E> result = new HashSet<>();
		result.addAll(s2);
		return result;
		// Limitation : The types of all three sets have to be the same
		// You can make the method more flexible by using bounded wildcard types

		// Type Inference :: You need not specify the value of the type paramter
		// explictily -- However, it has been implemented in Java 7 onwards
		//
	}

	public static <K, V> HashMap<K, V> newHashMap() {
		return new HashMap<K, V>();
	}

}
