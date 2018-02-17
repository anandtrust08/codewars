package io.pello.codewars.urlmap;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

public class UrlMap {
	private Map<BigInteger, Long> table = new HashMap<BigInteger, Long>();
	
	
	public synchronized void setTimestamp(URL url, long timestamp) {
	    table.put(BigInteger.valueOf(System.identityHashCode(url)).shiftLeft(url.toString().length()),timestamp);
	  }//  new Long(System.identityHashCode(url))*new Long(9999999 * )

	public long getTimestamp(URL url) {
		return table.getOrDefault(BigInteger.valueOf(System.identityHashCode(url)).shiftLeft(url.toString().length()),-1L);
	}
}
