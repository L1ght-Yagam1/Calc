package Calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("Введите знак (либо q для выхода):");
            try {
                String sign = reader.readLine();
                if (sign.equals("q")) {
                    break;
                }
                System.out.println("Введите знак x и y:");
                String input_x = reader.readLine();
                int x = Integer.parseInt(input_x);
                String input_y = reader.readLine();
                int y = Integer.parseInt(input_y);

                calc.GetResult(sign, x, y);
            }
            catch (IOException e) {
                System.out.println("Произошла ошибка ввода/вывода: " + e.getMessage());
            }
        } while (true);
    }
}