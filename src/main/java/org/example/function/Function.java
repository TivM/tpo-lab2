package org.example.function;

import org.example.function.logarithmic.Ln;
import org.example.function.logarithmic.Log;
import org.example.function.trigonometric.*;

public class Function {

    Sin sin;
    Cos cos;
    Tan tan;
    Cot cot;
    Sec sec;
    Csc csc;

    Ln ln;
    Log log;

    public Function() {
        this.sin = new Sin();
        this.cos = new Cos();
        this.tan = new Tan();
        this.cot = new Cot();
        this.sec = new Sec();
        this.csc = new Csc();

        this.ln = new Ln();
        this.log = new Log();
    }

    public Function(Sin sinF, Cos cosF, Tan tanF, Cot cotF, Sec secF, Csc cscF,
                    Ln lnF, Log logF) {
        this.sin = sinF;
        this.cos = cosF;
        this.tan = tanF;
        this.cot = cotF;
        this.sec = secF;
        this.csc = cscF;

        this.ln = lnF;
        this.log = logF;
    }

    public double calculate(double x, double eps) {
        double result;

        if (x <= 0) {

            result = (Math.pow((((sin.calculate(x, eps) * sec.calculate(x, eps)) + tan.calculate(x, eps)) - tan.calculate(x, eps)), 2)
                    + (((sin.calculate(x, eps) / sec.calculate(x, eps)) + cot.calculate(x, eps)) * ((sin.calculate(x, eps)
                            - (tan.calculate(x, eps) + csc.calculate(x, eps)))
                            * (tan.calculate(x, eps) / (cos.calculate(x, eps) - sin.calculate(x, eps))))));

        } else {

            result = Math.pow((((Math.pow(log.calculate(2, x, eps), 3) - log.calculate(2, x, eps)) / log.calculate(10, x, eps))
                    + ((log.calculate(2, x, eps) - (log.calculate(5, x, eps) / log.calculate(2, x, eps))) * log.calculate(10, x, eps))), 3);

        }

        return result;
    }
}
