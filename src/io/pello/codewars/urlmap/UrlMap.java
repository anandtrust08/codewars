package io.pello.codewars.urlmap;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class UrlMap {
	private Map<Long, Long> table = new HashMap<Long, Long>();
	
	public void setTimestamp(URL url, long timestamp) {
	    table.put(new Long(System.identityHashCode(url))*new Long(9999* url.toString().length()),timestamp);
	  }

	public long getTimestamp(URL url) {
		return table.getOrDefault(new Long(System.identityHashCode(url))*new Long(9999* url.toString().length()),-1L);
	}
}
