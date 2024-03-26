package org.example.csv;

import org.example.function.Function;
import org.example.function.logarithmic.Ln;
import org.example.function.logarithmic.Log;
import org.example.function.trigonometric.*;

import java.io.FileWriter;
import java.io.IOException;

public class CsvController {
    double eps;

    public CsvController(double eps) {
        this.eps = eps;
    }

    Sin sin = new Sin();
    Cos cos = new Cos();
    Tan tan = new Tan();
    Cot cot = new Cot();
    Sec sec = new Sec();
    Csc csc = new Csc();

    Ln ln = new Ln();
    Log log = new Log();

    Function function = new Function();

    // Function; Sin; Cos; Tan; Cot; Csc; Sec; Ln; Log2; Log3; Log5; Log10;
    // От x до limit с шагом step
    public void saveToCsv(String filePath, double x, double limit, double step, int action) {
        try (FileWriter writer = new FileWriter(filePath, false)) {
            writer.write(toCsv(x, limit, step, action));
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public String toCsv(double x, double limit, double step, int action) {
        StringBuilder result = new StringBuilder();
        switch (action) {
            case 0:
                while (x <= limit) {
                    if (!Double.isNaN(function.calculate(x, eps)))
                        result.append(x).append(", ").append(function.calculate(x, eps)).append("\n");
                    x += step;
                }
                break;
            case 1:
                while (x <= limit) {
                    if (!Double.isNaN(sin.calculate(x, eps)))
                        result.append(x).append(", ").append(sin.calculate(x, eps)).append("\n");
                    x += step;
                }
                break;
            case 2:
                while (x <= limit) {
                    if (!Double.isNaN(cos.calculate(x, eps)))
                        result.append(x).append(", ").append(cos.calculate(x, eps)).append("\n");
                    x += step;
                }
                break;
            case 3:
                while (x <= limit) {
                    if (!Double.isNaN(tan.calculate(x, eps)))
                        result.append(x).append(", ").append(tan.calculate(x, eps)).append("\n");
                    x += step;
                }
                break;
            case 4:
                while (x <= limit) {
                    if (!Double.isNaN(cot.calculate(x, eps)))
                        result.append(x).append(", ").append(cot.calculate(x, eps)).append("\n");
                    x += step;
                }
                break;
            case 5:
                while (x <= limit) {
                    if (!Double.isNaN(csc.calculate(x, eps)))
                        result.append(x).append(", ").append(csc.calculate(x, eps)).append("\n");
                    x += step;
                }
                break;
            case 6:
                while (x <= limit) {
                    if (!Double.isNaN(sec.calculate(x, eps)))
                        result.append(x).append(", ").append(sec.calculate(x, eps)).append("\n");
                    x += step;
                }
                break;
            case 7:
                while (x <= limit) {
                    if (!Double.isNaN(ln.calculate(x, eps)))
                        result.append(x).append(", ").append(ln.calculate(x, eps)).append("\n");
                    x += step;
                }
                break;
            case 8:
                while (x <= limit) {
                    if (!Double.isNaN(log.calculate(2, x, eps)))
                        result.append(x).append(", ").append(log.calculate(2, x, eps)).append("\n");
                    x += step;
                }
                break;
            case 9:
                while (x <= limit) {
                    if (!Double.isNaN(log.calculate(3, x, eps)))
                        result.append(x).append(", ").append(log.calculate(3, x, eps)).append("\n");
                    x += step;
                }
                break;
            case 10:
                while (x <= limit) {
                    if (!Double.isNaN(log.calculate(5, x, eps)))
                        result.append(x).append(", ").append(log.calculate(5, x, eps)).append("\n");
                    x += step;
                }
                break;
            case 11:
                while (x <= limit) {
                    if (!Double.isNaN(log.calculate(10, x, eps)))
                        result.append(x).append(", ").append(log.calculate(10, x, eps)).append("\n");
                    x += step;
                }
                break;
        }
        return result.toString();
    }
}
