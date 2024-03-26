package org.example.function.trigonometric;

public class Cot {
    Sin sin = new Sin();
    Cos cos = new Cos();

    public double calculate(double x, double eps) {
        return (cos.calculate(x, eps) / sin.calculate(x, eps));
    }
}
