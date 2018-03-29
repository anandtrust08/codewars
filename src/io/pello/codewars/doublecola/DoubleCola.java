package io.pello.codewars.doublecola;

import java.util.ArrayList;
import java.util.List;

public class DoubleCola {
    public static String WhoIsNext(String[] names, int n) {
        if (n <= names.length) return names[n-1];

        int mul = names.length;
        while (mul <= n+4) 
            mul *= 2;
        
        System.out.println("n: " +n + " mul: " + mul);
        int base = mul/2;
        int jump = ((base*2) / names.length) / 2;
        int div = ((n+4) - (mul / 2)) / jump;
       // int rem = (n - base) % total;
       
        String result = WhoIsNextSlow(names, n);
        System.out.println(base + " and jump: " + jump + ", and div: " + div + " result: " + result + " our: " + names[div]);
        return result;
        //return names[div];
    }
    
    public static String WhoIsNextSlow(String[] names, int n) {
        if (n <= names.length) return names[n-1];
        List<Integer> queue = new ArrayList<Integer>();
        int selected = 0;
        
        for (int i=0;i<names.length;i++) 
            queue.add(i);

        while (n > 0) {
            System.out.println(queue + ". Length: " + queue.size());
            int current = queue.get(0);
            queue.remove(0);
            queue.add(current);
            queue.add(current);
            n--;
        }
        
        return names[queue.get(0)];
    }
}
