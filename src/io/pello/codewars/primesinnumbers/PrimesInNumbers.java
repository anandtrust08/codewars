package io.pello.codewars.primesinnumbers;


import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class PrimesInNumbers {

    public static String factors(int n) {
        Map<Integer, Integer> factor = new TreeMap<Integer, Integer>();

        if (isPrime(n)) { return "(" + n + ")"; }

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                int partial = n;
                while (partial % i == 0) {
                    if (factor.containsKey(i)) {
                        factor.put(i, factor.get(i) + 1);
                    } else {
                        factor.put(i, 1);
                    }
                    partial = partial / i;
                    if (isItDone(factor, n))
                        break;
                }
                n = partial;
            }
        }

        return generateResult(factor);
    }

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        if (n == 2 || n == 3 || n == 5 || n == 7)
            return true;
        if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0)
            return false;
        long sqrtN = (long) Math.sqrt(n) + 1;

        for (long i = 6L; i <= sqrtN; i += 6) {
            if (n % (i - 1) == 0 || n % (i + 1) == 0)
                return false;
        }

        return true;
    }

    public static boolean isItDone(Map<Integer, Integer> factor, long result) {
        double partial = 0;
        Iterator it = factor.keySet()
            .iterator();

        while (it.hasNext()) {
            int key = (int) it.next();
            partial = (double) (partial + Math.pow(key, factor.get(key)));
        }

        return partial == result;
    }

    public static String generateResult(Map<Integer, Integer> factor) {
        String result = "";
        Iterator it = factor.keySet()
            .iterator();

        while (it.hasNext()) {
            int key = (int) it.next();
            result += "(" + key + ((factor.get(key) == 1) ? ")" : "**" + factor.get(key) + ")");
        }

        return result;
    }
}
