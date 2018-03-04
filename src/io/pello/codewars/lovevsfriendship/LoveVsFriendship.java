package io.pello.codewars.lovevsfriendship;

import java.util.Arrays;

public class LoveVsFriendship {
	public static int wordsToMarks(String text) {
		int total = 0;
		for (int i =0;i< text.length();i++)
			total += text.charAt(i)-96;
//		Arrays.asList(text.split(""))
//			.stream()
//			.map(c -> (int)c-96)
//			.sum();
		return total;
	}
}
