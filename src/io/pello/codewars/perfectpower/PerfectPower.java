package io.pello.codewars.perfectpower;

public class PerfectPower {
    public static int[] isPerfectPower(int n) {
        if (n < 4) {
            return null;
        }

        int limit = (int)(n / 2);

        for (int i = 2; i <= limit; i++) {
            double r = sqrt(n, i);
            System.out.println(n + ": " + i + "<= "+ limit +", r:" + r);
            if (noDecimals(r) && Math.pow(r, i) == n) {
                System.out.println(n + ". Found: {" + (int) r + "," + i + "}");
                return new int[] { (int) r, i };
            } 
        }

        return null;
    }

    public static double sqrt(int number, int base) {
        double t;

        double squareRoot = number / base;

        do {
            t = squareRoot;
            squareRoot = (t + (number / t)) / base;
            System.out.println(Math.round(t) + " "+ Math.round(squareRoot));
        } while ((Math.round(t) - Math.round(squareRoot)) != 0);

        return squareRoot;
    }

    public static boolean noDecimals(double n) {
        return (n % 1 == 0);
    }
}
