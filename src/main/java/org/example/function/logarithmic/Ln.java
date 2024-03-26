package org.example.function.logarithmic;

public class Ln {
    public double calculate(double x, double eps) {

        if (Double.isNaN(x) || x < 0.0) {
            return Double.NaN;
        } else if (x == Double.POSITIVE_INFINITY) {
            return Double.POSITIVE_INFINITY;
        } else if (x == 0.0) {
            return Double.NEGATIVE_INFINITY;
        }

        double current = 0;
        double prev;
        int iter = 1;

        if (Math.abs(x - 1) <= 1) {
            do {
                prev = current;
                current += ((Math.pow(-1, iter - 1) * Math.pow(x - 1, iter)) / iter);
                iter++;
            } while (eps <= Math.abs(current - prev) && iter < 100);
        } else {
            do {
                prev = current;
                current += ((Math.pow(-1, iter - 1) * Math.pow(x - 1, -iter)) / iter);
                iter++;
            } while (eps <= Math.abs(current - prev) && iter < 100);
            current += calculate(x - 1, eps);
        }

        return current;
    }
}
