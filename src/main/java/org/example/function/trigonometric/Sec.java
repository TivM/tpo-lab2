package org.example.function.trigonometric;

public class Sec {
    Cos cos = new Cos();

    public double calculate(double x, double eps) {
        return (1 / cos.calculate(x, eps));
    }
}
