package io.pello.codewars.urlmap;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;


public class UrlMap2 {
	private Map<Long, Long> table = new HashMap<Long, Long>();
	
	public  void setTimestamp(URL url, long timestamp) {
		Long code = new Long(System.identityHashCode(url));
		if (null != table.get(code)) {
			code = new Long(url.toString().length()+code);
		}
	    table.put(code,timestamp);
	  }//  new Long(System.identityHashCode(url))*new Long(9999999 * )

	public long getTimestamp(URL url) {
		Long code = new Long(System.identityHashCode(url));
		return table.getOrDefault(code,
				table.getOrDefault(url.toString().length()+code,-1L));
	}
}
