package Calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("Введите x и y (либо q для выхода):");
            try {
                String input_x = reader.readLine();
                if (input_x.equals("q")) {
                    break;
                }
                int x = Integer.parseInt(input_x);
                String input_y = reader.readLine();
                int y = Integer.parseInt(input_y);

                calc.SumTwoNumbers(x, y);
            }
            catch (IOException e) {
                System.out.println("Произошла ошибка ввода/вывода: " + e.getMessage());
            }
        } while (true);
    }
}