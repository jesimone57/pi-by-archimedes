package com.jesimone57;

import static java.lang.Math.*;

/**
 *  Approximating the value of pi using Archimedes algorithm
 * ref see https://www.youtube.com/watch?v=_rJdkhlWZVQ
 */
public class App {

    private static final double R = 1.0d;

    public static void main(String[] args) {
        double x = R;
        long sides = 6;
        for (int iteration = 1; iteration<30 ; iteration++) {
            double piApproximate = (x * sides)/2;
            System.out.println(String.format("iter=%d   sides=%d  pi approx %s    error = %s", iteration, sides, piApproximate, piApproximate-PI));
            double a = sqrt(1.0 - pow(x/2, 2));
            double b = 1 - a;
            x = sqrt( pow(x/2, 2) + pow(b, 2) );
            sides = sides * 2;
        }
    }
}
