package io.pello.codewars.primefactorizer;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;

public class PrimeFactorizer {
    public java.util.Map<Long, Integer> factor(long n){
        Map<Long, Integer> factor = new HashMap<Long, Integer>();
       
    
             System.out.println(n);
        if (isPrime(n)) { factor.put(n,1); return factor;}
        
        for (long i = 2;i<=n;i++) {
            if (isPrime(i)) {
                long partial = n;
                while (partial % i == 0) {
                    if (factor.containsKey(i)) {
                        factor.put(i, factor.get(i)+1);
                    } else {
                        factor.put(i, 1);
                    }
                    partial = partial / i;
                    if (isItDone(factor,n)) break;
                }
               n = partial;
            }
     }
        System.out.println(factor);
        return factor;
      }
    
  /*  @SuppressWarnings("unchecked")
    public boolean isPrime(long n) {
        if (n < 2) return false;
        if (n % 2 == 0) return (n == 2);
        int root = (int)Math.sqrt((double)n);
        for (int i = 3; i <= root; i += 2)
        {
            if (n % i == 0) return false;
        }
        return true;
    }*/
    
    boolean isPrime(long n) {
        if(n < 2) return false;
        if(n == 2 || n == 3 || n==5 || n==7) return true;
        if(n%2 == 0 || n%3 == 0 || n%5==0 || n%7==0) return false;
        long sqrtN = (long)Math.sqrt(n)+1;
        if (n <= 10967535067l) {
            for(long i = 6L; i <= sqrtN; i += 6) {
                if(n%(i-1) == 0 || n%(i+1) == 0) return false;
            }
        } else {
            BigInteger bi = new BigInteger(n+"");
            return bi.isProbablePrime(15);
        }
        return true;
    }
    
    @SuppressWarnings("unchecked")
    public boolean isItDone(Map<Long, Integer> factor, long result) {
        double partial = 0;
        Iterator it = factor.entrySet().iterator();
        
        while (it.hasNext()) {
            Map.Entry<Long, Integer> pair = (Entry<Long, Integer>)it.next();
            partial = (double) (partial + Math.pow(pair.getKey(), pair.getValue()));
        }
        
        return partial == result;
    }
}
