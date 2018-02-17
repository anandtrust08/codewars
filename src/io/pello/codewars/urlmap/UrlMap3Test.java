package io.pello.codewars.urlmap;
import static org.junit.Assert.*;
import org.junit.Test;

import java.math.BigInteger;
import java.net.URL;
import java.util.Random;
public class UrlMap3Test {
  private Random r = new Random();
  @Test
  public void testCodewars() throws Exception {
    UrlMap3 map = new UrlMap3();
    URL url1 = new URL("http://www.codewars.com/");
    long time1 = 12345L;
    URL url2 = new URL("http://www.codewars.com/kata/url-timestamps/");
    long time2 = 67890L;
    map.setTimestamp(url1, time1);
    map.setTimestamp(url2, time2);
    assertEquals(time1, map.getTimestamp(url1));
    assertEquals(time2, map.getTimestamp(url2));
  }  

  @Test
  public void testNew() throws Exception {
    UrlMap3 map = new UrlMap3();
    URL url1 = new URL("http://www.codewars.com/");
    URL url2 = new URL("http://www.codewars.com/kata/url-timestamps/");
    assertEquals(-1, map.getTimestamp(url1));
    assertEquals(-1, map.getTimestamp(url2));
  }
  
  //1_000_000: 4s
  // 10_000_000: 105s
  @Test
  public void testTime() throws Exception { 
	   UrlMap3 map = new UrlMap3();
	  for (int i=0;i<100;i++) {
		    URL url2 = new URL("http://" + r.nextInt(100000000) + " " + r.nextInt(100000000) );
		    long time2 = r.nextInt(100000000);
		    map.setTimestamp(url2, time2);
		    
		    assertEquals(time2, map.getTimestamp(url2));
	  }	  
  }
  
  @Test
  public void testRepeat() throws Exception { 
	   UrlMap3 map = new UrlMap3();
	  for (int i=0;i<1000000;i++) {
		    URL url = new URL("http://" + r.nextInt(100000000) + " " + r.nextInt(100000000) );
		    long time2 = r.nextInt(100000000);

		    BigInteger n = BigInteger.valueOf(System.identityHashCode(url)).shiftLeft(url.toString().length());
		    if (map.getTimestamp(url) != -1) {
		    	System.err.println("OSTRASSSSSSSSSSSS-------------------------------------\nAlready: " + map.getTimestamp(url) + "\n\t url: " + url + "\n\t n: " + n);
		    }
		    map.setTimestamp(url, time2);
		    System.out.println(url+ " " + n);
	  }	  
  }
}

