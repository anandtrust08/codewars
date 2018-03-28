package io.pello.codewars.longtoip;

public class LongToIP {
    public static String longToIP(long ip) {
        String binary = prepend(longToBin(ip), "0", 32);

        long octets[] = new long[] { 
                binToLong(binary.substring(0, 8)), 
                binToLong(binary.substring(8, 16)), 
                binToLong(binary.substring(16, 24)), 
                binToLong(binary.substring(24, 32)) };
        
        return octets[0] + "." + octets[1] + "." + octets[2] + "." + octets[3];
    }

    public static String longToBin(long number) {
        long n = number;
        StringBuilder result = new StringBuilder("");
        while (n >= 2) {
            result.append(n % 2);
            n = n / 2;
        }

        result.append(n);

        return result.reverse()
            .toString();
    }

    public static long binToLong(String bin) {
        long result = 0;
        String reversed = new StringBuilder(bin).reverse()
            .toString();

        for (int i = 0; i < reversed.length(); i++) {
            int val = Integer.valueOf(reversed.charAt(i) + "");
            result += (val * Math.pow(2, i));
        }

        return result;
    }

    public static String prepend(String number, String what, int length) {
        String result = number;
        int total = length - number.length();
        for (int i = 0; i < total; i++)
            result = what + result;

        return result;
    }

}
