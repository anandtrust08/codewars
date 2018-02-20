package io.pello.codewars.stocklist;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;
public class StockList {
		
	  // 1st parameter is the stocklist (L in example), 
		// 2nd parameter is list of categories (M in example)
		public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
		      if (lstOfArt == null || lstOfArt.length == 0) { return "";}			
		      //Hashtable<String, Integer> library = new Hashtable<String, Integer>();
			/*for (String s: lstOfArt) {
				String [] code = s.split(" ");
				String key = code[0].substring(0,1);
				int qty = Integer.parseInt(code[1]);
				
				if (library.containsKey(key)) 
					library.put(key, library.get(key) + qty);
				else 
					library.put(key, qty);
			}*/
		   Map<String, Integer> library = 
				   Arrays.asList(lstOfArt)
				   .stream()
				   .map(k -> k.split(" "))
				   .collect(Collectors.groupingBy(splitLine -> ""+splitLine[0].substring(0,1),
		                    Collectors.summingInt(splitLine -> Integer.valueOf(splitLine[1]))));
		                    //Collectors.mapping(splitLine -> Integer.valueOf(splitLine[1]), Collectors.toList())));
		   
		   System.out.println(library);
			
			return Arrays.asList(lstOf1stLetter)
				.stream()
				.map(key -> "(" + key +" : " + (library.get(key)!=null?library.get(key):0) +  ")")
				.collect(Collectors.joining(" - "));
		}
}
