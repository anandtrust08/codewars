package io.pello.codewars.reverse_words;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.StreamSupport;

public class ReverseWords{

	 public static String reverseWords(String str){

	   /*return Arrays.asList(str.split(" "))
	    .stream()
		.collect(Collectors.toCollection(LinkedList::new))
		.descendingIterator()							   // Iterator<String>
		.map(s -> System.out::println);*/

		/* Arrays.asList(str.split(" "))
	    .stream()
		.collect(Collectors.toCollection(LinkedList::new))
		.descendingIterator().forEachRemaining(e -> {return e;});*/
		 List<String> list = Arrays.asList(str.split(" "));
		 Collections.reverse(list);
		 return list.stream().collect(Collectors.joining(" "));
	  
	 }
	}