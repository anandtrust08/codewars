package io.pello.codewars.urlmap;

import java.math.BigInteger;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;


public class UrlMap3 {
	  private HashMap<String, Long> timestamps = new HashMap<>();

	  public void setTimestamp(URL url, long timestamp) {
	    timestamps.put(url.toString(), timestamp);
	  }

	  public long getTimestamp(URL url) {
	    return timestamps.getOrDefault(url.toString(), -1L);
	  }
}
