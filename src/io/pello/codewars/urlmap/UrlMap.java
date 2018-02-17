package io.pello.codewars.urlmap;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class UrlMap {
	private Map<Integer, Long> table = new HashMap<Integer, Long>();
	
	public void setTimestamp(URL url, long timestamp) {
	    table.put(System.identityHashCode(url),timestamp);
	  }

	public long getTimestamp(URL url) {
		return table.getOrDefault(System.identityHashCode(url),-1L);
	}
}
