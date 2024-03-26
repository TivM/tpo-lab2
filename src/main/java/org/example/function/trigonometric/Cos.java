package org.example.function.trigonometric;

public class Cos {
    Sin sin = new Sin();

    public double calculate(double x, double eps) {

        if (x >= 0) {
            int times = (int) (x/(Math.PI * 2));
            x -= times*Math.PI * 2;
        } else if (x < 0) {
            int times = (int) (Math.abs(x)/(Math.PI * 2));
            x += times*Math.PI * 2;
        }

        double result = Math.sqrt(1 - sin.calculate(x, eps) * sin.calculate(x, eps));

        if (((x > Math.PI / 2) && (x < 3 * Math.PI / 2)) || ((x < -Math.PI / 2) && (x > -3 * Math.PI / 2))) {
            result *= -1;
        }

        if (Math.abs(result) > 1) return Double.NaN;
        if (Math.abs(result) <= eps) return 0;

        return result;
    }
}
