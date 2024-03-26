package org.example.function.trigonometric;

public class Tan {
    Sin sin = new Sin();
    Cos cos = new Cos();

    public double calculate(double x, double eps) {
        return (sin.calculate(x, eps) / cos.calculate(x, eps));
    }

}
