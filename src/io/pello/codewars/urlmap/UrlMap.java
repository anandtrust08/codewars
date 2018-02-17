package io.pello.codewars.urlmap;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class UrlMap {
	private Map<Integer, Long> table = new HashMap<Integer, Long>();
	
	public void setTimestamp(URL url, long timestamp) {
	    table.put(url.hashCode(), timestamp);
	  }

	public long getTimestamp(URL url) {
		Integer i = url.hashCode();
		return table.get(i)== null?-1:table.get(i);
	}
}
