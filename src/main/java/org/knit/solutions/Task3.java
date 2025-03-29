package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.lab1.Calculator;

import java.util.Scanner;

@TaskDescription(taskNumber = 3, taskDescription = "Реализовать калькулятор", href = "org/knit/solutions/taskExampleClasses/README.md")
public class Task3 implements Solution {
    @Override
    public void execute() {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            double first_number = 0;
            System.out.print("Введите первое число (Для выхода из программы введите \"exit\": ");
            String input = scanner.next();
            if (input.equals("exit")) {
                System.out.println("Завершение программы.");
                System.exit(0);
            } else {
                first_number = Double.parseDouble(input);
            }

            System.out.print("Введите оператор (+, -, *, /): ");
            String operator = scanner.next();

            System.out.print("Введите второе число: ");
            double second_number = scanner.nextDouble();

            Calculator Calc = new Calculator();

            switch (operator) {
                case "+":
                    Calc.add(first_number, second_number);
                    break;
                case "-":
                    Calc.subtract(first_number, second_number);
                    break;
                case "*":
                    Calc.multiply(first_number, second_number);
                    break;
                case "/":
                    if (second_number != 0) {
                        Calc.divide(first_number, second_number);
                    } else {
                        System.out.println("Деление на 0! Введите другое число.");
                    }
                    break;
                default:
                    System.out.println("Введён неизвестный оператор!");
            }
        }

    }
}


