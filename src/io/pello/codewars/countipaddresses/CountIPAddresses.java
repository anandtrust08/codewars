package io.pello.codewars.countipaddresses;

public class CountIPAddresses {
    public static long ipsBetween(String start, String end) {
        String octets1[] = start.split("\\.");
        String octets2[] = end.split("\\.");
        Integer diff[] = new Integer[] { 
                Integer.valueOf(octets2[0]) - Integer.valueOf(octets1[0]),
                Integer.valueOf(octets2[1]) - Integer.valueOf(octets1[1]),
                Integer.valueOf(octets2[2]) - Integer.valueOf(octets1[2]),
                Integer.valueOf(octets2[3]) - Integer.valueOf(octets1[3])
                };  
        return (diff[0]  * 256 * 256 * 256) 
                    + (diff[1] * 256 * 256) 
                        + (diff[2]*256) + diff[3];
    }
}
