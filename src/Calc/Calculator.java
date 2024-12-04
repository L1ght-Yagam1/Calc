package Calc;

public class Calculator {

    private double SumTwoNumbers(double x, double y) {
        return x + y;
    }

    private double DiffTwoNumbers(double x, double y) {
        return x - y;
    }

    void GetResult(String sign, double x, double y) {
        switch (sign) {
            case "+":
                System.out.println("Sum Two Numbers: " + SumTwoNumbers(x, y));
                break;
            case "-":
                System.out.println("Diff Two Numbers: " + DiffTwoNumbers(x, y));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + sign);
        }
    }
}