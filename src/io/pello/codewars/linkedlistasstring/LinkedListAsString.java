package io.pello.codewars.linkedlistasstring;

public class LinkedListAsString {

	public static String stringify(Node list) {
		if (null == list)
			return "null";
		Node node = list;
		String result = "";
		do {
			result += node.getData() + " -> ";
		} while ((node = node.getNext()) != null);
		return result + "null";
	}

}
