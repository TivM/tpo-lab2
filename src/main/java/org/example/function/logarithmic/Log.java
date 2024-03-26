package org.example.function.logarithmic;

public class Log {
    Ln ln = new Ln();

    public double calculate(int base, double x, double eps) {
        return ln.calculate(x, eps) / ln.calculate(base, eps);
    }
}
