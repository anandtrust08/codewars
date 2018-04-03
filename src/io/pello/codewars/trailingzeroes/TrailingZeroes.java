package io.pello.codewars.trailingzeroes;

public class TrailingZeroes {
    public static int zeros(int n) {
        long result = n--;
        System.out.println("Init: " + result);   
        if (n == 0) return 0;
        
        while(n>1) {
            System.out.println("Loop: " + result + " n: " + n); 
            result *= (n--);
        }

        int total = 0;
        System.out.println(result + ", " + total);   
        while (result % 10 == 0) {
            total++;
            result /= 10;
        }
        System.out.println(result + ", " + total);
        
        return total;
    }
}
