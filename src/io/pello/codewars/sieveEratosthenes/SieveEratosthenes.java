package io.pello.codewars.sieveEratosthenes;

import java.util.List;
import java.util.ArrayList;

public class SieveEratosthenes {

  //return all primes less than x
  static public List<Integer> Primes(Integer x){
  
    List<Integer> results = new ArrayList<Integer>();
    if (x <2) return results;
   for (int i = 0; i<= x; i++)  
      results.add(i);

    int check = x;
    while (check >= 2) {
      System.out.println("Checking: " + results.get(check));
      if (  (results.get(check) % 2 == 0 && check != 2) 
            || (results.get(check) % 3 == 0  && check !=3) 
            || (results.get(check) % 5 == 0 && check != 5)
            || (results.get(check) % 7 == 0 && check != 7) )
      {  
        results.remove(check);
     }
     check--;
    }
    if (x > 2) {results.remove(0);results.remove(0); }
    return results;
  }
}