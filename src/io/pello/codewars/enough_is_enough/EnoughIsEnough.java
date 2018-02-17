package io.pello.codewars.enough_is_enough;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

public class EnoughIsEnough {
	public static int[] deleteNth(int[] elements, int maxOcurrences) {
		Hashtable<Integer, Integer> times = new Hashtable<Integer, Integer>();
		
		for (int e: elements) 
				times.put(e, 0);
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		for (int e: elements) {
			if (times.get(e) < maxOcurrences) {
				times.put(e, times.get(e) + 1);
				numbers.add(e);
			}
		}
		
		int[] array = new int[numbers.size()];
		for(int i = 0; i < numbers.size(); i++) array[i] = numbers.get(i);
		
		return array;
	}


}
