package org.example.function.trigonometric;

public class Csc {
    Sin sin = new Sin();

    public double calculate(double x, double eps) {
        return (1 / sin.calculate(x, eps));
    }

}
