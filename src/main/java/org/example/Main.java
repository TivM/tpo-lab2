package org.example;

import org.example.csv.CsvController;


public class Main {
    public static void main(String[] args) {
        double from = -5.1;
        double to = 1.5;
        double step = 0.12;
        double eps = 0.000001;

        CsvController csvController = new CsvController(eps);

        // Function; Sin; Cos; Tan; Cot; Csc; Sec; Ln; Log2; Log3; Log5; Log10;
        csvController.saveToCsv("src/main/resources/out/function.csv", from, to, step, 0);
        csvController.saveToCsv("src/main/resources/out/sin.csv", from, to, step, 1);
        csvController.saveToCsv("src/main/resources/out/cos.csv", from, to, step, 2);
        csvController.saveToCsv("src/main/resources/out/tan.csv", from, to, step, 3);
        csvController.saveToCsv("src/main/resources/out/cot.csv", from, to, step, 4);
        csvController.saveToCsv("src/main/resources/out/csc.csv", from, to, step, 5);
        csvController.saveToCsv("src/main/resources/out/sec.csv", from, to, step, 6);
        csvController.saveToCsv("src/main/resources/out/ln.csv", from, to, step, 7);
        csvController.saveToCsv("src/main/resources/out/log2.csv", from, to, step, 8);
        csvController.saveToCsv("src/main/resources/out/log3.csv", from, to, step, 9);
        csvController.saveToCsv("src/main/resources/out/log5.csv", from, to, step, 10);
        csvController.saveToCsv("src/main/resources/out/log10.csv", from, to, step, 11);
    }
}