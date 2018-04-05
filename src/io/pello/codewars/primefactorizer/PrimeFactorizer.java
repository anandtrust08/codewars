package io.pello.codewars.primefactorizer;

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
        
        if (isPrime(n)) { factor.put(n,1); return factor;}
        
        for (long i = 2;i<n;i++) {
            if (isPrime(i)) {
                long partial = n;
                while (partial % i == 0) {
                    System.out.println("Paentro : \n" + factor);
                    if (factor.containsKey(i)) {
                        factor.put(i, factor.get(i)+1);
                        System.out.println("Already: \n" + factor);
                    } else {
                        factor.put(i, 1);
                        System.out.println("New : \n" + factor);
                    }
                    partial = partial / i;
                }

            }
            
            if (isItDone(factor,n)) break;
            
        }
        
    
    
        
        return factor;
      }
    
    public boolean isPrime(long n) {
        
        if (n<2) return false;
        
        for (long i = n-1;i>1;i--) 
            if (n % i == 0)
                return false;
        
        return true;
    }
    
    public boolean isItDone(Map<Long, Integer> factor, long result) {
        double partial = 0;
        Iterator it = factor.entrySet().iterator();
        
        while (it.hasNext()) {
            Map.Entry<Long, Integer> pair = (Entry<Long, Integer>)it.next();
            partial = (double) (partial + Math.pow(pair.getKey(), pair.getValue()));
            System.out.println(pair.getKey() + " = " + pair.getValue() + " partial: " + partial + " == " +result);
        }
        
        return partial == result;
    }
}
