package io.pello.codewars.perfectpower;

public class PerfectPower {
    public static int[] isPerfectPower(int n) {
        if (n < 4)  return null;
        

        for (int i = 2; i < Math.log(n) / Math.log(2) + 1; i++) 
            for (int j = 2; Math.pow(j, i) <= n; j++) 
                if (Math.pow(j, i) == n) 
                    return new int[]{j, i};

                    
        return null;
    }

    public static double sqrt(int number, int base) {
        double t;

        double squareRoot = number / base;
        int count = 0;

        do {
            t = squareRoot;
            squareRoot = (t + (number / t)) / base;
            System.out.println(t+ " "+ squareRoot);
            if (++count == number) break;
        } while ((Math.round(t) - Math.round(squareRoot)) != 0);

        return squareRoot;
    }

    public static boolean noDecimals(double n) {
        return (n % 1 == 0);
    }
}
